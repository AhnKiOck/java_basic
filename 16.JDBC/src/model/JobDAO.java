package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import emp.EmployeeDTO;

public class JobDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//직무목록조회
	public ArrayList<JobDTO> jobList(){
		ArrayList<JobDTO> list = new ArrayList<JobDTO>();
		String sql = "select job_id,job_title from jobs order by job_id";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				JobDTO dto = new JobDTO();
				dto.setJob_id(rs.getNString("job_id"));
				dto.setJob_title(rs.getNString("job_title"));
				list.add(dto);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return list;
	}
	//특정직무를하고 있는 사원 조회
	public ArrayList<EmployeeDTO> jobDetail(String job_id) {
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		String sql = "select employee_id,last_name||' '||first_name name,job_id,job_title,"
				+ "department_name,salary,hire_date "
				+ "from employees e inner join jobs j using (job_id) "
				+ "left outer join departments d using (department_id) "
				+ "where job_id = ?";
//				"select job_id,employee_id,department_id,last_name||' '||first_name name, email,"
//				+ "phone_number, salary,commission_pct*100 commission_pct, hire_date"
//				+ " from employees "
//				+ "where job_id = ?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, job_id);
			rs = ps.executeQuery();
			while(rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setJob_title(rs.getString("job_title"));
				dto.setJob_id(rs.getString("job_id"));
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setDepartment_name(rs.getString("department_name"));
//				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setName(rs.getString("name"));
//				dto.setEmail(rs.getString("email"));
//				dto.setPhone_number(rs.getString("phone_number"));
				dto.setSalary(rs.getInt("salary"));
//				dto.setCommission_pct(rs.getInt("commission_pct"));
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
	public JobDAO(){
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(url,"hr","hr");
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void disconnect() {
		if(rs != null) try{rs.close();}catch(Exception e) {}
		if(ps != null) try{ps.close();}catch(Exception e) {}
		if(conn != null) try{conn.close();}catch(Exception e) {}
	}
}
