package machine;
import java.util.Scanner;

public class VendingMachineWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Drink coke = new Drink("콜라", 1250); 
		Drink letsbe = new Drink("레쓰비", 800); 
		Drink cocopalm = new Drink("코코팜", 1000);
		Drink juice = new Drink("오렌지쥬스", 1600);
		/*
		Drink[] drink = new Drink[3];
		drink[0] = coke;
		drink[1] = letsbe;
		drink[2] = cocopalm;
		*/
		Drink drink[] = { coke, letsbe, cocopalm, juice };
//		int coke = 1250;
//		int letsbe = 800;
//		int cocopalm = 1000;
		
		System.out.println("--- 자판기 메뉴 ---");
		for(int idx=0; idx<drink.length; idx++ ) {
			System.out.printf("%d.%s: %d원 \n"
					, (idx+1), drink[idx].name, drink[idx].price);
		}
//		System.out.println("1.콜라   :" + coke + "원");
//		System.out.println("2.레쓰비 :" + letsbe + "원");
//		System.out.println("3.코코팜 :" + cocopalm + "원");
		
		System.out.print("투입구에 돈을 넣으세요");
		int money = sc.nextInt();
		System.out.println("투입금액: " + money);
		
		boolean returnLever = false; //반환레버
//		boolean lamp1=false, lamp2=false, lamp3=false;
		int change = 0;
		while( !returnLever ) {
			//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프 켜기
//			if( money>=coke )  		lamp1 = true;
//			if( money>=cocopalm ) 	lamp3 = true;
//			if( money>=letsbe )  	lamp2 = true;
			/*
			if( money>= drink[0].price ) drink[0].lamp = true;
			if( money>= drink[2].price ) drink[2].lamp = true;
			if( money>= drink[1].price ) drink[1].lamp = true;
			*/
			drinkLamp(drink, money);
			/*
			if( money>= drink[0].price ) { //1250
				drink[0].lamp = true;
				drink[2].lamp = true;
				drink[1].lamp = true;
			}else if( money>= drink[2].price ) { //1000
				drink[0].lamp = false;
				drink[2].lamp = true;
				drink[1].lamp = true;
			}else if( money>= drink[1].price ) {
				drink[0].lamp = false;
				drink[2].lamp = false;
				drink[1].lamp = true;
			}
			*/
			for(int idx=0; idx<drink.length; idx++) {
			System.out.printf("%d.%s: %d원 %s \n"
					, (idx+1), drink[idx].name, drink[idx].price
					, (drink[idx].lamp ? "[선택가능]" : "" ) );
			}
//			System.out.printf(
//		"1.콜라    : %d원 %s \n", coke, (lamp1 ? "[선택가능]" : "" ) );
//			System.out.printf(
//		"2.레쓰비  : %d원 %s \n", letsbe, (lamp2 ? "[선택가능]" : "" ) );
//			System.out.printf(
//		"3.코코팜  : %d원 %s \n", cocopalm, (lamp3 ? "[선택가능]" : "" ) );
			System.out.println("0.반환레버를 누르겠습니다");
			System.out.println("음료를 선택하세요");
			int choice = sc.nextInt();
			
			//선택가능 음료를 누른 경우 음료가 나오고 투입금액이 바뀐다
			for(int idx=0; idx<drink.length; idx++) {
				if( drink[idx].lamp && choice==(idx+1) ) {
					System.out.println(drink[idx].name + " 나온다");
					change = money - drink[idx].price;
				}
			}
			
//			if( lamp1 && choice==1 ) {
//				System.out.println("콜라가 나온다");
//				change = money - coke;
//			}else if( lamp2 && choice==2 ) {
//				System.out.println("레쓰비가 나온다");
//				change = money - letsbe;
//			}else if( lamp3 && choice==3 ) {
//				System.out.println("코코팜이 나온다");
//				change = money - cocopalm;
//			}else {
//				change = money;
//			}
			System.out.println("투입금액: " + change);
			
			if( choice==0 ) { //반환레버를 누른경우
				returnLever = true;
			}else {
				System.out.println(
					"반환레버를 누르시겠습니까? 예/아니오(1/0)");
				returnLever = sc.nextInt() == 1 ? true : false;
			}
			
			money = change;
			if( !returnLever && money < minPrice(drink) ) {
				System.out.println("추가 금액을 투입하세요");
				money += sc.nextInt();
				System.out.println("투입금액: " + money);
			}
			
			for( Drink d : drink ) {
				d.lamp = false;
			}
//			lamp1 = false;
//			lamp2 = false;
//			lamp3 = false;
		}
		
		if( change>0 ) { //거스름돈이 있는 경우만 계산
			System.out.print("거스름돈 ");
			
			unitChange(change);
			/*
			change = unitChange(change, 1000);
			change = unitChange(change, 500);
			change = unitChange(change, 100);
			change = unitChange(change, 50);
			*/
			
			/*			
			int c1000, c500, c100, c50;
			c1000 = change / 1000;
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
			*/
			System.out.println("나온다");
		}
		
		sc.close();
	}
	
	static void drinkLamp(Drink[] drink, int money) {
		//각 음료의 가격에 대해 내림차순으로 정렬이 되어야 한다
		//1600[3], 1250[0], 1000[2], 800[1]
		
		//인접한 두 수를 비교해서 큰 수를 앞에 오도록
		//1250, 800, 1000, 1600
		//[1250, 800], 1000, 1600
		//1250, [1000, 800], 1600
		//1250, 1000, [1600, 800] : 800원이 가장 작은 가격으로 결정됨
		// 1회차 - 3회 반복
		
		//1250, 1000, 1600, 800
		//[1250, 1000], 1600, 800
		//1250, [1600, 1000], 800 : 1000원 결정
		// 2회차 - 2회 반복
		
		//1250, 1600, 1000, 800
		//[1600, 1250], 1000, 800 : 1250원 결정
		// 3회차 - 1회 반복
		
		// 1회차 - 3회 반복, 2회차 - 2회 반복, 3회차 - 1회 반복
		// 회차 + 횟수 = 4 : 횟수(열) = 음료갯수 - 회차(행)
		//1600[3], 1250[0], 1000[2], 800[1]
		int price[] = new int[drink.length]; //가격 내림차순
		int order[] = new int[drink.length]; //인덱스 순서
		for( int idx=0; idx<drink.length; idx++ ) {
			price[idx] = drink[idx].price;
			order[idx] = idx;
		}
		
		//1,2,3
		for(int row=1; row<drink.length; row++) {
			for(int col=0; col<drink.length - row; col++ ) {
				//두 수간의 큰수가 앞에 위치하도록
				if( price[col] < price[col+1] ) {
					int temp = price[col];
					price[col] = price[col+1];
					price[col+1] = temp;
					
					temp = order[col];
					order[col] = order[col+1];
					order[col+1] = temp;
				}
			}
		}
		
		for(Drink d : drink) {
			d.lamp = false;
		}
		
		//price: 1600, 1250, 1000, 800
		//order: 3, 0, 2, 1
		//프로그램 실행: ctrl+F11
		//디버그 모드로 프로그램 실행: F11
		
		for(int idx=0; idx<drink.length; idx++) {
			if( money>= drink[ order[idx] ].price ) { //1200
				for(int no=idx; no<order.length; no++ ) {
					drink[ order[no] ].lamp = true;
				}
				break;
			}	
		}
		
		/*
		if( money>= drink[3].price ) { //1600
			drink[3].lamp = true;
			drink[0].lamp = true;
			drink[2].lamp = true;
			drink[1].lamp = true;
		}else if( money>= drink[0].price ) { //1250
			drink[3].lamp = false;
			drink[0].lamp = true;
			drink[2].lamp = true;
			drink[1].lamp = true;
		}else if( money>= drink[2].price ) { //1000
			drink[3].lamp = false;
			drink[0].lamp = false;
			drink[2].lamp = true;
			drink[1].lamp = true;
		}else if( money>= drink[1].price ) {
			drink[3].lamp = false;
			drink[0].lamp = false;
			drink[2].lamp = false;
			drink[1].lamp = true;
		}
		*/
	}
	
	static int minPrice(Drink[] drink) {
		int min = drink[0].price;
//		for(int idx=0; idx<drink.length; idx++ ) {
//			if( drink[idx].price < min ) 
//				min = drink[idx].price;
//		}
		for( Drink d : drink ) {
			if( d.price < min )	min = d.price;
		}
		return min;
	}
	
	static void unitChange(int change) {
//		int unit[] = { 1000, 500, 100, 50 };
//		int count[] = { 0, 0, 0, 0 };
		int unit[][] 
			= { { 1000, 500, 100, 50 }, { 0, 0, 0, 0 } };
		for(int idx=0; idx<unit[0].length; idx++) {
			unit[1][idx] = change / unit[0][idx];
			change %= unit[0][idx];
			if( unit[1][idx] > 0 )
				System.out.print( 
					unit[0][idx] + "원 " + unit[1][idx] + "개 " );
		}
	}
	
	static int unitChange(int change, int unit) {
		int count = change / unit;
		change %= unit;
		if( count > 0 )
			System.out.print( unit + "원 " + count + "개 " );
		return change;
	}
}
