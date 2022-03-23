
public class ForEx06 {
	public static void main(String[] args) {
		
		//******** 8개 출력
		//*******  7개 출력
		//******   6개 출력
		//***** 
		//**** 
		//*** 
		//** 
		//*        1개 출력
		
		for(int row=8; row>=1; row--) {
			//row 8   7   6   5     1
			//col 8회   7회   6   5     1
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------");
		for( int row=1; row<=8; row++ ) {
		//  가로로로 별 출력
			//row:1  2  3    8
			//col:8  7  6    1 
			for( int col=1; col<=9-row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//*        1개 출력
		//** 
		//*** 
		//**** 
		//***** 
		//******   6개 출력
		//*******  7개 출력
		//******** 8개 출력
		
		// row 1    2  ..  8
		// col 1~1  1~2    1~8 
		for( int row=1; row<=8; row++) {
			for( int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
