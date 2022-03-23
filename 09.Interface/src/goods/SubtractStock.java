package goods;

import java.util.Scanner;

public class SubtractStock implements Managable {
	Goods goods[];
	Scanner sc;
	
	SubtractStock(Goods goods[], Scanner sc){
		this.goods = goods;
		this.sc = sc;
	}
	@Override
	public void addGoods() {
	}

	@Override
	public void displayGoods() {
	}

	@Override
	public void changeGoods() {
	}

	@Override
	public void removeGoods() {
	}

	@Override
	public void addStock() {
	}

	@Override
	public void subtractStock() throws Exception {
		System.out.print("출고상품 번호선택: ");
		int idx = selectedNo( goods, sc.nextInt() );
//		int idx = Common.selectedNo( goods, sc.nextInt() );
		if( idx == -1 ) return; 
		
		System.out.printf("[%s] 현재 재고수량: %d 출고 수량? "
						, goods[idx].name, goods[idx].stock );
		int stock = checkMinus(sc.nextInt(), sc, 2);
//		int stock = Common.checkMinus(sc.nextInt(), sc, 2);
		
		if( stock > goods[idx].stock )
			throw new Exception("출고불가: 재고수량부족!");
		
		goods[idx].stock -= stock;
		System.out.printf("[%s] 출고후 재고수량: %d \n"
						, goods[idx].name, goods[idx].stock);
		
	}

}
