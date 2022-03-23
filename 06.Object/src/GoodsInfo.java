//상품정보관리 클래스
public class GoodsInfo {
	//필드: 상품코드, 상품명, 제조사, 표준단가, 할인율(%)
	//     위 5개의 필드외의 필드를 추가하지 않는다
	String code, name, maker;
	int standardCost, discount ;
	
	//생성자: 할인율을 제외한 필드를 초기화하는 생성자
	GoodsInfo(String code, String name, String maker, int standardCost){
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.standardCost = standardCost;
	}
	//       모든 필드를 초기화하는 생성자
	GoodsInfo(String code, String name, String maker
					, int standardCost, int discount ){
		//생성자에서 생성자를 호출
		this(code, name, maker, standardCost);
		this.discount = discount;
	}
	
	//메소드: 할인율을 변경한다. 
	void changeDiscount(int discount) {
		this.discount = discount;
	}
	//판매가를 계산한다.
	int calculateSaleCost() {
		//10000 : 20% 할인하면 판매가는 8000
		//10000 - 2000 = 10000 - (10000에 대한 20%)
		//             = 10000 - (10000*20*0.01)
		//             = 10000 * (1 - 20 * 0.01)  
		//             = 10000 - (10000*20/100)
		//standardCost - (standardCost * discount * 0.01)
		//standardCost * (1 - discount * 0.01)
		
		//10000 * 80% : 10000 * 80 * 0.01  
		//10000 * (100 - 20) * 0.01
		//standardCost * (100-discount) * 0.01
		int saleCost = (int)(standardCost * (100-discount) * 0.01);
		return saleCost;
	}

	
	
}
