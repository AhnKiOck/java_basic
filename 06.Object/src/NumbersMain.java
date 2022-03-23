
public class NumbersMain {
	public static void main(String[] args) {
		
		int arr[] = { 10, 20, 30, 40 };
		Numbers n = new Numbers( arr );
		int total = n.getTotal();
		System.out.println("합계: " + total);
		double avg = n.getAverage();
		System.out.println("평균: " + avg);
		
		//int nums[] = {};
		int nums[] = new int[0];
		Numbers n2 = new Numbers( nums );
		total = n2.getTotal();
		System.out.println("합계: " + total);
		
		//예외가 발생할 만한 지점을  try 블럭으로
		//발생한 예외를 처리할  catch 블럭
		//예외발생 유무와 관계없이 처리할 부분  finally - 생략가능
		try {
			avg = n2.getAverage();
			System.out.println("평균: " + avg);
		}catch( java.lang.ArithmeticException e ) {
			System.out.println(e.getMessage() + ": 0으로 나눌수 없음 ");
		}finally {
		}
		
	}
}
