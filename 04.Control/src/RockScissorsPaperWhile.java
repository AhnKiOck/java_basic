import java.util.Random;

public class RockScissorsPaperWhile {
	public static void main(String[] args) {
		//두 사람이 가위바위보를 한다
		//가위0 바위1 보2 
		//do~while 문으로 같은 것을 내는 경우는 
		//가위바위보를 다시 해서 승자를 결정하도록 하는 프로그램
		//가위 > 보, 바위 > 가위, 보 > 바위
		//0>2      1>0       2>1
		Random r = new Random();
		
		int scissors=0, rock=1, paper=2;
		int hong, jeon;
		
		do {
			System.out.println("가위바위보!");
			hong = r.nextInt(3);
			jeon = r.nextInt(3);
			System.out.println(
			"홍길동: " + (hong==0 ? "가위" : (hong==1 ? "바위" : "보")) );
			System.out.println(
			"전우치: " + (jeon==0 ? "가위" : (jeon==1 ? "바위" : "보")) );
		}while( hong==jeon );
		
		//0>2      1>0       2>1
		if( hong==0 && jeon==2 
				|| hong==1 && jeon==0  
				|| hong==2 && jeon==1 ) {
			System.out.println("홍길동 승!");
		}else {
			System.out.println("전우치 승!");
		}
		
		/*
		if( hong==0 ) {
			if( jeon==1 ) {
				System.out.println("전우치 승!");
			}else if( jeon==2 ) {
				System.out.println("홍길동 승!");
			}
		}else if( hong==1 ) {
			if( jeon==0 ) {
				System.out.println("홍길동 승!");
			}else {
				System.out.println("전우치 승!");
			}
		}else if( hong==2 ) {
			if( jeon==0 ) {
				System.out.println("전우치 승!");
			}else {
				System.out.println("홍길동 승!");
			}
		}
		*/
	}
}
