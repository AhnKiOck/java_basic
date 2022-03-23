import java.util.Scanner;

public class OperatorEx05 {
	public static void main(String[] args) {
		//키보드로터 입력된 데이터를 스캔해서 읽어들일 수 있도록 해 본다
		Scanner sc = new Scanner( System.in );
		//성적이 90점 이상 A, 80점 이상 B, 70점 이상 C, 그 외는 D로 출력하세요
		//키보드로 입력한 숫자를 받아서 변수에 담는다.
//		System.out.println("점수를 입력하세요");
//		int score = sc.nextInt();
//		char grade;
//		grade = score >= 90 ? 'A' 
//				: (score >= 80 ? 'B' : (score >= 70 ? 'C' : 'D') );
//		System.out.printf("성적 %d점은 %c학점입니다 \n", score, grade);

		//입력한 수가 짝수인지 홀수 인지 판단해서 출력
		System.out.println("다음수는 짝수일까요? 홀수일까요?");
		int no = sc.nextInt();
		//2로 나눈 나머지가 0:짝수, 1:홀수
		String evenOdd = no % 2 == 0 ? "짝수" : "홀수";
			   evenOdd = no % 2 == 1 ? "홀수" : "짝수";
		System.out.printf("%d 은 %s입니다. \n", no, evenOdd );
		sc.close();
	}
}
