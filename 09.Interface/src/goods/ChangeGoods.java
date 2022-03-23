package goods;

import java.util.Scanner;

public class ChangeGoods implements Managable{
	Goods[]  goods;
	Scanner  sc;
	ChangeGoods(Goods[]  goods, Scanner  sc){
		this.goods = goods;
		this.sc = sc;
	}
	public void addGoods() { 		//상품등록
	}
	public void displayGoods() { 	//상품조회
	}
	public void changeGoods() { 	//상품변경
		System.out.print("변경상품 번호선택: ");
//		Common common = new Common();
//		int idx = sc.nextInt()-1;
		int idx = sc.nextInt();
		idx = Common.selectedNo(goods, idx);
		if( idx==-1 ) return;
			
		System.out.print("변경 상품명: " + goods[idx].name + " -> " );
		String name = sc.next();
		
		System.out.print("변경 상품가격: " + goods[idx].price + " -> " );
		int price = sc.nextInt();
		price = Common.checkMinus(price, sc, 1);
		
		System.out.print("변경 상품수량: " + goods[idx].stock + " -> " );
		int stock = sc.nextInt();
		stock = Common.checkMinus(stock, sc, 2);
		
		System.out.printf("상품코드 %s [%s -> %s] 변경 완료 \n"
							, goods[idx].code, goods[idx].name, name );
		goods[idx].name = name;
		goods[idx].price = price;
		goods[idx].stock = stock;
		
	}
	public void removeGoods() { 	//상품삭제 필수 사항
	}
	public void addStock() {}
	public void subtractStock() throws Exception {}
}







