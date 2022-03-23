
public class VariableRange {
	int value2;
	public static void main(String[] a) {
		//변수의 유효범위
		//지역변수(로컬변수:local)
		//모든 데이터들은 프로그램 실행시에 메모리에 존재하나,
		//프로그램이 종료되면 메모리에서 사라진다
		int no1 = 10;
		{
			System.out.println( "1. no1: " + no1 );
		}
		{
			int no2 = 20;
			System.out.println( "2. no1: " + no1);
			System.out.println( "1. no2: " + no2);
		}
		System.out.println( "3. no1: " + no1);
		//System.out.println( "2. no2: " + no2); //사용불가
		
		int value1 = 5;
		int value2 = 5;
		if( value1 > 1 ) {
			value2 = value1 + 10;
			System.out.println("value1 : " + value1 );
			System.out.println("value2 : " + value2 );
		}
		System.out.println("value1 : " + value1 );
		//System.out.println("value2 : " + value2 ); //사용불가
		
		
		//짝수/홀수 를 판단해서 문자열로 출력
		int no = 5;
		if( no % 2 == 0 ) {
			System.out.println( no + ": 짝수");
		}else {
			System.out.println( no + ": 홀수");
		}
		//문자열을 담을 변수
		char ch; // ''
		String result; // ""
		if( no % 2 == 0 ) {
			result = "짝수";
		}else  {
			result = "홀수";
		}
		System.out.println( no + ": " + result);
				
	}//main 끝
}//class 끝
