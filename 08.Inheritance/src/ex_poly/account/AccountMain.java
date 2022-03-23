package ex_poly.account;

public class AccountMain {
	public static void main(String[] args) {
		CheckCardAccount jeon
		= new CheckCardAccount(
			"111-22-3333", "전우치", "4444-5555-6666-7777", 50000);
		//통장정보출력하기
		printAccount(jeon);
		
		MinusAccount park
		= new MinusAccount(
				"222-33-4444", "박문수", 1000000, 30000);
		//통장정보출력하기
		printAccount(park);
		
		PointAccount sim 
			= new PointAccount("333-44-5555", "심청", 50000);
		printAccount(sim);
	}
	
	static void printAccount(PointAccount account) {
		System.out.println("포인트누적 통장 ---------");
		System.out.println("예금주: " + account.owner);
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("잔액: " + account.balance );
		System.out.println("포인트: " + account.point );
		System.out.println("--------------------");
	}
	
	static void printAccount(MinusAccount account) {
		System.out.println("마이너스 통장 ---------");
		System.out.println("예금주: " + account.owner);
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("잔액: " + account.balance );
		System.out.println("마이너스 한도금액: " + account.minusLimit );
		System.out.println("--------------------");
	}

	static void printAccount(CheckCardAccount account) {
		System.out.println("체크카드 통장 -----------");
		System.out.println("예금주: " + account.owner);
		System.out.println("계좌번호: " + account.accountNo);
		System.out.println("잔액: " + account.balance );
		System.out.println("카드번호: " + account.cardNo);
		System.out.println("--------------------");
	}
	
	
}
