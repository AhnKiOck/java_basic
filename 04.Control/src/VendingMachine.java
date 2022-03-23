import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		
		//돈을 넣고 음료를 선택했을 때 거스름돈을 남겨주는 간단한 자판기 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- 자판기 메뉴 ---");
		System.out.println("1.콜라   :  1250원");
		System.out.println("2.레쓰비:   800원");
		System.out.println("3.코코팜:  1000원");
		
		int coke = 1250;
		int letsbe = 800;
		int cocopalm = 1000;
		
		System.out.println("투입구에 돈을 넣으세요");
		int money = sc.nextInt();
		System.out.println("투입금액: " + money);
		
		//0:선택불가, 1:선택가능
		int choosableNo1=0, choosableNo2=0, choosableNo3=0; 
//		int choosableNo1, choosableNo2, choosableNo3; 
//		boolean choosableNo1=false, choosableNo2=false
//				, choosableNo3=false;

		//투입된 금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜진다.
//		if( money >= 1250 ) choosableNo1 = true;
//		if( money >= 1000 ) choosableNo3 = true;
//		if( money >= 800 )  choosableNo2 = true;
		//if 만으로 만든 코드를 if ~ else if 의 코드로 바꾸어 작성해 본다
		if( money >= 1250 ) {
			choosableNo1 = 1;
			choosableNo2 = 1;
			choosableNo3 = 1;
		}else if( money >= 1000 ){
			choosableNo2 = 1;
			choosableNo3 = 1;
		}else if( money >= 800 ){
			choosableNo2 = 1;
//		}else {
//			choosableNo1 = 0;
//			choosableNo2 = 0;
//			choosableNo3 = 0;
		}
		
		//true == true: T  / false == true : false
//		System.out.println(
//			"1.콜라   :  1250원  " + (choosableNo1 ? "[선택가능]" : "") );
//		System.out.println(
//			"2.레쓰비:   800원 " + (choosableNo2 ? "[선택가능]" : "") );
//		System.out.println(
//			"3.코코팜:  1000원 " + (choosableNo3 ? "[선택가능]" : "") );
		System.out.println(
			"1.콜라   :  1250원  " + (choosableNo1==1 ? "[선택가능]" : "") );
		System.out.println(
			"2.레쓰비:   800원 " + (choosableNo2==1 ? "[선택가능]" : "") );
		System.out.println(
			"3.코코팜:  1000원 " + (choosableNo3==1 ? "[선택가능]" : "") );
		System.out.println("음료를 선택하세요.");
		
		int drink = sc.nextInt(); //선택한 음료번호
		int change; //거스름돈 
//		if( choosableNo1 && drink == 1 ) { 
//			System.out.println("콜라 나온다");
//			change = money - coke;
//		}else if( choosableNo2 && drink == 2 ) {
//			System.out.println("레쓰비 나온다");
//			change = money - letsbe;
//		}else if( choosableNo3 && drink == 3 ) {
//			System.out.println("코코팜 나온다");
//			change = money - cocopalm;
//		}else {
//			change = money;
//		}
		if( choosableNo1==1 && drink == 1 ) { 
			System.out.println("콜라 나온다");
			change = money - coke;
		}else if( choosableNo2==1 && drink == 2 ) {
			System.out.println("레쓰비 나온다");
			change = money - letsbe;
		}else if( choosableNo3==1 && drink == 3 ) {
			System.out.println("코코팜 나온다");
			change = money - cocopalm;
		}else {
			change = money;
		}
		System.out.println("잔액: "+ change + "원");
		
		//거스름돈 처리
		if( change > 0 ) {
			int c1000=0, c500=0, c100=0, c50=0;//단위별 갯수
			System.out.println("거스름돈 ");
			
			c1000 = change / 1000; //1000원짜리 갯수
			change = change % 1000; //1000원짜리를 제하고 난 나머지
							
			if( c1000 > 0 ) { 
				System.out.println("1000원 " + c1000 + "장");
			}
			
			c500 = change / 500;  //500원짜리 갯수
			change = change % 500; //500원짜리를 제하고 난 나머지
			if( c500 > 0 ) {
				System.out.println("500원 " + c500 + "개");
			}
			
			c100 = change / 100; //100원짜리 갯수
			change = change % 100; //100원짜리를 제하고 난 나머지
			if( c100 > 0 ) {
				System.out.println("100원 " + c100 + "개");
			}
			
			c50 = change / 50; //50원짜리 갯수
			change = change % 50; //50원짜리 제하고 난 나머지
			if( c50 > 0 ) {
				System.out.println("50원 " + c50 + "개");
			}
			
			System.out.println("나온다 ");
		}
		
		
		sc.close();
	}//main 끝
}// class 끝

