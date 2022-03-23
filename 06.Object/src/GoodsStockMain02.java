
public class GoodsStockMain02 {
	public static void main(String[] args) {
		GoodsStock shoe = new GoodsStock();
		shoe.goodsName = "나이키 운동화";
		shoe.goodsCode = "NK01";
		shoe.stockAmount = 100;
		
		GoodsStock hat = new GoodsStock();
		hat.goodsName = "아디다스 모자";
		hat.goodsCode = "AD01";
		hat.stockAmount = 50;
		
		GoodsStock bag = new GoodsStock();
		bag.goodsName = "뉴발란스 가방";
		bag.goodsCode = "NB01";
		bag.stockAmount = 80;
		
		System.out.println("-----------------------------------");
		System.out.println("상품명 \t상품코드 \t재고수량");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %d \n"
			, shoe.goodsName, shoe.goodsCode, shoe.stockAmount );
		System.out.printf("%s \t %s \t %d \n"
			, hat.goodsName, hat.goodsCode, hat.stockAmount );
		System.out.printf("%s \t %s \t %d \n"
			, bag.goodsName, bag.goodsCode, bag.stockAmount );
		
		//출력결과가 다음과 같이 나오게  작성하세요
		//----------------------------------
		// 상품명            상품코드            재고수량
		//----------------------------------
		// 나이키 운동화  NK01         100
		// 아디다스 모자  AD01          50
		// 뉴발란스 가방  NB01          80
		
		//각 상품에 대해 50개씩 입고한 후 출력한다.
		//----------------------------------
		// 상품명            상품코드            재고수량
		//----------------------------------
		// 나이키 운동화  NK01         150
		// 아디다스 모자  AD01         100
		// 뉴발란스 가방  NB01         130
		int amount = 50;
		shoe.addStock( amount );
		hat.addStock( amount );
		bag.addStock( amount );
		System.out.println("-----------------------------------");
		System.out.println("상품명 \t상품코드 \t재고수량");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %d \n"
			, shoe.goodsName, shoe.goodsCode, shoe.stockAmount );
		System.out.printf("%s \t %s \t %d \n"
			, hat.goodsName, hat.goodsCode, hat.stockAmount );
		System.out.printf("%s \t %s \t %d \n"
			, bag.goodsName, bag.goodsCode, bag.stockAmount );

		
		//각 상품에 대해 120개씩 출고요청한 후 출력한다.
		//----------------------------------
		// 상품명            상품코드        출고요청수량   출고된수량   재고수량
		//----------------------------------
		// 나이키 운동화  NK01       120 	 	120    30
		// 아디다스 모자  AD01       120			0      100
		// 뉴발란스 가방  NB01       120         120    10
		amount = 120; //출고요청수량
		System.out.println("-----------------------------------");
		System.out.println(
			"상품명 \t 상품코드 \t 출고요청수량 \t 출고된수량 \t 재고수량");
		System.out.println("-----------------------------------");
		System.out.printf("%s \t %s \t %d \t %d \t %d \n"
			, shoe.goodsName, shoe.goodsCode
			, amount, shoe.subtractStock( amount ),  shoe.stockAmount );
		System.out.printf("%s \t %s \t %d \t %d \t %d \n"
			, hat.goodsName, hat.goodsCode
			, amount,  hat.subtractStock( amount ),  hat.stockAmount );
		System.out.printf("%s \t %s \t %d \t %d \t %d \n"
			, bag.goodsName, bag.goodsCode
			, amount,  bag.subtractStock( amount ),  bag.stockAmount );
		
		
		
	}
}
