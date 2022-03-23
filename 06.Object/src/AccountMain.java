
public class AccountMain {
	public static void main(String[] args) {
		//전우치 씨의 은행계좌 생성
		Account jeon = new Account("222-33-4444", "전우치");
		System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
				, jeon.owner, jeon.accountNo, jeon.balance);
		
		//박문수씨 의 은행계좌 생성
		//5만원을 내면서 개설 요청
//		Account park = new Account("333-44-5555", "박문수", 50000);
//		System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
//				, park.owner, park.accountNo, park.balance);
		
		
		//홍길동씨의 은행계좌 생성
		Account hong = new Account();
		hong.owner = "홍길동";
		hong.accountNo = "111-22-3333";
		System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
					, hong.owner, hong.accountNo, hong.balance);
		
		hong.deposit(50000);
		System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
				, hong.owner, hong.accountNo, hong.balance);
		
		int money;
		money = 30000;
		
		//익셉션을 발생시켜 던지는 처리가 된 메소드를 호출시
		//익셉션에 대해 미리 대비를 한다. - try ~ catch 문
		try {
			int outputMoney = hong.withdraw(money);
			System.out.printf("출금요청금액: %d원, 출금된 금액: %d원 \n"
								, money, outputMoney);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
				, hong.owner, hong.accountNo, hong.balance);
		
		money = 100000;
		try {
			int outputMoney = hong.withdraw(100000);
			System.out.printf("출금요청금액: %d원, 출금된 금액: %d원 \n"
					, money, outputMoney);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.printf("%s 계좌[%s] 잔고: %d원 \n"
				, hong.owner, hong.accountNo, hong.balance);
		}
		
		
		
	}
}
