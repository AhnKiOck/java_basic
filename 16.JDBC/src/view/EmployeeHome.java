package view;

import java.util.Scanner;

//사원관리 홈 화면
public class EmployeeHome {
	EmployeeHome(Scanner sc) {
		System.out.println("1.사원목록화면 2.부서목록화면 3.직업목록화면 0.종료");
		System.out.println("선택: ");
		int menu = sc.nextInt();
		if (menu == 1) {
			EmployeeList empList = new EmployeeList();
			empList.display(sc);
		} else if (menu == 2) {
			DepartmentList deptList = new DepartmentList();
			deptList.display(sc);
		} else if (menu == 3) {
			JobList jobList = new JobList();
			jobList.display(sc);
		} else if (menu == 0) {
			System.exit(0);
		}
	}
}
