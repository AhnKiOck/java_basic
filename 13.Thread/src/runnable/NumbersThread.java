package runnable;

import thread.Numbers;

public class NumbersThread extends Numbers implements Runnable{
	public void run() {
		list(10, 20);
	}
}
