import java.util.Scanner;

public class SwitchEx04 {
	public static void main(String[] args) {
		//1 ~ 12월
		//1분기: 1,2,3
		//2분기: 4,5,6
		//3분기: 7,8,9
		//4분기: 10,11,12
		//1 ~ 12 사이의 숫자를 키보드로 입력해서 몇분기 인지 출력하는  switch 문
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월인가요?");
		int month = sc.nextInt();
		//출력 예) 2월은 1분기 
		switch( month ) {
		case 1:	case 2:	case 3:
			System.out.println( month + "월은 1분기" );
			break;
		case 4:	case 5:	case 6:
			System.out.println( month + "월은 2분기" );
			break;
		case 7:	case 8:	case 9:
			System.out.println( month + "월은 3분기" );
			break;
		case 10:
		case 11:
		case 12:
			System.out.println( month + "월은 4분기" );
			break;
		}
		
		
		sc.close();
	}//main 끝
}
