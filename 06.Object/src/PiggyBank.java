
public class PiggyBank {
//	데이터:변수
	String owner; 	//주인
	int total; 		//총액
	
//	생성자 선언 : 필드값을 초기화하기 위해
//	1. 클래스 안에 선언
//	2. 생성자명은 클래스명과 동일
//	3. 리턴타입이 없는 메소드의 형식
	PiggyBank(){}
	PiggyBank(String name){
		owner = name;
	}
	
	
//	돈을 넣는다 메소드 inputMoney
//	메소드 선언: 리턴타입 메소드명(파라미터 변수){  .....  }
//  리턴하는 데이터가 없는 경우 리턴타입은  void
//  리턴하는 데이터가 있는 경우 리턴타입은  리턴하는 데이터의 데이터타입
	void inputMoney(int money) {
		// 기능: 넣은 금액만큼 총액이 증가한다
//		total = total + money;
		total += money;
	}
	
//	돈을 빼낸다  outputMoney
	void outputMoney(int money) {
		//기능: 빼낸 금액만큼 총액이 감소한다
		//total = total - money;
		total -= money;
	}
}
