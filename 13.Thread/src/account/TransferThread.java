package account;

//홍길동 계좌에서 박문수계좌로 이체
public class TransferThread extends Thread{
	SharingAccount sa;
	TransferThread(SharingAccount sa){
		this.sa = sa;
	}
	
	public void run() {
		for( int no=1; no<=10; no++ ) {
			sa.transfer(50000);
//			synchronized(sa) {
//				sa.hongsAcc.withdraw(50000);
//				System.out.print("홍길동 계좌에서 5만원 출금 -> ");
//				sa.parksAcc.deposit(50000);
//				System.out.println("박문수 계좌에 5만원 입금");
//			}
		}
	}
}
