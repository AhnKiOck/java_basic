package account;

public class SharingAccount {
	Account hongsAcc; //홍길동 계좌
	Account parksAcc; //박문수 계좌
	synchronized void transfer(int money) {
//		synchronized(this) {
			hongsAcc.withdraw(money);
			System.out.print("홍길동 계좌에서 5만원 출금 -> ");
			parksAcc.deposit(money);
			System.out.println("박문수 계좌에 5만원 입금");
//		}
	}
	synchronized void printBalance() {
//		synchronized(this) {
			int sum 
				= hongsAcc.balance + parksAcc.balance;
			System.out.println("계좌잔액합계: " + sum);
//		}
	}
}
