package runnable;

public class RunnableMain {
	public static void main(String[] args) {
		DigitRunnable digit =  new DigitRunnable();
		AlphabetRunnable alphabet 
					= new AlphabetRunnable();
		//실행시키는 start()는 Thread 를 통해서만 할 수 있다
		Thread t1 = new Thread( digit );
		Thread t2 = new Thread( alphabet );
		Thread t3 = new Thread( new DigitRunnable() );
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main쓰레드");
		
	}
}
