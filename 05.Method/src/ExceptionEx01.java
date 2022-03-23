
public class ExceptionEx01 {
	public static void main(String[] args) {
		//나눗셈연산하기
		int no1, no2, result;
		no1 = 3;
		no2 = 2;
		result = no1 / no2;
		System.out.printf("%d / %d 의 몫: %d \n", no1, no2, result);
		
		no1 = 10;
		no2 = 0;
		try{
			result = no1 / no2;
			System.out.printf("%d / %d 의 몫: %d \n", no1, no2, result);
		}catch( java.lang.ArithmeticException err ) {
			System.out.println(err.getMessage());
			System.out.println("숫자는 0으로 나눌수 없다");
		}finally {
			System.out.println("Finished");
		}
		
		
		
		
		
		
	}
}
