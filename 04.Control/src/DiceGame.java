//import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
		//두 사람(홍길동, 전우치)이 두 개의 주사위를 던져서 합한 수만큼 이동하는 주사위게임.
		//50칸 이 있는 말판을 끝까지 이동하면 게임이 끝난다.
		//두 개의 주사위의 수가 같으면 추가로 한 번 더 던질 수 있는 기회가 있다
		//45, 48 -> 50, 53 : 무승부
		java.util.Random r = new java.util.Random();
		
		int /* dice1, dice2, */hong=0, jeon=0, round=1;
//		boolean same = false;
		while( true ) {
			System.out.printf("[%d회차] 주사위를 던지세요~\n", round++);
			
			//홍길동
			hong = throwDice(hong, "홍길동");
				
			//전우치
			jeon = throwDice(jeon, "전우치");
			
			if( hong>=50 && jeon>=50 ) {
				System.out.println("무승부!");
				break;
			}else if( hong>=50 ) {
				System.out.println("홍길동 승^^");
				break;
			}else if( jeon>=50 ) {
				System.out.println("전우치 승^^");
				break;
			}
			
		}
		

	}//main 메소드끝
	
	//주사위 던지기 메소드
	static int throwDice(int player, String name) {
		java.util.Random r = new java.util.Random();
		boolean same = false;
		do {
			int dice1 = r.nextInt(6)+1;
			int dice2 = r.nextInt(6)+1;
			player += dice1 + dice2;
			System.out.printf(
			"%s: (%d,%d) %d칸 이동 --> 최종위치 %d칸 \n"
					, (same ? "추가" : name)
					, dice1, dice2, dice1+dice2, player);
			if( dice1==dice2 ) {
				System.out.println(name + " 한 번 더~");
				same = true;
			}else 
				same = false;
		}while(same);
		return player;
	}
	
	
}
