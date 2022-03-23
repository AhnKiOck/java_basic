
public class BreakEx01 {
	public static void main(String[] args) {
		//1~10까지 출력하는데
		//각 수에 4를 곱한 결과가 20이상이면 그만 출력
		//                 20미만이면 출력
		for( int i=1; i<=10; i++ ) {
			//20미만이면 출력
			if( i*4 < 20 ) {
				System.out.println( i );
			}else {
				break;
			}
			
//			20이상이면 그만 출력
//			if( i*4 >= 20 ) {
//				break;
//			}
//			System.out.println( i );
		}
		System.out.println("------------");
		
		//3의 배수를 5개 출력하고 반복문을 빠져나가는 형태
		int no=1;
		//no 1  2   3    5 
		//  3*1 3*2      3*5
		while( true ) {
			if( no > 5 ) break;
			System.out.println( 3*no );
			//if( no>=5 ) break;
			no++;
			//if( no > 5 ) break;
		}
		System.out.println("----------");
		
		for( int i=1; ; i++) {
			System.out.println( i * 3 );
			if( i>=5 ) break;
		}
		System.out.println("----------");

		//1부터 100까지의 합을 구하는데 합의 결과가 1000 이상이면 반복문을 빠져나가는 형태
		int sum = 0;
		System.out.print("1부터 ");
		for( int i=1; i<=100; i++ ) {
			sum += i;
//			no = i;
			if( sum>=1000 ) {
				System.out.print(i);
				break;
			}
		}
		System.out.printf("까지의 합: %d \n", sum );
//		System.out.printf("1부터 %d까지의 합: %d", no, sum );
		
		
		//구구단에서 각 단마다 *1 ~ *5까지 출력하고 빠져나가는 반복문
		//2*1=2
		//2*5=10
		//3*1=3
		//3*5=15
		//9*1=9
		//9*5=45
		//dan 2   3      9
		//by  1~5 1~5    1~5
		//중첩반복문에서는  break 문을 감싸고 있는 반복문 블럭만 빠져나간다
		for( int dan=2; dan<=9; dan++ ) {
			for( int by=1; by<=9; by++ ) {
				if( by>5 ) break;
				System.out.printf("%d*%d=%d \n", dan, by, dan*by );
				//if( by==5 ) break;
			}
		}
		
		//2*1=2   3*1=3    9*1=9
		//2*5=10  3*5=15   9*5=45
		//by  1   2     5
		//dan 2~9 2~9  2~9
		for( int by=1; by<=9; by++ ) {
			for(int dan=2; dan<=9; dan++ ) {
				System.out.printf("%d*%d=%d \t", dan, by, dan*by );
			}
			System.out.println();
			if( by==5 ) break;
		}
		
		//구구단 각 단에 대해 *1 ~ *3  까지 출력 세로, 가로
		
		//구구단에서 각 단마다 곱한 결과값이
		//30이하인 경우까지만 출력하고 각 단을 빠져나가는 형태
		//2*1=2
		//2*9=18
		//3*1=3
		//3*9=27
		//4*1=1
		//4*7=28
		//5*1=5
		//5*6=30
		//6*1=6
		//6*5=30
		//....
		//9*1=9
		//9*3=27
		for(int dan=2; dan<=9; dan++ ) {
			for( int by=1; by<=9; by++ ) {
				/*
				//30이하인 경우까지만 출력하고 각 단을 빠져나가는 형태
				if( dan*by <= 30 ) {
					System.out.printf("%d*%d=%d \n", dan, by, dan*by);
				}else
					break;
				*/
				//30초과이면 각 단을 빠져나간다
				if( dan*by > 30 ) break;
				System.out.printf("%d*%d=%d \n", dan, by, dan*by);
			}
		}
		
		//2*1=2   3*1=3  4*1=4          9*1=9
		//2*9=18  3*9=27 4*7=28         9*3=27
		
		for( int by=1; by<=9; by++ ) {
			for(int dan=2; dan<=9; dan++ ) {
				if( dan*by > 30 ) break;
				System.out.printf("%d*%d=%d \t", dan, by, dan*by);
			}
			System.out.println();
		}
		
		//내부 반복문에서 외부 반복문을 빠져나가도록 하려면
		//라벨을 지정한다
		//구구단 실행중에 곱한 결과값이 30 초과하면 전체 반복문을 빠져나가는 형태
		by:
		for(int dan=2; dan<=9; dan++ ) {
			dan:
			for( int by=1; by<=9; by++ ) {
				if( dan*by > 20 ) break dan;
				if( dan*by > 30 ) break by;
				System.out.printf("%d*%d=%d \n", dan, by, dan*by);
			}
		}
		
		
		
		
	}
}
