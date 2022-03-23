//상품관리 클래스
public class Product {
	//필드 선언: 상품명, 상품코드, 상품가격
	String productName, productCode;
	int productPrice;
	
	//생성자 선언: 필드를 초기화하기 위해 
	//생성자 파라미터 2개짜리 생성자 선언
	Product(String name, String code){
		productName = name;
		productCode = code;
	}
	
	//          모든 필드를 초기화하는 생성자 선언
	Product(String name, String code, int price){
		this(name, code);
//		productName = name;
//		productCode = code;
		productPrice = price;
	}
	//메소드 선언: 가격을 변경한다
	void changePrice(int price) {
		productPrice = price;
	}
}
