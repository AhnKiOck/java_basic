package account;

public class AccountMain {
	public static void main(String[] args) {
		SharingAccount sa = new SharingAccount();
//		Account hong
//			= new Account("111-22-3333", "홍길동", 700000);
//		Account park
//			= new Account("222-33-4444", "박문수", 150000);
//		sa.hongsAcc = hong;
//		sa.parksAcc = park;
		sa.hongsAcc = new Account("111-22-3333", "홍길동", 700000);
		sa.parksAcc = new Account("222-33-4444", "박문수", 150000);
		
		TransferThread t1 = new TransferThread( sa );
		Thread t2 = new BalanceThread( sa );
		
		t1.start();
		t2.start();
		System.out.println("main쓰레드");
	}
}
