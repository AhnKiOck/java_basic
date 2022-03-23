package pi;

public class Monitoring extends Thread{
	Thread thread; //상태를 모니터링할 대상 쓰레드
	
	Monitoring(Thread thread, String name){
		this.thread = thread;
		thread.setName(name);
	}
	
	public void run() {
		while( true ) {
			Thread.State state = thread.getState();
			System.out.printf(
				"[%s]: %s \n", thread.getName(), state);
			
			//종료된 쓰레드에 대해서는 더이상 모니터링 할 필요가 없다
			if( state == Thread.State.TERMINATED ) break;
			
			try {
				Thread.sleep(1000); //1초 간격으로 모니터링하기
			} catch (InterruptedException e) {
			}
		}
	}
}
