
public class OperatorEx04 {
	public static void main(String[] args) {
		//성적이 80점이상이면 상, 그 외는 하로 삼항연산자를 사용해 출력
//		int score; //변수선언문
//		score = 80;//대입문 - 초기화
		int score = 63; //초기화하면서 변수선언: 초기화변수선언문
		System.out.println( 
			score + "점은 " + (score >= 80 ? "상" : "하" ) );

		//'': 문자 , "": 문자열
		score = 70;
		System.out.printf(
			"%d점은 %s \n", score, (score < 80 ? "하" : "상" ) );
		
		//성적이  80점 이상이면 상, 60점 이상이면 중, 그 외는 하 로 출력
		char level;
		level = score >= 80 ? '상' : (score >= 60 ? '중' : '하');
		System.out.printf("%d점은 %c \n", score, level);
		
		//직접코드실습
		//성적에 따른 학점을 출력
		//90점 이상 A, 80점 이상 B, 70점 이상 C, 그 외는 D로 출력하세요
		//a ? b : c
		score = 63; 
		char grade;
		grade = score >= 90 ? 'A' 
				: (score >= 80 ? 'B' : (score >= 70 ? 'C' : 'D') ) ;
		System.out.printf("성적 %d점은 %c학점 \n", score, grade);
		
	}
}
