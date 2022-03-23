package thread;

public class AlphabetThread extends Thread{

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
	}
}
