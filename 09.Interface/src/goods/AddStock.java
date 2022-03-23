package goods;

import java.util.Scanner;

public class AddStock implements Managable{
	Goods goods[];
	Scanner sc;
	
	AddStock(Goods goods[], Scanner sc){
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
		System.out.print("입고상품 번호선택: ");
		int idx = Common.selectedNo(goods, sc.nextInt());
		if( idx == -1 ) return;
		
		System.out.printf("[%s] 현재 재고수량: %d 입고수량? "
						, goods[idx].name, goods[idx].stock );
		int stock = Common.checkMinus( sc.nextInt(), sc, 2 );
		
		goods[idx].stock += stock;
		System.out.printf("[%s] 입고후 재고수량: %d \n"
						, goods[idx].name, goods[idx].stock);
	}

	@Override
	public void subtractStock() throws Exception {
	}

}
