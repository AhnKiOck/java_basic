
public class MethodEx01 {
	
	
	public static void main(String[] args) {
		
//		int total=0;
//		total = total + 100;
		
		//public : 접근제한자(접근제어자) - 접근에 있어서 제한이 없는 키워드
		//static : 지정예약어
		//void : 리턴타입
		//       메소드가 기능을 모두 끝낸 후 어떤 결과값을 리턴해 줄때
		//       리턴하는 데이터의 타입을 쓰는데 
		//       void 는 결과값을 리턴하지 않는 경우 리턴할 값이 없다 는 의미
		//main(매개변수 선언) : 메소드명(파라미터) 
		//       파라미터 는 있을 수도 있고 없을 수도 있다
		
		//메소드의 선언
		//리턴타입 메소드명(파라미터...){ }
		
		//중복된 코드를 선언하지 않는 형태로 코드한다.
		
		//Hello 라는 문자열을 출력
//		System.out.println("**********");
		//*을 10개 출력
//		for(int no=1; no<=10; no++) {
//			System.out.print("*");
//		}
//		System.out.println();
		//메소드 호출문
		printChar();
		System.out.println("Hello");
		printChar();
		
//		System.out.println("**********");
//		for(int no=1; no<=10; no++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		System.out.println();
		
//		for(int no=1; no<=10; no++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		printChar();
//		printString("#");
		printCharCount('%', 5);
		System.out.println("반갑습니다");
		printString("$");
//		printChar();
//		for(int no=1; no<=10; no++) {
//			System.out.print("*");
//		}
//		System.out.println();
	}//main 메소드끝
	
	//메소드 안에 메소드를 선언할 수 없다
	//리턴타입 메소드명(){}
	// static 인 main 메소드에서 호출되는 메소드는 모두  static  으로 선언
	//파라미터 없는 메소드
	static void printChar() {
		for(int no=1; no<=10; no++) {
			System.out.print("*");
			//조건문으로 중간에 호출한 곳으로  return  할 수도 있다
			//if( no == 5 ) return;
		}
		System.out.println();
		//return; //void 인 경우 생략 가능
	}//printChar 메소드 끝
	
	//파라미터 한 개인 메소드
	static void printString(String str) {
		for( int i=1; i<=10; i++ ) {
			System.out.print( str );
		}
		System.out.println();
		printChar();
		System.out.println();
	}// printString 메소드 끝
	
	//파라미터 두 개인 메소드
	static void printCharCount(char ch, int no) {
		//별 10개 출력
		for( int i=1; i<=no; i++ ) {
			System.out.print( ch );
		}
		System.out.println();
	}//printCharCount 메소드 끝
	
	
	
	
}//class 끝
