package jobs;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사원관리 홈화면
		new EmployeeHome(sc);
		
		
		
		sc.close();
		
	}
}
