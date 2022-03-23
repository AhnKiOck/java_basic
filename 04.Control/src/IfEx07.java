import java.util.Scanner;

public class IfEx07 {
	public static void main(String[] args) {
//		2. 키보드로 입력한 시험성적에 따라 학점을 출력하는 프로그램을 작성하세요.
//		   90점 이상 A학점, 80점 이상 B학점, 70점 이상 C학점, 60점 이상 D학점 그 외는 F학점.
//		     이 때 학점은 char 타입의 변수를 선언하고, 해당 변수에 학점을 대입하도록 한다.
//		     출력예) 73 점은 C학점.
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		char grade;
		char level;
		if( score >= 90 ) {
			grade = 'A'; 
		}else if( score >= 80 ) {
			grade = 'B'; 
		}else if( score >= 70 ) {
			grade = 'C'; 
		}else if( score >= 60 ) {
			grade = 'D';
//		}else if( score < 60 ) {
		}else {
			grade = 'F';
		}
		System.out.printf( "성적 %d점은 %c학점 \n", score, grade );
		
		sc.close();
		
//		3. 2번 프로그램에 연결해서
//		      학점에 대해 상중하 레벨을 출력하는 프로그램을 작성하세요.
//		   A, B 학점은 상      
//		   C, D 학점은 중
//		     그 외는 하 로 출력한다.
//		     출력예) B 학점은 레벨 상  
		if( grade=='A' || grade=='B' ) {
			level = '상';
		}else if( grade=='C' || grade=='D' ) {
			level = '중';
		} else /* if( grade=='F' ) */ {
			level = '하';
		}
		System.out.println(grade + "학점을 레벨 "+ level);
		
   	}//main 끝
}
