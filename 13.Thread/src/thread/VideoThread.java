package thread;

public class VideoThread extends Thread{
	public void run() {
		int[] no = { 1, 2, 3, 4, 5 };
		for(int i=0; i<no.length; i++) {
			System.out.print(
				"[비디오 프레임] " + no[i] + " - ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
