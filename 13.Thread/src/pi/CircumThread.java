package pi;

public class CircumThread extends Thread{
	SharingArea sa;
	int radius;
	CircumThread(SharingArea sa, int radius){
		this.sa = sa;
		this.radius = radius;
	}
	public void run() {
		if( !sa.isReady ) {
			synchronized(sa) {
				try {
					sa.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//원둘레를 출력한다
		double circum = 2 * sa.pi * radius;
		System.out.printf("반지름 %d인 원둘레: %.2f \n"
								, radius, circum );
	}
}
