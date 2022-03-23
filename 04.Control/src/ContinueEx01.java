
public class ContinueEx01 {
	public static void main(String[] args) {
		//1~10 까지의 수 중 짝수만 출력
		for( int no=1; no<=10; no++ ) {
			//홀수이면 출력하는 실행명령문을 실행하지 않고 다음반복으로 넘어간다
			//no 1 2    3  4
			//     2출력       4출력
			if( no%2==1 ) { //no%2!=0 
				continue;
			}
			System.out.println( no );
//			if( no%2!=1 ) {
//				System.out.println( no );
//			}
//			if( no%2==0 ) {
//				System.out.println( no );
//			}
		}
		System.out.println("-----------");
		
		//구구단에서 각 단마다 *5 를 빼고 출력
		//세로 출력
		for( int dan=2;  dan<=9; dan++ ) {
			for( int by=1; by<=9; by++ ) {
				if( by==5 ) continue;
				System.out.printf("%d*%d=%d \n", dan, by, dan*by);
			}
		}
		//가로 출력
		for( int by=1; by<=9; by++ ) {
			for( int dan=2; dan<=9; dan++ ) {
				if( by==5 ) continue;
				System.out.printf("%d*%d=%d \t", dan, by, dan*by);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
