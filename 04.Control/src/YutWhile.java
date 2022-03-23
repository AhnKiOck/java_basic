import java.util.Random;

public class YutWhile {
	public static void main(String[] args) {
		// 윷던지기 - 앞1, 뒤0
		// 도:앞뒤뒤뒤   개:앞앞뒤뒤    걸:앞앞앞뒤    윷:앞앞앞앞   모:뒤뒤뒤뒤
		//    1000:1  1100:2   1110:3   1111:4    0000:0
		// 윷, 모 가 나오면 한 번 더 던질수 있다
		Random r = new Random();
		int yut;
		do {
			System.out.println("던지세요~");
			int bar1 = r.nextInt(2);
			int bar2 = r.nextInt(2);
			int bar3 = r.nextInt(2);
			int bar4 = r.nextInt(2);
			System.out.print(bar1==1 ? "앞" : "뒤");
			System.out.print(bar2==1 ? "앞" : "뒤");
			System.out.print(bar3==1 ? "앞" : "뒤");
			System.out.print(bar4==1 ? "앞" : "뒤");
			
			yut = bar1 + bar2 + bar3 + bar4; 
			System.out.print(" --> ");
			
			//if 문을  switch~case  문으로 변경
			switch( yut ) {
			case 0:
				System.out.println("모");
				break;
			case 1:
				System.out.println("도");
				break;
			case 2:
				System.out.println("개");
				break;
			case 3:
				System.out.println("걸");
				break;
			default: //case 4:
				System.out.println("윷");
				break;
			}
			
			if( yut==0 ) {
				System.out.println("모");
			}else if( yut==1 ) {
				System.out.println("도");
			}else if( yut==2 ) {
				System.out.println("개");
			}else if( yut==3 ) {
				System.out.println("걸");
			}else {
			//}else if( yut==4 ) {
				System.out.println("윷");
			}
			
			if( yut==4 || yut==0 ) {
				System.out.println("한 번 더~");
			}
			
		}while( yut==4 || yut==0 );
		
		
	}
}
