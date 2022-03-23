import java.util.Random;
public class Yut {
	public static void main(String[] args) {
		//윷 던지기
		//네 개의 막대기를 던져서 
		//도(앞뒤뒤뒤), 개(앞앞뒤뒤) , 걸(앞앞앞뒤),  윷(앞앞앞앞), 모(뒤뒤뒤뒤)
		Random r = new Random();
		int bar1 = r.nextInt(2); //0:앞, 1:뒤
		int bar2 = r.nextInt(2); 
		int bar3 = r.nextInt(2); 
		int bar4 = r.nextInt(2); 
		System.out.print( bar1==0 ? "앞" : "뒤");
		System.out.print( bar2==0 ? "앞" : "뒤");
		System.out.print( bar3==0 ? "앞" : "뒤");
		System.out.println( bar4==0 ? "앞" : "뒤");
		
		//도(앞뒤뒤뒤), 개(앞앞뒤뒤) , 걸(앞앞앞뒤),  윷(앞앞앞앞), 모(뒤뒤뒤뒤)
		//0111 :3      0011:2      0001:1      0000:0     1111:4
		int bar = bar1 + bar2 + bar3 + bar4;
		if( bar==0 ) {
			System.out.println("윷");
		}else if( bar==1 ) {
				System.out.println("걸");
		}else if( bar==2 ) {
			System.out.println("개");
		}else if( bar==3 ) {
			System.out.println("도");
		}else if( bar==4 ) {
			System.out.println("모");
		}
		
		//윷을 던진 결과를 출력하는  if 문
		/*
		if( bar1==0 && bar2==1 && bar3==1 && bar4==1 ) {
			System.out.println("도");
		}else if( bar1==1 && bar2==0 && bar3==1 && bar4==1 ) {
			System.out.println("도");
		}else if( bar1==1 && bar2==1 && bar3==0 && bar4==1 ) {
			System.out.println("도");
		}else if( bar1==1 && bar2==1 && bar3==1 && bar4==0 ) {
			System.out.println("도");
		}
		if( (bar1==0 && bar2==1 && bar3==1 && bar4==1)
				|| ( bar1==1 && bar2==0 && bar3==1 && bar4==1 )
				|| ( bar1==1 && bar2==1 && bar3==0 && bar4==1 )
				|| ( bar1==1 && bar2==1 && bar3==0 && bar4==1 )
			) {
			System.out.println("도");
		}
		*/
		
	}
}
