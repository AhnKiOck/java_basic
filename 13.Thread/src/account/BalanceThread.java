package account;

//두 통장의 잔고를 합쳐 출력
public class BalanceThread extends Thread{
	SharingAccount sa;
	BalanceThread(SharingAccount sa){
		this.sa = sa;
	}
	public void run() {
		for(int no=1; no<=5; no++) {
			sa.printBalance();
//			synchronized(sa) {
//				int sum 
//					= sa.hongsAcc.balance + sa.parksAcc.balance;
//				System.out.println("계좌잔액합계: " + sum);
//			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
