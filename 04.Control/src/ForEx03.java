import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
		//두 정수를 입력받아 두 수 사이의 정수를 출력하는   for 문
		//5, 10 -> 5,6,7,8,9,10
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요");
		int first = sc.nextInt();
		
		System.out.print("두 번째 수를 입력하세요");
		int second = sc.nextInt();
		
		//no 5
		//   5<=2:F
		/*
		//첫번째 수가 두번째 수보다 크다면  두 수를 바꾼다
		if( first > second ) {
//			int temp = first;
//			first = second;
//			second = temp; 
			int temp = second;
			second = first;
			first = temp;
		}
		*/
		if( first > second ) {
			for( int no=first; no>=second; no--) {
				System.out.print( no + " " );
			}
			
		}else {
			for( int no=first; no<=second; no++ ) {
				System.out.print( no + " " );
			}
		}
		System.out.println("Finished");
		sc.close();
		
		
		//10부터 1까지 출력하는   while문
		int no = 10;
		while( no >= 1 ) { //10>=1:F ...0>=1:F 
			System.out.print( no + " ");
			no--;
		}
		System.out.println("-----------");
		//for 문으로 변경
		for( no=10; no>=1; no--) {
			System.out.print( no + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
