
public class MethodEx02 {
	public static void main(String[] args) {
		add(10, 2);
//		System.out.println( add(10, 2) );
		//void 인 경우 메소드 호출문 만으로 출력할 수 없다
		
		System.out.println( subtract(10, 2) );
		int no = subtract(10, 2);
		System.out.println( "no:" + no );
		
		int a = 20, b=5;
		int n1 = add(a, b);
		System.out.printf("%d + %d : %d \n", a, b, n1);

		int n2 = subtract(a, b);
		System.out.printf("%d - %d : %d \n", a, b, n2);
		
		no = subtract(n1, n2);
		System.out.printf("%d - %d : %d \n", n1, n2, no);
		
	}//main 메소드끝
	
	//메소드의 선언
	//리턴타입 메소드명(파라미터...){ }

	
	// 두 정수간의 사칙연산을 하는 메소드
	//뺄셈 메소드:   리턴타입 메소드명(){}
	//리턴타입 : 리턴할 데이터의 데이터타입
	static int subtract(int no1, int no2) {
		int result = no1 - no2;
		System.out.printf("%d - %d = %d \n", no1, no2, result);
		return result;
	}//subtract 메소드 끝
	
	//덧셈메소드
	static int add(int no1, int no2) {
		int result = no1 + no2;
		System.out.printf("%d + %d = %d \n", no1, no2, result);
		return result;
	}//add 메소드 끝
	
	
	
	
}//class 끝
