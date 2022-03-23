import java.util.Scanner;

public class IfEx06 {
	public static void main(String[] args) {
//		1. 키보드로 입력한 정수에 대해 양의 정수, 음의 정수, 0 를 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
//		int no;
//		no = sc.nextInt(); //입력한 수를 읽어들여서(스캔해서) 변수에 담는다
		int no = sc.nextInt();
		String result /* = "" */;
		if( no > 0 ) {
			result = "양의 정수";
		}else if( no == 0 ) {
			result = "0";
		}else { // if( no < 0 ) {
			result = "음의 정수";
		}
		System.out.println( no + "는 " + result );
		
		/*
		if( no > 0 ) {
			System.out.println(no + "는 양의 정수");
		}else if( no < 0 ) {
			System.out.println(no + "는 음의 정수");
		}else if( no == 0 ) {
			System.out.println(no + "는 0");
		}
		*/
		
		
		
		
		sc.close();
	}
}
