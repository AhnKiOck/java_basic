import java.util.Scanner;


public class IfEx04 {
	public static void main(String[] args) {
		
		// 점수에 대해 구간별로 출력
		int score = 93;
		if( score >= 90 ) { // 93 >= 90 : T
			System.out.println(score + " 은 90점 이상");
		}else if( score >= 80 ) {
			System.out.println(score + " 은 80점 이상");
		}else if( score >= 70 ) {
			System.out.println(score + " 은 70점 이상");
		}else if( score >= 60 ) {
			System.out.println(score + " 은 60점 이상");
		}else {
			System.out.println(score + " 은 60점 미만");
		}
		/*
		if( score < 60 ) { // 93 < 60 : F
			System.out.println(score + " 은 60점 미만");
		}else if( score >= 60 ) { // 93 >= 60 : T
			System.out.println(score + " 은 60점 이상");
		}else if( score >= 70 ) {
			System.out.println(score + " 은 70점 이상");
		}else if( score >= 80 ) {
			System.out.println(score + " 은 80점 이상");
		}else if( score >= 90 ) {
			System.out.println(score + " 은 90점 이상");
		}
		//잘못된 조건식 순서
		*/
		
		//주민등록번호 상에 성별을 구분하는 코드는 남성:1,3  여성:2,4
		//입력한 성별코드를 판단해서 남성인지 여성인지를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("성별코드를 입력하세요");
		int gender = sc.nextInt();
		if( gender==1 ||  gender==3 ) {
			System.out.println("남성");
		} else if ( gender==2 || gender==4 )  {
			System.out.println("여성");
		} else {
			System.out.println("성별코드 입력오류");
		}
		
		sc.close();
		
	}//main 끝
}//class 끝
