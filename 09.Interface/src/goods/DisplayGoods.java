package goods;


public class DisplayGoods implements Managable{
	Goods[]  goods;
	DisplayGoods(Goods[]  goods){
		this.goods = goods;
	}
	public void addGoods() { 		//상품등록
	}
	public void displayGoods() { 	//상품조회
		System.out.println("-----------------------");
		System.out.println("상품코드\t 상품명\t 가격\t 재고수량");
		System.out.println("-----------------------");
		
		int no = 0;
		for(Goods g : goods) {
			if( g != null) {
				System.out.printf("%d. %s\t %s\t %d\t %d \n"
						, ++no, g.code, g.name, g.price, g.stock);
			}
		}
		if( no == 0 ) {
			System.out.println("등록된 상품이 없습니다");
		}
		System.out.println("-----------------------\n");
	}
	public void changeGoods() { 	//상품변경
	}
	public void removeGoods() { 	//상품삭제 필수 사항
	}
	public void addStock() {}
	public void subtractStock() throws Exception {}
}
