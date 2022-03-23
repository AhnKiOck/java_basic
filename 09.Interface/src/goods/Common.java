package goods;

import java.util.Scanner; //ctrl + shift + o

public class Common {
	
	//상품가격, 재고수량에 대해
	//가격(1)은 0보다 크게 (초과) : 0은 X
	//수량(2)은 0이상  : 0 도 Ok
	//잘못 입력되었다면 다시 입력하게 한다.
	static int checkMinus(int value, Scanner sc, int what) {
		int standard = 0;
		
//		if( value < 1 )//가격
//		if( value < 0 )//수량
		if( what == 1 ) ++standard;
		while( value < standard ) {
			if( what==1 ) {
				System.out.print("상품가격은 양수 --> 재입력: ");
			}else if( what==2 ) {
				System.out.print("상품수량은 0이상 --> 재입력: ");
			}
/*			
			System.out.printf("상품%s은 %s --> 재입력: "
								, (what == 1 ? "가격" : "수량")
								, (what == 1 ? "양수" : "0이상") );
*/					
			value = sc.nextInt();
		}
		return value;
	}
	
	
	
	
	//선택한 상품의 인덱스를 리턴
	static int selectedNo(Goods[] goods, int no) {
		int cnt = 0;
		for(int idx=0; idx<goods.length; idx++) {
			if( goods[idx] == null ) continue;
			if( no == ++cnt ) {
				return idx;
			}
			
//			if( goods[idx] != null ) { //등록된 상품이 있다면
//				if( no == ++cnt ) {
//					return idx;
//				}
//			}
		}
		System.out.println("미등록된 상품번호!");
		return -1;
	}
}
