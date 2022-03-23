
public class WhileEx02 {
	public static void main(String[] args) {
		//직접코드실습
		//1. 구구단 7단을 다음과 같이 출력되도록  while문으로 작성
		// 7 * 1 = 7 
		// 7 * 2 = 14 
		// ...
		// 7 * 9 = 63 
		int no = 1;
		while( no <= 9 ) { //no < 10
			System.out.println("7 * "+ no + " = " + 7*no );
			no++;
		}
		
		
		//2. 1~100까지의 합을 구해 다음과 같이 출력되도록  while문으로 작성
		// 1부터 100까지의 합은 5050.
		// 1+2+3+ ...+99+100
		no = 1;
		int sum = 0;
		while( no <= 100 ) { //no < 101
			//sum = sum + no;
			sum += no;
			//System.out.println("1부터 "+ no +"까지의 합은 " + sum);
			no++;
		}
		System.out.println("1부터 100까지의 합은 " + sum);
	}
}
