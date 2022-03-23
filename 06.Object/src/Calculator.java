//계산기
public class Calculator {
	//사칙연산
	static int add(int no1, int no2) {
		int result = no1 + no2;
		return result;
	}
	
	static int subtract(int no1, int no2) {
		return no1 - no2;
	}
	
	static int multiply(int no1, int no2) {
		return no1 * no2;
	}
	
	static int divide(int no1, int no2) throws Exception {
		int result = 0;
		if( no2==0) throw new Exception("0으로 나눌 수 없습니다");
		result = no1 / no2;
		
//		try {
//			result = no1 / no2;
//		}catch(java.lang.ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		return result;
	}
	
	
	
}
