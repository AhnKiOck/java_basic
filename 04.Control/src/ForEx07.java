
public class ForEx07 {
	public static void main(String[] args) {
		//구구단 2단 ~ 9단
		//2*1=2
		//2*2=4
		//.....
		//2*9=18
		
		//3*1=3
		//.....
		//3*9=27
		
		//....
		
		//9*1=9
		//.....
		//9*9=81
		
		for(int j=2; j<=9; j++) {
			//구구단 각 단 출력
			for(int i=1; i<=9; i++) {
				int result = j*i;
				System.out.printf("%d*%d=%d \n", j, i, result);
			}
		}
		
		
		//구구단 2단 ~ 9단 : 2~9 8 번 반복실행
		for( int dan=2; dan<=9; dan++ ) {
			for( int by=1; by<=9; by++ ) {
				System.out.printf("%d*%d=%d \n", dan, by, dan*by);
			}
		}
		System.out.println("----------");
		
		/*
		for( int by=1; by<=9; by++ ) {
			System.out.printf("2*%d=%d \n", by, 2*by);
		}
		for( int by=1; by<=9; by++ ) {
			System.out.printf("3*%d=%d \n", by, 3*by);
		}
		for( int by=1; by<=9; by++ ) {
			System.out.printf("9*%d=%d \n", by, 9*by);
		}
		*/
		
		//2*1=2  3*1=3 ....  9*1=9
		//2*9=18 3*9=27 ....  9*9=81
		for( int by=1; by<=9; by++ ) {
			//*1  의 구구단 2단~9단를 8번 출력
			for( int dan=2; dan<=9; dan++ ) {
				System.out.printf("%d*%d=%d \t", dan, by, dan*by);
			}
			System.out.println();
		}
		
		
		
		
	}
}
