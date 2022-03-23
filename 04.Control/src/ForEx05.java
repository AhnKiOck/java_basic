
public class ForEx05 {
	public static void main(String[] args) {
		//직사각형 모양을 출력
		//***  1
		for( int col=1; col<=3; col++ ) {
			System.out.print("*");
		}

		
		//***  2
		//***  3
		//***  4
		//***  5
		for( int row=1; row<=5; row++ ) {
			//별 3개 출력
			for( int col=1; col<=3; col++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		 for( int row=1; row<=5; row++ ) {
			 //System.out.println("***");
			 for( int col=1; col<=3; col++ ) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		 System.out.println("-------------");
		 
		 //&&&&&&&&&& 가 세로로(라인을 내려서) 3번 출력
		 for( int row=1; row<=3; row++ ) {
			 //오른쪽에 붙여서 & 를 10번 출력
			 for( int col=1; col<=10; col++ ) {
				 System.out.print("&");
			 }
			 System.out.println();
		 }
		 System.out.println("------------");
		 
		 
		 
		 //&&&&&&&&&&
		 //&&&&&&&&&&
		 //&&&&&&&&&&
		 for( int row=3; row>=1; row-- ) {
			//&&&&&&&&&& 출력
			  for(int col=1; col<=10; col++) {
				  System.out.print("&");
			  }
			  System.out.println();
		 }
		 
			 
		 for( int row=3; row>=1; row-- ) {
			 //오른쪽에 붙여서 & 를 10번 출력
			 for( int col=10; col>=1; col-- ) {
				 System.out.print("&");
			 }
			 System.out.println();
		 }
		 System.out.println("------------");

		 
		 //직접코드실습
		 //$$$$$$$  가로로 7개
		 //$$$$$$$  세로로 4행
		 //$$$$$$$
		 //$$$$$$$
		 
		 
	}

}
