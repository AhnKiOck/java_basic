
public class ForEx04 {
	public static void main(String[] args) {
		
		//구구단 2단 출력
		//2*1=2
		//....
		//2*9=18
		for(int i=1; i<=9; i++) {
			System.out.printf("2*%d=%d \n", i, 2*i);
		}
		//3*1=3
		//....
		//3*9=27
		
		//4*1=4
		//....
		//4*9=36
		
		//....
		
		//9*1=9
		//....
		//9*9=81
		System.out.println("-----------");
		
		//dan 2    3    4   ....  9    10
		//i   1~9  1~9  1~9       1~9 
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d \n", dan, i, dan*i);
			}
			System.out.println("---------");
		}
		
		//2*1=2   3*1=3        ...    9*1=9
		//2*2=4	  3*2=6  
		//....
		//2*9=18  3*9=27  		      9*9=81
		
		//2*1=2   3*1=3        ...    9*1=9
		//by 1
		//dan 2~9
		/*
		for(int by=1; by<=9; by++) {
			if( by==1 ) {
				for(int dan=2; dan<=9; dan++) {
					System.out.printf( "%d단\t", dan);
				}
				System.out.println();
			}
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%d\t", dan, by, dan*by);
			}
			System.out.println();
		}
		*/
		
		
		for(int by=0; by<=9; by++) {
			for(int dan=2; dan<=9; dan++) {
				if(by==0) {
					System.out.printf("%d단\t", dan);
				}else {
					System.out.printf("%d*%d=%d\t", dan, by, dan*by);
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}
