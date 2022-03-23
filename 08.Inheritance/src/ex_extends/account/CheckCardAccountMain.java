package ex_extends.account;

public class CheckCardAccountMain {
	public static void main(String[] args) {
//		CheckCardAccount hong = new CheckCardAccount();
//		hong.accountNo = "111-22-3333";
//		hong.owner = "홍길동";
//		hong.cardNo = "5555-6666-7777-8888";
		CheckCardAccount hong 
		= new CheckCardAccount("111-22-3333", "홍길동", "5555-6666-7777-8888");
		
		hong.deposit(50000);
		
		try{
			int paid = hong.pay("5555-6666-7777-8888", 147000);
			System.out.println("체크카드 결제금액: " + paid);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("계좌 잔액: " + hong.balance);
		}
		
		
		
		
		
	}
}
