// 상품재고관리 클래스
public class GoodsStock {
	//필드: 상품명, 상품코드, 재고수량
	String goodsName, goodsCode;
	int stockAmount;
	
	//default생성자
	GoodsStock(){
	}
	//필드를 초기화하는 생성자 선언
	GoodsStock(String name, String code){
		goodsName = name;
		goodsCode = code;
	}
	GoodsStock(String name, String code, int amount){
//		goodsName = name;
//		goodsCode = code;
		this(name, code);
		stockAmount = amount;
	}
	
	
	//메소드: 입고한다. 출고한다
	//입고한다 메소드
	//재고수량은 입고된 수량만큼 증가한다
	void addStock(int amt) {
		stockAmount += amt;
	}
	
	//출고한다
	//재고수량인 출고된 수량만큼 감소한다.
	//실제 출고된 수량을 리턴한다
	//출고요청수량이 재고수량이 더 많으면 출고되지 않는다
	int subtractStock(int amt) {
		if( amt > stockAmount ) return 0;
		stockAmount -= amt;
		return amt;
	}
	
	void print(int amount, boolean request) {
		System.out.printf(
			"%s \t %s \t "+ (request ? "%d \t %d \t " : "%s%s" ) + "%d \n"
				, goodsName, goodsCode
				, (request ? amount : "")
				, (request ? subtractStock( amount ) : "")
				, stockAmount );
		/*
		if( request ) {
			System.out.printf("%s \t %s \t %d \t %d \t %d \n"
				, goodsName, goodsCode
				, amount, subtractStock( amount ), stockAmount );
		}else {
			System.out.printf("%s \t %s \t %d \n"
				, goodsName, goodsCode, stockAmount );
		}
		*/
		/*
		if( !request ) {
			System.out.printf("%s \t %s \t %d \n"
				, goodsName, goodsCode, stockAmount );
		}else {
			System.out.printf("%s \t %s \t %d \t %d \t %d \n"
				, goodsName, goodsCode
				, amount, subtractStock( amount ), stockAmount );
		}
		*/
	}
	
	void printStockSubtract(int amount) {
		System.out.printf("%s \t %s \t %d \t %d \t %d \n"
				, goodsName, goodsCode
				, amount, subtractStock( amount ), stockAmount );
	}
	
	void printStock() {
		System.out.printf("%s \t %s \t %d \n"
				, goodsName, goodsCode, stockAmount );
	}
}
