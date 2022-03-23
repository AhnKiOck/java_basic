
public class ForEx01 {
	public static void main(String[] args) {
		//1부터 10까지 출력 while문
		int no = 1;
		while( no <= 10 ) { //11<=10?F
			System.out.println( no );
			no++;
		}
		System.out.println("-----------");
		
		//1부터 10까지 출력 for문
		for(no=1; no<=10; no++) {
			System.out.println( no );
		}
		for(no=0; no<10; no++) {
			System.out.println( no+1 );
		}
		System.out.println("-----------");

		//* 을 10개 출력 **********
		for(int i=100; i<110; i++) { //횟수와 관련
			System.out.print("*");
		}
		System.out.println("\n-----------");
		//print line next
		
		//구구단 3단 출력
		//3 * 1 = 3
		//....
		//3 * 9 = 27
		//by 1      2       3  ....    9       10
		//  1<=9:T  2<=9:T             9<=9:T  10<=9:F
		for(int by=1; by<=9; by++ ) {
			System.out.printf("3 * %d = %d \n", by, 3*by);
		}
		System.out.println("-----------");
		
		//1부터 10까지의 합을 출력하는   for문
		//1+2+3 .... +9+10
		int sum = 0;
		for(int i=1; i<=10; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum );
		System.out.println("-------------");
		
		//1부터 10까지의 수 중 짝수만 출력하는  for문
		for(int i=1; i<11; i++) {
			if( i%2 == 0 ) {
				System.out.println( i );	
			}
		}
		
	}
}
