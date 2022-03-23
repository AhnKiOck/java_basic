package jobs;

import java.util.ArrayList;
import java.util.Scanner;

import emp.EmployeeDTO;
import model.JobDAO;

public class JobDetail {
	public void display(Scanner sc,String job_id) {
		System.out.println("["+job_id+"] 직무 내 사원목록");
		System.out.println("사번\t성명\t\t\t업무코드\t\t엄부제목\t\t\t부서명\t\t\t급여\t입사일자");
		JobDAO dao = new JobDAO();
		ArrayList<EmployeeDTO> list = dao.jobDetail(job_id);
		
		for(EmployeeDTO dto : list	) {
			System.out.printf("%d\t %-20s\t %-10s\t %-20s\t %-15s\t %d\t %s\t \n"
					,dto.getEmployee_id(),dto.getName(),dto.getJob_id(),dto.getJob_title()
			,dto.getDepartment_name(),dto.getSalary() , dto.getHire_date());
		}
		System.out.println("-----------------------------------------");
		System.out.println("1.홈으로 0.종료");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			new EmployeeHome(sc);
			break;
		case 0:
			System.exit(0);
			break;
			
		}
	}
}
