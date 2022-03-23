package racing;

public class Horse extends Thread{
	SharingHorse sh;
	String name;
	int no;
	
	Horse(SharingHorse sh, String name, int no){
		this.sh = sh;
		this.name = name;
		this.no = no;
	}
	
	public void run() {
		//2. 경주마가 달리면서 20미터 간격으로 
		//		현재 달리고 있는 지점과 경주마이름을 출력
		//      시간차가 발생할 수 있도록 sleep(1000) 을 준다
		for(int m=0; m<=100; m+=20 ) {
			if( m==0 ) {
				System.out.printf(
					"%d번 경주마 [%s] 막 출발! \n", no, name );
			}else if( m==100 ) {
				sh.finishLine(no, name);
				/*
				synchronized(sh) {
					sh.rank++;
					System.out.printf("%d위 %d번 경주마 [%s] \n"
											, sh.rank, no, name);
				}
				*/
			}else {
				System.out.printf(
					"현재 %dm 지점 통과 %d번 경주마 [%s] \n", m, no, name);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
			
		}
		
//		for(int m=0; m<100; m++ ) {
//			if( m%20==0 ) {
//			}
//		}
		
		//3. 도착지점(100미터지점) 에서 어떤 말이 몇 등으로 도착했는지를
		//    순위와 함께 출력한다
//		synchronized(sh) {
//			sh.rank++;
//			System.out.printf("%d위 %d번 경주마 [%s] \n"
//									, sh.rank, no, name);
//		}
		
	}
	
}
