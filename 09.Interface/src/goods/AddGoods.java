package goods;

import java.util.Scanner;

public class AddGoods implements Managable{
	Goods[]  goods;
	Scanner  sc;
	AddGoods(Goods[]  goods, Scanner  sc){
		this.goods = goods;
		this.sc = sc;
	}

	//상품을 저장할 공간이 있는지 확인하여 저장할 인덱스를 리턴
	int checkStorage() {
		for(int idx=0; idx<goods.length; idx++) {
			if( goods[idx] == null ) {
				return idx;
			}
		}
		System.out.println("상품등록 공간부족: 등록 불가!");
		return -1;
	}
	
	//이미 등록된 코드인지 확인하여 기등록 코드인 경우 등록불가하게
	boolean sameCode(String code) {
		for( Goods g : goods) {
			if( g != null ) {
				if( code.equals(g.code) ) {
					System.out.print("등록된 코드!(재입력): ");
					return true;
				}
			}
		}
		return false;
	}
	
	public void addGoods() { 		//상품등록
		//상품등록할 공간이 있는지 확인해서 첫번째 빈공간의 위치
		int idx = checkStorage();
		if( idx == -1 ) return;
		
		System.out.print("등록 상품코드: ");
		String code = sc.next();	//이미 등록된 코드라면 다시입력
		while( sameCode(code) ) {
			code = sc.next();
		}
		
		System.out.print("등록 상품명: ");
		String name = sc.next();
		
		System.out.print("등록 상품가격: ");
		int price = Common.checkMinus( sc.nextInt(), sc, 1 );
		
		System.out.print("등록 상품수량: ");
		int stock = Common.checkMinus( sc.nextInt(), sc, 2 );
		
		goods[idx] = new Goods(name, code, price, stock);
		System.out.printf("상품[%s] 등록 완료 \n", name);
		
	}
	public void displayGoods() { 	//상품조회
	}
	public void changeGoods() { 	//상품변경
	}
	public void removeGoods() { 	//상품삭제 필수 사항
	}
	public void addStock() {}
	public void subtractStock() throws Exception {}
}
