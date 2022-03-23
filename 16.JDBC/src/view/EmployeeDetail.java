package view;

import java.util.Scanner;

import emp.EmployeeDAO;
import emp.EmployeeDTO;

//특정사번 사원의 상세정보화면
public class EmployeeDetail {
	public void display(Scanner sc, int emp_id) {

		System.out.println("[사원정보상세화면]");
		// DB연결
		EmployeeDAO dao = new EmployeeDAO();
		//EmployeeDTO dto = dao.employeeDetail(emp_id);
		EmployeeDTO dto = dao.employeeDetailCursor(emp_id);
		if (dto == null) {
			System.out.println("해당 사번의 사원정보가 없습니다.");
		} else {
			// DB에서 입력한 사번 사원의 정보를 조회해와 화면에 출력
			System.out.printf("%-15s\t: %d\n", "사번", dto.getEmployee_id());
		System.out.printf("%-15s\t: %s\n", "성명", dto.getName());
		System.out.printf("%-15s\t: %s\n", "이메일", dto.getEmail());
		System.out.printf("%-15s\t: %s\n", "핸드폰", dto.getPhone_number());
		System.out.printf("%-15s\t: %d\n", "급여", dto.getSalary());
		System.out.printf("%-15s\t: %d\n", "커미션(%)", dto.getCommission_pct());
		System.out.printf("%-15s\t: %s\n", "입사일자", dto.getHire_date());
		System.out.printf("%-15s\t: %s\n", "부서명", dto.getDepartment_name());
		System.out.printf("%-15s\t: %s\n", "업무제목", dto.getJob_title());
		}
		System.out.println("----------------------------");
		System.out.println("\n1.사원목록 2.급여변경 3.부서명확인 0.종료");
		int menu = sc.nextInt();
		if(menu == 1) {
			new EmployeeList().display(sc);
		}else if(menu == 2) {
			System.out.println("급여 인상 몇 %?");
			int pct =sc.nextInt();
			dao= new EmployeeDAO();
			//급여를 지정한 %만큼 변경하는처리의 메소드 호출
			dao.updateSalary(dto.getEmployee_id(), pct);
			display(sc,dto.getEmployee_id());
		}else if(menu == 3) {
			//사원의 부서명 리턴하는 메소드 호출
			dao = new EmployeeDAO();
			String dname =dao.department_name(dto.getEmployee_id());
			System.out.println("부서명: " + dname);
		}
		else if(menu == 0) {
			System.exit(0);
		}
	}

}
