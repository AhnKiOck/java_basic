package thread;

public class DigitThread extends Thread{
	//클래스가 실행될 수 있도록 main에 해당하는 메소드를 선언한다:  run()
	public void run() {
		//0~9 숫자를 출력
		for(int no=0; no<10; no++) {
			System.out.println(no);
			//시간간격을 두고 처리되도록
			//일정시간 기다리게끔 만든다
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("digit");
	}
	
}
