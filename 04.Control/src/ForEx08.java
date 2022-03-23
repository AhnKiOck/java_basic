import java.util.Scanner;

public class ForEx08 {
	public static void main(String[] args) {
		//직접코드실습
		//키보드로 숫자를 입력받아
		//구구단을 2단부터 입력받은 숫자의 단까지 출력하는   중첩 for 문
		//1. 세로로 출력
		//2. 가로로 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단까지 출력?");
		int end = sc.nextInt();
		for(int dan=2; dan<=end; dan++) {
			for( int by=1; by<=9; by++) {
				System.out.printf("%d*%d=%d \n", dan, by, dan*by);
			}
		}
		System.out.println("--------");
		for(int by=1; by<=9; by++) {
			for(int dan=2; dan<=end; dan++ ) {
				System.out.printf("%d*%d=%d \t", dan, by, dan*by);
			}
			System.out.println();
		}
		
		
	}
}
