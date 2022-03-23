package jobs;

import java.util.Scanner;

import location.*;

public class EmployeeHome {
	public EmployeeHome(Scanner sc){
		System.out.println("1.업무목록화면 2.사원이 속한 위치정보  0.종료");
		System.out.println("선택:  ");
		int menu = sc.nextInt();
			
		switch (menu) {
		case 1:
			JobList jobList = new JobList();
			jobList.display(sc);
			break;
		case 2:
			System.out.println("사번을 입력하시오 ");
			LocationList loList=new LocationList();
			loList.display(sc, sc.nextInt());
			break;
		case 0:
			System.exit(0);
			break;
		}
		
	}
}
