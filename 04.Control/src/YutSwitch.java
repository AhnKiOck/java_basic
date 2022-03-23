import java.util.Random;

public class YutSwitch {
	public static void main(String[] args) {
		//윷 던지기
		//막대기 4개를 동시에 던져서 그 결과를 도, 개, 걸, 윷, 모 로 출력
		//도:앞뒤뒤뒤,  개:앞앞뒤뒤,  걸:앞앞앞뒤, 윷:앞앞앞앞, 모:뒤뒤뒤뒤
		//   1000:1     1100:2     1110:3    1111:4     0000:0
		//앞:1, 뒤:0 
		//랜덤한 정수를 추출하기 위한  Random
		Random r = new Random();
		//System.out.println( r.nextInt(2) );
		int bar1 = r.nextInt(2);
		int bar2 = r.nextInt(2);
		int bar3 = r.nextInt(2);
		int bar4 = r.nextInt(2);
		int bar = bar1 + bar2 + bar3 + bar4;   
		System.out.print(bar1==1 ? "앞" : "뒤");
		System.out.print(bar2==1 ? "앞" : "뒤");
		System.out.print(bar3==1 ? "앞" : "뒤");
		System.out.println(bar4==1 ? "앞" : "뒤");
		
		switch( bar ) {
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
		case 4:
			System.out.println("윷");
			break;
		}
		
	}
}
