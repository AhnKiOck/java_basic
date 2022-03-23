package thread;

public class SMIThread extends Thread{

	public void run() {
		
		try {
			Thread.sleep(50); //0.05초간 대기
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		String subtitle[] = { "하나", "둘", "셋", "넷", "다섯" };
		for(int idx=0; idx<subtitle.length; idx++) {
			System.out.println("(자막) " + subtitle[idx]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
