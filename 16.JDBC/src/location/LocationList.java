package location;

import java.util.Scanner;

import jobs.EmployeeHome;

public class LocationList {
	public void display(Scanner sc,int emp_id) {
		System.out.println("["+emp_id+"]번 위치목록정보");

		LocationDAO dao = new LocationDAO();
		LocationDTO dto = dao.locationList(emp_id);
		
		if(dto == null)	{
			System.out.println("해당 사번의 사원정보가 없습니다.");
		}else {
			System.out.println("위치코드: "+dto.getLocation_id());
			System.out.println("부서주소: "+dto.getStreet_address());
			System.out.println("우편번호: "+dto.getPostal_code());
			System.out.println("도시명  :"+dto.getCity());
			System.out.println("주    :"+dto.getState_province());
			System.out.println("나라코드:"+dto.getCountry_id());
		}
		System.out.println("-----------------------------");
		System.out.println("1.홈으로  0.종료");
		int menu = sc.nextInt();
		if(menu ==1) {
			new EmployeeHome(sc);
			
		}else if(menu == 0) {
			System.exit(0);
		}else {
			new EmployeeHome(sc);
		}
	}
}
