package pi;

public class AreaThread extends Thread{
	SharingArea sa;
	int radius;
	AreaThread(SharingArea sa, int radius){
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
		
		double area = sa.pi * radius * radius;
		System.out.printf("반지름 %d인 원넓이: %.2f \n"
							, radius, area);
	}
}
