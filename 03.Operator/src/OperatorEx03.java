
public class OperatorEx03 {
	public static void main(String[] args) {
		//논리연산자
		//1.AND연산자
		System.out.println( 10 > 5 && 20 > 5 ); //T && T : T
		System.out.println( 10 > 5 && 20 < 5 ); //T && F : F
		System.out.println( 10 < 5 && 20 < 5 ); //F && F : F
		System.out.println( 10 < 5 && 20 > 5 ); //F && T : F
		
		//2.OR연산자
		System.out.println( 10 > 5 || 20 > 5 ); //T || T : T
		System.out.println( 10 > 5 || 20 < 5 ); //T || F : T
		System.out.println( 10 < 5 || 20 < 5 ); //F || F : F
		System.out.println( 10 < 5 || 20 > 5 ); //F || T : T
		
		//3.NOT연산자
		boolean ateLunch = true;
		System.out.println("점심식사를 했나? " + ateLunch);
		System.out.println("점심식사를 했나? " + !ateLunch);
		
		boolean ateDinner = false;
		System.out.println("저녁식사를 했나? " + ateDinner);
		System.out.println("저녁식사를 했나? " + !ateDinner);
		
		int no1 = 5, no2 = 2, no3 = 5, no4 = 10;
		// ( no1 == no2 || no1 == no3 ) && !(no3 > no4)
		//  ( 5==2 || 5==5 ) && !(5 > 10)
		//     ( F || T )    && !F
		//          T        && T
		//                   T
		System.out.println(
			( no1 == no2 || no1 == no3 ) && !(no3 > no4)  );
		
		//복합대입연산자
		no1 = 29;
		no1 -= 2 + 3 * 4 + no2 * no3;
		// no1 = no1 - (2+3*4 + no2 * no3); //29-14:15
		System.out.println( no1 );
		
		//삼항연산자
		//a ? b : c
		int no = 10;
		System.out.println( "no==10 ? " + (no==10 ? true : false) );
		
		int dadAge = 45, momAge = 47;
		System.out.println(
			"아빠나이가 엄마나이보다 많나? " + (dadAge > momAge ? "T" : "F") );
		
		//시험성적은 60 점이상  Pass, 60점미만 Fail
		int score = 70;
		System.out.printf(
			"시험성적 %d점은  %s \n", score, ( score >= 60 ? "Pass" : "Fail")  );
		System.out.printf(
			"시험성적 %d점은  %s \n", score
					, ( score < 60 ? "Fail" : "Pass")  );
		
		score = 59;
		System.out.printf(
			"시험성적 %d점은  %s \n", score, ( score >= 60 ? "Pass" : "Fail")  );
		
		System.out.printf(
			"시험성적 %d점은  %s \n", score, ( score < 60 ? "Fail" : "Pass")  );
		
		//직접코드실습
		//1. 변수선언해서 양의 정수를 담는다 예)13
		//2. 변수의 데이터가 짝수인지 홀수인지 판단해서 출력하는 명령문을 작성하세요.
		//   13 : 홀수
		//   4 : 짝수
		// 1, 3, 5, ...
		// 0, 2, 4, ...
//		int value;
//		value = 13;
		//짝수/홀수를 판단 : 어떤 수를 2 로 나눈 나머지가 0: 짝수, 1: 홀수
		int value = 14;
		System.out.println("13: 홀수");
		System.out.println( 
			value + ": " + ( value % 2 == 0 ? "짝수" : "홀수") );
		
		value = 7;
		System.out.println( 
				value + ": " + ( value % 2 == 0 ? "짝수" : "홀수") );
		//출력문format 시 정수%d, 실수:%f, 문자:%c, 문자열:%s
		System.out.printf(
			"%d: %s \n", value, ( value % 2 == 1 ? "홀수" : "짝수") );
		System.out.println("---------");
		
		
	}
}
