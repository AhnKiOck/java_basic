package pi;

public class SharingMain {
	public static void main(String[] args) {
		SharingArea sa = new SharingArea();
		PiThread t1 = new PiThread(sa);
		PrintThread t2 = new PrintThread(sa);
		Thread t3 = new CircumThread(sa, 5);
		Thread t4 = new AreaThread(sa, 5);
		Monitoring m1 = new Monitoring( t1, "원주율계산");
		Monitoring m2 = new Monitoring( t2, "원주율출력");
		Monitoring m3 = new Monitoring( t3, "원둘레");
		Monitoring m4 = new Monitoring( t4, "원넓이");
		
//		//필드의 초기화
//		t1.sa = sa;
//		t2.sa = sa;
		
		t4.start();
		t3.start();
		t1.start();
		t2.start();
		
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
	}
}
