package thread;

public class ThreadMain01 {
	public static void main(String[] args) {
		
		DigitThread thread1 = new DigitThread();
		//쓰레드 클래스의 run()메소드 자동호출
		//: start() 로 시작시킨다
		thread1.start();
		
		AlphabetThread thread2 = new AlphabetThread();
		AlphabetThread thread3 = new AlphabetThread();
		thread2.start();
		thread3.start();
		
		System.out.println("main");
	
	}
}
