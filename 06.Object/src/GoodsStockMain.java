
public class GoodsStockMain {
	public static void main(String[] args) {
		//재고관리 객체 생성
		GoodsStock wilson = new GoodsStock("윌슨 티셔츠", "WS01");
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
		, wilson.goodsName, wilson.goodsCode, wilson.stockAmount);
		
		System.out.println("------------");

		GoodsStock reebok = new GoodsStock("리복 반바지", "RB01", 50);
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
			, reebok.goodsName, reebok.goodsCode, reebok.stockAmount);
		
		
		System.out.println("------------");
		GoodsStock goods = new GoodsStock();
		
		goods.goodsName = "나이키 모자";
		goods.goodsCode = "NK01";
		goods.stockAmount = 100;
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
			, goods.goodsName, goods.goodsCode, goods.stockAmount);
		
		//50개를 입고한다
		int stockAmount = 50;
		goods.addStock( stockAmount );
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
				, goods.goodsName, goods.goodsCode, goods.stockAmount);
		
		//30개를 출고한다.
		goods.subtractStock( 30 );
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
				, goods.goodsName, goods.goodsCode, goods.stockAmount);
		
		
		//다른 상품 등록하기: 다른 상품 객체 생성
		GoodsStock bag = new GoodsStock();
		bag.goodsName = "아디다스 가방";
		bag.goodsCode = "AD01";
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
				, bag.goodsName, bag.goodsCode, bag.stockAmount);
		
		//100개 입고한다
		bag.addStock( 100 );
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
				, bag.goodsName, bag.goodsCode, bag.stockAmount);
		
		//150개 출고요청한다
		int req = 150;
		int outAmount = bag.subtractStock( req );
		System.out.printf("출고요청수량: %d, 출고된 수량: %d \n"
								, req, outAmount);
		System.out.printf("상품명: %s, 상품코드: %s, 재고수량: %d \n"
				, bag.goodsName, bag.goodsCode, bag.stockAmount);
		
		
		
		
		
		
		
	}
}
