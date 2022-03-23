package view;

import java.util.ArrayList;
import java.util.Scanner;

import dept.DepartmentDTO;
import emp.EmployeeDAO;

public class DepartmentList {
	public void display(Scanner sc) {
		System.out.println("[부서목록화면]");
		System.out.println("부서코드\t부서명");
		
		//DB연결
		EmployeeDAO dao = new EmployeeDAO();
		//조회할 부서목록정보를 화면에 출력
//		ArrayList<DepartmentDTO> list = dao.departmentList();
		ArrayList<DepartmentDTO> list = dao.departmentListCursor();
		for(DepartmentDTO dto: list) {
			System.out.printf("%d \t",dto.getDepartment_id());
			System.out.printf("%s \n",dto.getDepartment_name());
		}
		System.out.println("-------------------------------");
		System.out.println("1.홈으로 2.부서상세목록  0.종료");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			new EmployeeHome(sc);
			break;
		
		case 2:
			System.out.println("조회할 부서코드: ");
			EmployeeList empList = new EmployeeList();
			empList.display(sc,sc.nextInt());
			break;
		case 0:
			System.exit(0);
			break;
			
		}
		
	}
}
