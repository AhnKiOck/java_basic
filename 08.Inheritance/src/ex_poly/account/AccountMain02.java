package ex_poly.account;

public class AccountMain02 {
	public static void main(String[] args) {
		Account jeon
		= new CheckCardAccount(
			"111-22-3333", "전우치", "4444-5555-6666-7777", 50000);
//		Account acc1 = jeon;
//		printAccount(acc1);
		
		printAccount(jeon);
		
		MinusAccount park
		= new MinusAccount(
				"222-33-4444", "박문수", 1000000, 30000);
		printAccount(park);
	
		PointAccount sim 
		= new PointAccount("333-44-5555", "심청", 50000);
		printAccount(sim);

		Account acc = sim; //UpCasting: 자동형변환
		sim = (PointAccount)acc; 
		//DownCasting 은 명시적으로 형변환 연산자를 지정해야 한다
	}
	
	static void printAccount(Account account) {
		System.out.println("통장 ----------");
		System.out.println("예금주: " + account.owner);
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("잔액: " + account.balance);
		//수퍼클래스의 데이터타입으로 표현했다고 해서
		//생성된 객체의 타입 자체가 바뀌지는 않는다.
		//생성된 객체가 서브클래스의 인스턴스인지를 확인하면 된다
		//: 참조변수  instanceof 데이터타입
		//데이터타입을 변환하는 형변환 연산자를 사용한다
		byte no1 = 10;
		int no2 = no1; //byte -> int 
		no1 = (byte)no2; //int -> byte
		
		if( account  instanceof CheckCardAccount ) {
			CheckCardAccount check = (CheckCardAccount)account;
			//Account -> CheckCardAccount
			//수퍼클래스 -> 서브클래스 : DownCasting: 강제형변환
			//서브클래스 -> 수퍼클래스 : UpCasting(자동형변환)
			System.out.println(  "카드번호: " +check.cardNo );
			
		}else if( account instanceof MinusAccount ) {
			MinusAccount minus = (MinusAccount)account;
			System.out.println("마이너스 한도금액:"+ minus.minusLimit );
			
		}else if( account instanceof PointAccount ) {
			PointAccount point = (PointAccount)account;
			System.out.println( "포인트: " +point.point );
		}
		
		System.out.println("-------------");
	}
	
}
