import java.util.Scanner;

public class VendingMachineWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coke = 1250;
		int letsbe = 800;
		int cocopalm = 1000;
		
		System.out.println("--- 자판기 메뉴 ---");
		System.out.println("1.콜라   :" + coke + "원");
		System.out.println("2.레쓰비 :" + letsbe + "원");
		System.out.println("3.코코팜 :" + cocopalm + "원");
		
		System.out.println("투입구에 돈을 넣으세요");
		int money = sc.nextInt();
		System.out.println("투입금액: " + money);
		
		boolean returnLever = false; //반환레버
		boolean lamp1=false, lamp2=false, lamp3=false;
		int change = 0;
		while( !returnLever ) {
			//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프 켜기
			if( money>=coke )  		lamp1 = true;
			if( money>=cocopalm ) 	lamp3 = true;
			if( money>=letsbe )  	lamp2 = true;
			System.out.printf(
		"1.콜라    : %d원 %s \n", coke, (lamp1 ? "[선택가능]" : "" ) );
			System.out.printf(
		"2.레쓰비  : %d원 %s \n", letsbe, (lamp2 ? "[선택가능]" : "" ) );
			System.out.printf(
		"3.코코팜  : %d원 %s \n", cocopalm, (lamp3 ? "[선택가능]" : "" ) );
			System.out.println("0.반환레버를 누르겠습니다");
			System.out.println("음료를 선택하세요");
			int choice = sc.nextInt();
			
			//선택가능 음료를 누른 경우 음료가 나오고 투입금액이 바뀐다
			if( lamp1 && choice==1 ) {
				System.out.println("콜라가 나온다");
				change = money - coke;
			}else if( lamp2 && choice==2 ) {
				System.out.println("레쓰비가 나온다");
				change = money - letsbe;
			}else if( lamp3 && choice==3 ) {
				System.out.println("코코팜이 나온다");
				change = money - cocopalm;
			}else {
				change = money;
			}
			System.out.println("투입금액: " + change);
			
			if( choice==0 ) { //반환레버를 누른경우
				returnLever = true;
			}else {
				System.out.println(
					"반환레버를 누르시겠습니까? 예/아니오(1/0)");
				returnLever = sc.nextInt() == 1 ? true : false;
			}
			
			money = change;
			if( !returnLever && money < letsbe ) {
				System.out.println("추가 금액을 투입하세요");
				money += sc.nextInt();
				System.out.println("투입금액: " + money);
			}
			lamp1 = false;
			lamp2 = false;
			lamp3 = false;
		}
		
		if( change>0 ) { //거스름돈이 있는 경우만 계산
			int c1000, c500, c100, c50;
			System.out.print("거스름돈 ");
			
			c1000 = change / 1000;
			//change = change % 1000;
			change %= 1000;
			if( c1000 > 0 )
				System.out.print( "1000원 " + c1000 + "장 " );

			c500 = change / 500;
			change %= 500;
			if( c500 > 0 )
				System.out.print("500원 " + c500 + "개 ");
			
			c100 = change / 100;
			change %= 100;
			if( c100 > 0 )
				System.out.print("100원 "+ c100 + "개 ");
			
			c50 = change / 50;
			if( c50 > 0 )
				System.out.print("50원 " + c50 + "개 ");
			
			System.out.println("나온다");
		}
		
		sc.close();
	}
}
