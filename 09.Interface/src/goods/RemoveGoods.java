package goods;

import java.util.Scanner;

public class RemoveGoods implements Managable{
	Goods[]  goods;
	Scanner  sc;
	RemoveGoods(Goods[]  goods, Scanner  sc){
		this.goods = goods;
		this.sc = sc;
	}
	public void addGoods() { 		//상품등록
	}
	public void displayGoods() { 	//상품조회
	}
	public void changeGoods() { 	//상품변경
	}
	public void removeGoods() { 	//상품삭제 필수 사항
		System.out.print("삭제상품 번호선택: ");
		int idx = sc.nextInt();
		idx = Common.selectedNo(goods, idx);
		if( idx==-1 ) return;
		
		System.out.printf("상품목록에서 [%s] 삭제 완료\n", goods[idx].name );
		goods[idx] = null;
	}
	public void addStock() {}
	public void subtractStock() throws Exception {}
}
