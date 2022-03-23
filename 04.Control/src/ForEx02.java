import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		//직접코드실습
		//1. 1부터 10까지의 수 중 홀수만 출력하는  for문
		for(int no=1; no<11; no++ ) {
			//if( no%2 == 1) {
			if( no%2 != 0) {
				System.out.println( no );
			}
		}
		
		//2. 출력하고 싶은 구구단의 단을 키보드로 입력받아 출력하는 for문
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 구구단 몇 단?");
		int dan = sc.nextInt();
		//2 * 1 = 2
		//2 * 9 = 18
		for(int by=1; by<=9; by++) {
			System.out.printf("%d * %d = %d \n", dan, by, dan * by);
		}
		
		//3. 1부터 키보드로 입력받은 수까지의 합을 출력하는  for문
		// 키보드입력: 10 : 1+2+ ...9+10
		System.out.println("수를 입력하세요");
		int end = sc.nextInt();
		int sum = 0;
//		for(int no=1; no<end+1; no++) {
		for(int no=1; no<=end; no++) {
			//sum = sum + no;
			sum += no;
			System.out.println("1부터 "+ no +"까지의 합: " + sum);
		}
//		System.out.println("1부터 "+ end +"까지의 합: " + sum);
		
		
		//4. 1부터 키보드로 입력받은 수까지 중에서 3의 배수만 출력하는  for문
		System.out.println("수를 입력하세요");
		end = sc.nextInt();
		for(int no=1; no<=end; no++) {
			//if( no%3 == 0 ) {
			//	System.out.println( no );
			//}
			if( no*3 <= end ) {
				System.out.println( no*3 );
			}
		}
		
	}
}
