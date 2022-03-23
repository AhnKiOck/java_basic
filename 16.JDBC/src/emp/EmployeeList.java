package emp;

import java.util.ArrayList;
//사원목록화면
public class EmployeeList {
	public static void main(String[] args) {
		System.out.println("[사원목록화면]");
		System.out.println("사번\t성명\t\t\t업무코드\t\t부서명\t\t\t입사일자");
		
		//DB연결
		EmployeeDAO dao = new EmployeeDAO();
		
		//DB에서 조회한 데이터를 화면에 출력
		ArrayList<EmployeeDTO> list =dao.employeeList();
		for(EmployeeDTO dto:list) {
			System.out.printf("%d \t",dto.getEmployee_id());
			System.out.printf("%-20s \t",dto.getLast_name()+" "+dto.getFirst_name());
			System.out.printf("%-10s \t",dto.getJob_id());
			System.out.printf("%-15s \t",dto.getDepartment_name());
			System.out.printf("%s \n",dto.getHire_date());
		}
		
	}
}
