package runnable;

public class NumbersMain {
	public static void main(String[] args) {
		NumbersThread n1 = new NumbersThread();
		Thread t1 = new Thread( n1 );
		t1.start();
		System.out.println("main쓰레드");
	}
}
