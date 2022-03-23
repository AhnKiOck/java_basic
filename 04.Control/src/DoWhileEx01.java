import java.util.Scanner;

public class DoWhileEx01 {
	public static void main(String[] args) {
		//while문: 조건식의 결과가 true 인 동안 반복실행
		int no = 1;
		while( no > 10 ) { // 1 > 10: F
			System.out.println( no );
			no++;
		}
		System.out.println("Finished");
		
		//do ~ while문 : 최소 1회는 실행되어지는 반복문
		no = 1;
		do {
			System.out.println( no );
			no++;
		}while( no > 10 ); // 2 > 10 :F
		
	
		//10이상의 수를 키보드로 입력받아 출력하는  do ~ while문
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("10 이상의 수를 입력하세요");
		no = sc.nextInt();
		while( no < 10 ) {
			System.out.println("10 이상의 수를 입력하세요");
			no = sc.nextInt();
		}
		*/
		do {
			System.out.println("10 이상의 수를 입력하세요");
			no = sc.nextInt();
		}while( no < 10 );
		
		sc.close();
		
	}//main 끝
}
