package thread;

public class VideoSMIMain {
	public static void main(String[] args) {
		SMIThread smi = new SMIThread();
		VideoThread video = new VideoThread();
		smi.start();
		video.start();
		System.out.println("main");
	}
}
