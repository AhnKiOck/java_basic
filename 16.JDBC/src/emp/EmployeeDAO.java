package emp;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

import dept.DepartmentDTO;
import model.JobDTO;
import oracle.jdbc.OracleTypes;

//DB연결과 관련된 처리를 하는 클래스 DAO
//DAO(Data Access Object)

//사원전체 목록조

public class EmployeeDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private CallableStatement cs;
	//사원의 부서명 리턴하는 메소드
	public String department_name(int employee_id) {
		String dname = null;
		String sql = "{? = call fn_department_name(?)}";
		
		try {
			cs = conn.prepareCall(sql);
			cs.setInt(2,employee_id);
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.execute();
			dname = cs.getString(1);
			//첫번째 물음표에 담긴 반환데이터를 dname에 담는다.
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return dname;
	}
	//급여를 지정한 %만큼 변경하는처리의 메소드 호출
	public void updateSalary(int employee_id,int pct) {
		String url = "{call pro_update_salary(?,?)}";
		try{
			 cs = conn.prepareCall(url);
			 cs.setInt(1, employee_id);
			 cs.setInt(2, pct);
			 cs.execute();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
	}
	//직무 목록 조회
	public ArrayList<JobDTO> jobList(){
		ArrayList<JobDTO> list = new ArrayList<JobDTO>();
		String sql = "select job_id,job_title from jobs order by job_id";
		
		try {
			ps = conn.prepareStatement(sql);
			//?가 없으므로 ps에 set할 데이터는 없다.
			rs = ps.executeQuery();
			while(rs.next()) {
				JobDTO dto = new JobDTO();
				dto.setJob_id(rs.getString("job_id"));
				dto.setJob_title(rs.getString("job_title"));
				list.add(dto);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return list;
	}
	//특정 사번 사원의 정보 조회
	public EmployeeDTO employeeDetailCursor(int employee_id) {
		EmployeeDTO dto = null;
		String sql= "{call curor_employee_detail(?,?)}";
		try {
			cs = conn.prepareCall(sql);
			cs.setInt(1, employee_id);
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.execute();
			rs = (ResultSet)cs.getObject(2);
			if(rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone_number(rs.getString("phone_number"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				dto.setDepartment_name(rs.getString("department_name"));
			
			
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
			
		}
		return dto;
	}
	//특정부서에 소속된 사원목록 조회
	public ArrayList<EmployeeDTO> employeeList(int department_id){
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		String sql = "select employee_id, last_name||' '||first_name name,job_id,department_name,hire_date "
				+ "from employees left outer join departments d using(department_id)"
				+ (department_id ==0 ? "where department_id is null ":" where department_id = ? ")
				+ "order by employee_id";
		try {
			ps = conn.prepareStatement(sql);
			//is null인경우는 ?가 없으므로
			//ps에 set 할 데이터가 없다.
			if(department_id!=0) {
			ps.setInt(1, department_id);
			}
			rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setName(rs.getString("name"));
				dto.setJob_id(rs.getString("job_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setHire_date(rs.getDate("hire_date"));
				list.add(dto);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return list;
	}
	//커서로 부서목록조회
	public ArrayList<DepartmentDTO> departmentListCursor(){
		ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
			String sql = " {?=call fn_cursor_dept_list}";	
		try {
			cs = conn.prepareCall(sql);
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.execute();
			rs = (ResultSet)cs.getObject(1);
			while(rs.next()) {
				DepartmentDTO dto = new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				list.add(dto);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return list;
	}
	//부서목록 조회
	public ArrayList<DepartmentDTO> departmentList() {
		String sql = "select nvl(department_id,0) department_id,nvl(department_name,'기타') department_name "
				+ "from departments d right outer join "
				+ "(select distinct department_id from employees) e using(department_id)"
				+ " order by 1";
		ArrayList<DepartmentDTO> list = new ArrayList<DepartmentDTO>();
	try {
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartment_id(rs.getInt("department_id"));
			dto.setDepartment_name(rs.getString("department_name"));
			list.add(dto);
			
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}finally {
		disconnect();
	}
	return list;
	}
	
	
	
	
	//사원전체 목록조회
	public ArrayList<EmployeeDTO> employeeList() {
		//107명의 사원정보를 담을 자료구조배열변수 선언
		ArrayList<EmployeeDTO> list =new ArrayList<EmployeeDTO>();
		String sql = "select e.*,fn_department_name(employee_id) department_name from employees e "
				+ "order by e.employee_id";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//화면에 데이터를 전달할수 있도록 DTO에 담는다.
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setFist_name(rs.getString("first_name"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setJob_id(rs.getString("job_id"));
				dto.setHire_date(rs.getDate("hire_date"));
				list.add(dto);
				
//				int emp_id = rs.getInt("employee_id");
//				String last_name = rs.getString("last_name"),
//						first_name =rs.getString("first_name"),
//						job_id = rs.getString("job_id"),
//						d_name = rs.getString("department_name");
//				Date hire_date =rs.getDate("hire_date");
//				System.out.printf("%d \t%-20s \t%-10s \t%-15s \t%s \n",
//						emp_id,last_name +" " +first_name,job_id,d_name,hire_date);	
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
			
		}
		return list;
	}
			
	//틀정 사번 사원의 정보조회
	public EmployeeDTO employeeDetail(int employee_id) {
		//사번,성명,이메일,전화번호,급여,커미션(%),입사일자,부서명,업무제목
		EmployeeDTO dto = null;
		String sql = "select employee_id,last_name||' '||first_name name, email"
				+ ",phone_number,salary,commission_pct*100 commission_pct"
				+ ",hire_date,department_name,job_title"
				+ " from employees e left outer join departments d using(department_id) "
				+ "inner join jobs j using(job_id) "
				+ "where employee_id = ?";
		try {
		ps = conn.prepareStatement(sql);
		ps.setInt(1, employee_id);
		rs = ps.executeQuery();
		if(rs.next()) {
			dto = new EmployeeDTO();
			dto.setEmployee_id(rs.getInt("employee_id"));
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			dto.setPhone_number(rs.getString("phone_number"));
			dto.setSalary(rs.getInt("salary"));
			dto.setCommission_pct(rs.getInt("commission_pct"));
			dto.setHire_date(rs.getDate("hire_date"));
			dto.setDepartment_name(rs.getString("department_name"));
			dto.setJob_title(rs.getString("job_title"));
		}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return dto;
	}
	
	private void disconnect() {
		if(rs != null) try{rs.close();}catch(Exception e) {}
		if(ps != null) try{ps.close();}catch(Exception e) {}
		if(conn != null) try{conn.close();}catch(Exception e) {}
		if(cs != null) try{cs.close();}catch(Exception e) {}
	}
	
	public EmployeeDAO(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr","hr");
			
			
			
		} catch (Exception e) {
		System.out.println(e.getMessage());
			
		
		
	}
}
}