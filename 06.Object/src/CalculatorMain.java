
public class CalculatorMain {
	public static void main(String[] args) {
		int n1 = 40, n2 = 3;
		int result = Calculator.add(n1, n2);
		System.out.printf("%d + %d = %d \n", n1, n2, result);
		
		System.out.printf("%d - %d = %d \n"
						, n1, n2, Calculator.subtract(n1, n2));
		
		System.out.printf("%d * %d = %d \n"
				, n1, n2, Calculator.multiply(n1, n2));
		try {
			System.out.printf("%d / %d = %d \n"
					, n1, n2, Calculator.divide(n1, n2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		n2 = 0;
		try {
			System.out.printf("%d / %d = %d \n"
					, n1, n2, Calculator.divide(n1, n2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
