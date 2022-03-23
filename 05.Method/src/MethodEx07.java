import java.util.Scanner;
public class MethodEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수? ");
		int n1 = sc.nextInt();
		System.out.print("두번째 수? ");
		int n2 = sc.nextInt();
		
		int no[] = threeDatas(n1, n2);
		System.out.printf("%d * %d = %d \n", no[0], no[1], no[2] );
		
		/*
		int result = multiply(n1, n2);
		System.out.printf("%d * %d = %d \n"
							, n1, n2, multiply(n1, n2) );
		System.out.printf("%d * %d = %d \n"
							, n1, n2, result );
		
		double res = divide( n1, n2 );
		System.out.printf("%d / %d = %.1f \n", n1, n2, res );
		//12.32 -> 123.2 * 0.1  1.232 *10
		
		//10, 3 -> 3  ~ 10
		if( n1 > n2 ) {
			int n3 = n2;
			n2 = n1;
			n1 = n3;
		}
		result = accumulate(n1, n2);
		System.out.printf("%d ~ %d 까지의 합: %d \n", n1, n2, result );
		*/
		sc.close();
	}
	// 키보드로 두 개의 정수를 입력받아
	// 두 수간에 곱셈 연산한 결과를 리턴하는 메소드와
	static int multiply(int n1, int n2) {
//		int n3 = n1 * n2;
//		return n3;
		return n1 * n2;
	}

	//연산에 사용하는 두 정수와 곱셈연산한 결과값 총 3개의 데이터를 반환하는 메소드
	static int[] threeDatas(int n1, int n2) {
		int result = n1 * n2;
		int[] no = { n1, n2, n1 * n2 };
		//int no[] = { n1, n2, n1 * n2 };
		//no : 주소값이 있고
		//no[0] : 데이터값이 있다
		//no[1] : 데이터값이 있다
		//no[2] : 데이터값이 있다
		/*
		int no[] = new int[3];
//		int[] no = new int[3];
		no[0] = n1;
		no[1] = n2;
		no[2] = result;
		*/
		return no;
	}
	
	
	// 두 수간의 나눗셈 연산한 몫의 결과를 리턴하는 메소드를 각각 선언하고
	//        10 / 3 => 3.3 의 형태로 출력하시오
	//        10 / 4 => 2.5 
	static double divide(int n1, int n2) {
		double n3 = (double)n1 / n2;
		return n3;
	}
	
	// main 메소드에서 두 메소드를 호출하여 리턴받은 데이터를 출력하는 프로그램
	
	// 키보드로 두  정수를 입력받아 더 작은수에서 더 큰수까지의 누적합을 구하여 
	//  그 누적합의 결과를 리턴하는 메소드를 선언,
	static int accumulate(int n1, int n2) {
		//2, 50 -> 2+3+4+5 + ... 49+50
		int sum = 0;
		for(int no=n1; no<=n2; no++) {
			//sum = sum + no;
			sum += no;
		}
		return sum;
	}
	// main 메소드에서 리턴받은 데이터를 출력하는 프로그램
	
	
	
	
	
}
