package view;

import java.util.ArrayList;
import java.util.Scanner;

import emp.EmployeeDAO;
import model.JobDTO;

public class JobList {
	public void display(Scanner sc) {
		System.out.println("[직무목록화면]");
		System.out.println("직업코드\t직무제목");

		EmployeeDAO dao = new EmployeeDAO();

		ArrayList<JobDTO> list = dao.jobList();
		for (JobDTO dto : list) {
			System.out.println(dto.getJob_id() + "   " + dto.getJob_title());
		}
		System.out.println("---------------------------------------");
		System.out.println("1.홈으로  0.종료");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			new EmployeeHome(sc);
			break;
		case 0:
			System.exit(0);
			break;
		}

	}
}
