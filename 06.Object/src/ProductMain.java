
public class ProductMain {
	public static void main(String[] args) {
		//상품관리 객체를 생성해서(상품등록)
		//화장지 상품은 가격까지 등록하고
		//Product tissue;
		//System.out.println(tissue); //로컬변수 사용불가
		Product tissue = null;
		System.out.println(tissue); //로컬변수 사용가능
		tissue = new Product("화장지", "TS01", 17500);
		//Product tissue = new Product("화장지", "TS01", 17500);
		
		//종이컵 상품은 가격없이 등록한 후 메소드호출로 가격을 1500 으로 변경한다
		Product cup = new Product("종이컵", "PC01");
		
		cup.changePrice( 1500 );
		//모든 처리가 다 끝난 후 다음과 같은 결과를 출력하세요
		//상품명 		상품코드 		상품가격
		//화장지		TS01		17500
		//종이컵		PC01		1500
		System.out.println("상품명 \t 상품코드 \t 상품가격");
		System.out.printf("%s \t %s \t %d \n"
		, tissue.productName, tissue.productCode, tissue.productPrice);
		System.out.printf("%s \t %s \t %d \n"
		, cup.productName, cup.productCode, cup.productPrice);
		
		
	}
}
