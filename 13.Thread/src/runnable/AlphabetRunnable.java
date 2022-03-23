package runnable;

public class AlphabetRunnable implements Runnable{
	public void run() {
		//A~Z 알파벳을 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println( ch );
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("알파벳");
	}
}
