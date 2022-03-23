
public class ContinueEx02 {
	public static void main(String[] args) {
		//직접코드실습:  continue 사용하기
		//1. 1~10까지의 수 중에 홀수만 출력하는  for문
		for( int no=1; no<=10; no++ ) {
			//if( no%2==0 ) continue;
			if( no%2!=1 ) continue;
			//if( no%2==1 )
			System.out.println( no );
		}
		System.out.println("-----------");

		//1~20까지의 수 중에 3의 배수만 출력하는 for문
		for( int no=1; no<=20; no++ ) {
			if( no%3!=0 ) continue;
			//if( no%3==1 || no%3==2 ) continue;
			//if( no%3==0 )
			System.out.println(no);
		}
		
		
		//2. 구구단에서 짝수단만 출력하는 중첩for문
		//   세로, 가로
		for( int dan=2; dan<=9; dan++ ) {
			for( int by=1; by<=9; by++ ) {
				if(dan%2==1) continue;
				System.out.printf("%d*%d=%d \n", dan, by, dan*by );
			}
		}
		
		for( int by=1; by<=9; by++ ) {
			for( int dan=2; dan<=9; dan++ ) {
				if( dan%2==1 ) continue;
				System.out.printf("%d*%d=%d \t", dan, by, dan*by );
			}
			System.out.println();
		}
		
		
		//3. 1~100 까지의 수 중 홀수만 더한 합이 100 이상이면 
		//   반복문을 빠져나가는  for문:  continue, break  모두 사용
		int sum = 0;
		for(int no=1; no<=100; no++) {
			//짝수이면 다음 반복으로
			if( no%2==0 ) continue;
			sum += no;
//			System.out.println( no + ": " + sum);
			if( sum >= 100 ) break;
			System.out.println( no + ": " + sum);
		}
		
		
	}
}
