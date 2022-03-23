package view;


import java.util.ArrayList;
import java.util.Scanner;

import emp.EmployeeDAO;
import emp.EmployeeDTO;
//사원목록화면
public class EmployeeList {
	public void display(Scanner sc,int department_id) {
		System.out.println("[사원목록화면]");
		System.out.println("사번\t성명\t\t\t업무코드\t\t부서명\t\t\t입사일자");
		
		EmployeeDAO dao = new EmployeeDAO();
		
		ArrayList<EmployeeDTO> list = dao.employeeList(department_id);
		for(EmployeeDTO dto : list) {
			System.out.printf("%d \t",dto.getEmployee_id());
			System.out.printf("%-20s \t",dto.getName());
			System.out.printf("%-10s \t",dto.getJob_id());
			System.out.printf("%-15s \t",dto.getDepartment_name());
			System.out.printf("%s \n",dto.getHire_date());
		}
		System.out.println("------------------------");
		System.out.println("\n 1.홈으로  2.사원상세화면 3.부서목록조회  0.종료");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			new EmployeeHome(sc);
			break;
		case 2:
			System.out.println("조회할 사번");
			EmployeeDetail detail =new EmployeeDetail();
			detail.display(sc, sc.nextInt());
			break;
		case 3:
			DepartmentList deptList = new DepartmentList();
			deptList.display(sc);
		case 0:
			System.exit(0);
			break;
		}
		
	}
	
	public void display(Scanner sc) {
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
		System.out.println("------------------------");
		System.out.println("\n 1.홈으로 2.부서목록화면 3.사원상세화면 4.직무목록화면 0.종료");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			new EmployeeHome(sc);
			break;
		case 2:
			DepartmentList deptList = new DepartmentList();
			deptList.display(sc);
			break;
		case 3:
			System.out.println("조회할 사번");
			EmployeeDetail detail =new EmployeeDetail();
			detail.display(sc, sc.nextInt());
			break;
		case 4:
			JobList jobList = new JobList();
			jobList.display(sc);
		case 0:
			System.exit(0);
			break;
		}
	}
}
