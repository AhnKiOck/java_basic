package pi;

public class PrintThread extends Thread{
	SharingArea sa;
	PrintThread(SharingArea sa){
		this.sa = sa;
	}
	public void run() {
//		try {
//			Thread.sleep(5000);
//			System.out.println( "계산된PI: " + sa.pi );
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//신호가 오기를 기다린다
		//원주율계산 처리가 완료되지 않았다면 신호를 기다리도록 한다
		if( !sa.isReady ) {
			synchronized(sa) {
				try {
					sa.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println( "계산된PI: " + sa.pi );
	}
}
