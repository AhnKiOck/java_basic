
public class CharEx1 {
	//프로그램실행의 시작점: main
	public static void main(String[] args) {
		//문자변수 선언: 문자 데이터의 표현: ''
		//문자열 데이터의 표현: ""
		char ch1 = 'A';
		System.out.println( ch1 );
		//문자를 숫자로 변환:  문자 -> 숫자로 표현하려면  
		//데이터타입을 변환하는 형변환 연산자
		System.out.println( (int)ch1 );

		ch1 = 'a';
		System.out.println( (int)ch1 );
		
		char ch2 = '가';
		System.out.println( ch2 );
		System.out.println( (int)ch2 );
		
		//문자열의 데이터타입 :  데이터의 표현을 "" : String
		System.out.println( "Hello~" );
		String str = "안녕하세요~";
		System.out.println( str );
		
		//ctrl+alt+방향키 : 블럭설정된 라인들 복사해서 붙여넣기
		str = "가";
		System.out.println( str );
		
		//문자 자체가 아니라 특정기호로 인식하게 하려면 escape 문자(\) 를 사용한다
		//tab(\t), enter(\n), "(\")
		System.out.println( "여러분~ \t반갑습니다" );
		System.out.println( "여러분~ \n반갑습니다" );
		System.out.println( "\"여러분~ 반갑습니다\"" );
		//여러분~ 반갑습니다   "여러분~ 반갑습니다"
		
	}
}
