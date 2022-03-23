package pi;

public class PiThread extends Thread{
	SharingArea sa;
	PiThread(SharingArea sa){
		this.sa = sa;
	}
	
	public void run() {
		double total = 0;
		for(int no=1; no<1000000000; no+=2) {
			if( no / 2 % 2 == 0 ) 	total += 1.0 / no;
			else 					total -= 1.0 / no;
		}
		total *= 4; //total = total*4;
		
		synchronized(sa) {
			sa.pi = total; //계산된 원주율 값을 공유데이터에 저장
			sa.isReady = true;
			sa.notifyAll(); //신호를 보내는 메소드
			//신호를 기다리는 쓰레드가 여러개인 경우 notifyAll
		}
		System.out.println("원주율계산 완료");
	}
}
