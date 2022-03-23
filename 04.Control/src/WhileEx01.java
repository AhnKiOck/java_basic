
public class WhileEx01 {
	public static void main(String[] args) {
		
		//Hello 라는 문자열을 10번 출력
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		int cnt = 1; //초기화식
		while( cnt <= 10 ) { //cnt < 11
			System.out.println("Hello");
			cnt++; //조건변경문
		}
		
		//1 <= 10 :T 출력
		//2 <= 10 :T 출력
		//3 <= 10 :T 출력
		//4 <= 10 :T 출력
		//..........
		//9 <= 10 :T 출력 
		//10 <= 10 :T 출력
		//11 <= 10 :F
		System.out.println("------------");

		//1부터 10까지 출력하는  while문
		int no = 1;
		while( no < 11 ) { // no <= 10
			System.out.println( no );
			no++;
		}
		System.out.println("------------");
		
		//10부터 1까지 출력하는  while 문
		no = 10;
		while( no >= 1 ) { //no > 0
			System.out.println( no );
			no--;
		}
		System.out.println("------------");
		

		//* 을 5번 출력
		no = 101; //1,2,3,4,5
		while( no <= 105 ) { //no < 6
			System.out.print( "*" );
			no++;
		}
		System.out.println("\n------------");
		
		no = 5; //5,4,3,2,1
		while( no > 0 ) { //no >= 1
			System.out.print( "*" );
			no--;
		}
		System.out.println("\n------------");
		
		
		//3의 배수를 6개 출력: 3,6,9,12,15,18
		no = 1;
		while( no < 7 ) { //no <= 6
			System.out.println( 3 * no );
			no++;
		}
		System.out.println("------------");
		
		no = 0;
		while( no < 6 ) { //no <= 6
			System.out.println( 3 * (no+1) );
			no++;
		}
		System.out.println("------------");
		
		//1부터 5까지의 합을 출력하는  while문
		//1 + 2 + 3 + 4 + 5
		no = 1;
		int sum=0;
		while( no < 6 ) { //no <= 5
			//no    1   2    3      4        5
			//sum   0+1 1+2  1+2+3  1+2+3+4  1+2+3+4+5
			//sum = sum + no;
			sum += no;
			no++;
		}
		System.out.println("1~5까지의 합: " + sum);
		
	}
}
