import java.util.Scanner;

public class ProductMain02 {
	
	static Product[] registProduct( Scanner sc, Product list[] ) {
		//list: 0 1  ...  8 9
		for(int idx=0; idx<list.length; idx++) {
			System.out.println("상품을 등록하시겠습니까? 예/아니오(1/0)");
			int yesNo = sc.nextInt();
			if( yesNo==0 ) {
				break;
			}
			System.out.println("상품등록화면 -------------");
			System.out.print("상품명: ");
			String name = sc.next();
			
			System.out.print("상품코드: ");
			String code = sc.next();
			
			//상품가격을 등록하지 않는 경우는 0 을 입력한다
			System.out.print("상품가격: ");
			int price = sc.nextInt();
			
			Product product;
			if ( price > 0 ) {
				product = new Product(name, code, price);
			}else {
				product = new Product(name, code);
			}
			list[idx] = product;
			System.out.println("----------------------");
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//상품 10개를 등록할 수 있는 프로그램
		//int no[] = new int[10];
		//no[0] = 10;
		Product product[] = new Product[10]; //배열변수만 선언
		
		//메소드 호출문 - 상품등록화면 -최대 10개까지 등록함
		product = registProduct(sc, product);
		
		//메소드호출문-상품목록조회화면
		//displayProduceList(tissue, cup);
		displayProduceList(product);
		
		System.out.println("가격변경하고자 하는 상품선택?");
		for( int idx=0; idx<product.length; idx++) {
			if( product[idx]==null ) continue;
			System.out.println(
					(idx+1) + "." + product[idx].productName);
		}
//		System.out.println("1." + tissue.productName);
//		System.out.println("2." + cup.productName);
		int choice = sc.nextInt();
		
		//메소드 호출문-상품변경화면
		//changeProductInfo(sc, choice, tissue, cup);
		changeProductInfo(sc, product[choice-1]);
		
		//메소드 호출문-상품목록조회화면
		//displayProduceList(tissue, cup);
		displayProduceList(product);
		
		sc.close();
	}
	
	static void changeProductInfo(Scanner sc, Product produce) {
		System.out.println("상품가격변경화면 -------------");
		System.out.println("상품명: " + produce.productName );
		System.out.println("상품코드: " + produce.productCode );
		System.out.print("상품가격: " + produce.productPrice  
							+ " --> " );
		int price = sc.nextInt();
		produce.changePrice(price);
		System.out.println("----------------------");
	}
	
	/*
	static void changeProductInfo
			(Scanner sc, int choice, Product tissue, Product cup) {
		System.out.println("상품가격변경화면 -------------");
		System.out.println("상품명: "
			+ ( choice==1 ? tissue.productName : cup.productName) );
		System.out.println("상품코드: "
			+ ( choice==1 ? tissue.productCode : cup.productCode ));
		System.out.print("상품가격: " 
			+ ( choice==1 ? tissue.productPrice : cup.productPrice ) 
							+ " --> " );
		int price = sc.nextInt();
		if( choice==1 ) {
			tissue.changePrice(price);
		}else {
			cup.changePrice(price);
		}
		System.out.println("----------------------");
	}
	*/
	
	static void displayProduceList(Product[] list) {
		System.out.println("상품목록조회화면 ----------");
		System.out.println("상품명 \t 상품코드 \t 상품가격");
		// 
		for( int idx=0; idx<list.length; idx++) {
			if( list[idx] == null )  continue;
			System.out.printf("%s \t %s \t %d \n"
			, list[idx].productName, list[idx].productCode, list[idx].productPrice);
			
//			if( list[idx] != null ) {
//			System.out.printf("%s \t %s \t %d \n"
//			, list[idx].productName, list[idx].productCode, list[idx].productPrice);
//			}
		}
		System.out.println("----------------------");
	}
	/*
	static void displayProduceList(Product tissue, Product cup) {
		System.out.println("상품목록조회화면 ----------");
		System.out.println("상품명 \t 상품코드 \t 상품가격");
		System.out.printf("%s \t %s \t %d \n"
		, tissue.productName, tissue.productCode, tissue.productPrice);
		System.out.printf("%s \t %s \t %d \n"
		, cup.productName, cup.productCode, cup.productPrice);
		System.out.println("----------------------");
	}
	*/
	
}
