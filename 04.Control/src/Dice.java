import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		//사용자와 컴퓨터간의 주사위 게임
		//주사위를 동시에 던져서 더 큰 수가 나오면 이기는 게임
		//주사위 숫자 1~6
		
		//랜던한 수를 발생시키는 기능이 있는 Random
		Random r = new Random();
		//1~100까지의 수 중에서 랜덤하게 나오게
		//0~99까지 100개의 수 중에 하나가 나온다
		//System.out.println(  r.nextInt(100)+1 );
		
		//1~6 <- 0~5 + 1
		//System.out.println( r.nextInt(6) + 1 );
		
		//주사위를 던진다
		System.out.println("주사위를 던지세요~");
		int user = r.nextInt(6)+1;
		int computer = r.nextInt(6)+1;
		System.out.println(
			"사용자: " + user + ", 컴퓨터: " + computer);
		
		//사용자가 이기는 경우, 컴퓨터가 이기는 경우, 비기는 경우
		if( user > computer ) {
			System.out.println("사용자 승^^");
		}else if( user == computer ) {
			System.out.println("무승부");
		}else {
			System.out.println("컴퓨터 승ㅠㅠ");
		}
		
		
	}
}
