package ex_extends.account;

public class AccountMain {
	public static void main(String[] args) {
//		Account hong = new Account();
//		hong.accountNo = "111-22-3333";
//		hong.owner = "홍길동";
		Account hong = new Account("111-22-3333", "111-22-3333");
		
		hong.deposit(50000);
		
		try {
			int out = hong.withdraw(10000);
			System.out.println("출금된금액: " + out);
			System.out.println("계좌 잔액: " + hong.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}




