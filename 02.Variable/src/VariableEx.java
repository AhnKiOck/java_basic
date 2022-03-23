
public class VariableEx {
//	 자바프로그램 실행의 시작점: main 메소드
	public static void main(String[] args) {
		//변수 : 데이터를 담아두는 그릇
		//      담겨지는 데이터가 언제든지 바뀔수 있다
		//데이터타입: 데이터를 담는 그릇의 형태
		//변수선언문 : 변수를 선언하는 명령문
		//          데이터타입  변수명;
		//변수명 명명 규칙: 첫글자로 숫자 불가, 특수기호문자는 _ 와 $ 만 가능 
		//             자바가 이미 사용중인 키워드 불가
		// 			      보통 소문자로 시작
		
		int num1; // 변수 선언문
		// 대입문: 데이터를 담는 명령문
		num1 = 10; //대입문 : 우변의 데이터값을 좌변의 변수에 담는다
		num1 = 10 + 20;
		System.out.println(10 + 20);
		System.out.println( num1 );
		
		// 초기화 : 변수선언과 데이터를 담는 초기화를 한꺼번에 하는 형태
		int num2 = 30;
		System.out.println( num2 );
		
		int num3;
		// 변수를 사용하려면 반드시 초기화가 되어 있어야 한다.
		num3 = 5;
		System.out.println( num3 );
		
	}
}
