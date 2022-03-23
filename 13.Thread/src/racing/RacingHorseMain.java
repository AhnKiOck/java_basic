package racing;

public class RacingHorseMain {
	public static void main(String[] args) {
		//직접코드실습
		//경주마 5마리가 100미터 경주를 하는 멀티쓰레드 프로그램을 작성한다
		//1. 경주마 클래스를 선언한다
		//   말이 쓰레드가 되어 달리도록 한다
		SharingHorse sh = new SharingHorse();
		Horse h1 = new Horse(sh, "강토마", 1);
		Horse h2 = new Horse(sh, "흑전사", 2);
		Horse h3 = new Horse(sh, "흥행질주", 3);
		Horse h4 = new Horse(sh, "거센질주", 4);
		Horse h5 = new Horse(sh, "바람을그리다", 5);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
		//2. 경주마가 달리면서 20미터 간격으로 
		//		현재 달리고 있는 지점과 경주마이름을 출력
		//      시간차가 발생할 수 있도록 sleep(1000) 을 준다
		//3. 도착지점(100미터지점) 에서 어떤 말이 몇 등으로 도착했는지를
		//    순위와 함께 출력한다
		// sa.rank = 1;
		// System.out.print("1번말" + sa.rank );
		//4. 공유영역에는 순위필드가 있어야 한다 - 동기화처리를 넣는다
		
		
	}
}
