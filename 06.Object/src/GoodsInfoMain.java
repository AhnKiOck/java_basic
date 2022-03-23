
public class GoodsInfoMain {
	public static void main(String[] args) {
//		String code, String name, String maker
//		, int standardCost, int discount 
		GoodsInfo shoe =
		new GoodsInfo("AD01", "운동화", "아디다스", 70000);
//		new GoodsInfo("AD01", "운동화", "아디다스", 70000, 30);
		
		GoodsInfo hat =
		new GoodsInfo("NK01", "모자", "나이키", 30000);
//		System.out.println("제조사    상품코드 	상품명	 표준단가	 할인율    판매가");
//		System.out.println(shoe.maker + "\t" + shoe.code + "\t"
//						+ shoe.name + "\t" + shoe.standardCost + "\t"
//						+ shoe.discount + "\t" + shoe.calculateSaleCost() );
//		System.out.println(hat.maker + "\t" + hat.code + "\t"
//				+ hat.name + "\t" + hat.standardCost + "\t"
//				+ hat.discount + "\t" + hat.calculateSaleCost() );
		GoodsInfo[] list = new GoodsInfo[10];
		list[0] = shoe;
		list[1] = hat;

		//상품목록조회
//		displayGoodsList(shoe, hat);
		displayGoodsList(list);
		
		//운동화상품 할인율 변경저장
		shoe.changeDiscount( 30 );
		
		//상품목록조회
//		displayGoodsList(shoe, hat);
		displayGoodsList(list);
		
		//출력결과
		//제조사    상품코드 	상품명	 표준단가	 할인율    판매가
		//아디다스  AD01    운동화         70000   30     49000
		//나이키    NK01     모자            30000   0      30000 
	}
	
	static void displayGoodsList(GoodsInfo[] list) {
		System.out.println("제조사    상품코드 	상품명	 표준단가	 할인율    판매가");
//		for(int idx=0; idx<list.length; idx++) {
//			if( list[idx]==null ) continue;
//			System.out.println(
//				  list[idx].maker + "\t" 
//				+ list[idx].code + "\t"
//				+ list[idx].name + "\t"
//				+ list[idx].standardCost + "\t"
//				+ list[idx].discount + "\t" 
//				+ list[idx].calculateSaleCost() );
//		}
		//향상된  for문으로 변경하기
		for( GoodsInfo goods : list ) {
			if( goods==null ) continue;
			System.out.println(
					goods.maker + "\t" 
					+ goods.code + "\t"
					+ goods.name + "\t"
					+ goods.standardCost + "\t"
					+ goods.discount + "\t" 
					+ goods.calculateSaleCost() );
		}
		
	}
	 
	static void displayGoodsList(GoodsInfo shoe, GoodsInfo hat) {
		System.out.println("제조사    상품코드 	상품명	 표준단가	 할인율    판매가");
		System.out.println(shoe.maker + "\t" + shoe.code + "\t"
						+ shoe.name + "\t" + shoe.standardCost + "\t"
						+ shoe.discount + "\t" 
						+ shoe.calculateSaleCost() );
		System.out.println(hat.maker + "\t" + hat.code + "\t"
				+ hat.name + "\t" + hat.standardCost + "\t"
				+ hat.discount + "\t" + hat.calculateSaleCost() );
	
	}
	
}
