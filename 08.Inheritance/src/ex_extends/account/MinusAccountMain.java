package ex_extends.account;

public class MinusAccountMain {
	public static void main(String[] args) {
//		MinusAccount(String accountNo, String owner
//				, int minusLimit, int balance){
		MinusAccount sim
		= new MinusAccount("111-22-3333", "심청", 1000000, 50000);
		
		try {
			int output = sim.withdraw( 200000 );
			System.out.println("출금된 금액: " + output);
			System.out.println("계좌잔액: " + sim.balance );
			System.out.println("마이너스 한도금액: " + sim.minusLimit);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
