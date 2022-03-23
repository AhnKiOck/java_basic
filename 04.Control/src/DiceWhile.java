import java.util.Random;

public class DiceWhile {
	public static void main(String[] args) {
		//사용자와 컴퓨터간의 주사위 게임
		//주사위를 동시에 던져서 더 큰 수가 나오면 이기는 게임
		//승패를 가리도록 같은 수가 나오면 다시 던지기
		//주사위 숫자 1~6
		Random r = new Random();
		int user, computer;
		/*
		System.out.println("주사위를 던지세요~");
		user = r.nextInt(6) + 1;
		computer = r.nextInt(6) + 1;
		System.out.printf(
				"사용자: %d,  컴퓨터: %d \n", user, computer);
		
		while( user == computer ) {
			System.out.println("주사위를 던지세요~");
			user = r.nextInt(6) + 1;
			computer = r.nextInt(6) + 1;
			System.out.printf(
					"사용자: %d,  컴퓨터: %d \n", user, computer);
		}

		if( user > computer ) {
			System.out.println("사용자 승!");
		}else if( user < computer ) {
			System.out.println("컴퓨터 승!");
		}
		*/
		
		do {
			System.out.println("주사위를 던지세요~");
			user = r.nextInt(6) + 1;
			computer = r.nextInt(6) + 1;
			System.out.printf(
				"사용자: %d,  컴퓨터: %d \n", user, computer);
			
			if( user > computer ) {
				System.out.println("사용자 승!");
			}else if( user < computer ) {
				System.out.println("컴퓨터 승!");
			}
		}while( user == computer );

	}
}
