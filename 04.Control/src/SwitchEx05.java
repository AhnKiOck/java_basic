import java.util.Scanner;

public class SwitchEx05 {
	public static void main(String[] args) {
		//키보드로 입력한 성적에 대해 학점을 char 타입의 변수를 선언해서 담고,
		//학점을 출력 - 출력 예) 83점은 B학점
		//90점 이상:A, 80점 이상:B, 70점 이상:C, 60점 이상:D 그 외는 F학점
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		char grade;
/*		
		if( score >= 90) {
			grade = 'A';
		}else if( score >= 80 ) {
			grade = 'B';
		}else if( score >= 70 ) {
			grade = 'C';
		}else if( score >= 60 ) {
			grade = 'D';
		}else {
			grade = 'F';
		}
*/		
		switch( score/10 ) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println( score + "점은 " + grade + "학점");
		
		//직접코드실습
		//위의 학점에 대해 상중하 레벨을 출력하는  switch  문
		//A,B 학점은  상    C,D 학점은  중      그 외는 하로 출력
		//출력 예) C학점은 레벨 중
		char level;
		switch( grade ) {
		case 'A':
		case 'B':
			level = '상';
			break;
		case 'C':
		case 'D':
			level = '중';
			break;
		default:
			level = '하';
			break;
		}
		System.out.println(grade + "학점 은 레벨 " + level);
		
		
		
		sc.close();
	}//main 끝
}
