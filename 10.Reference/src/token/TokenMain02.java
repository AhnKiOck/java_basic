package token;

import java.util.StringTokenizer;

public class TokenMain02 {
	public static void main(String[] args) {
		//Program Arguments 에 
		//사과=10 배=35 귤=15 라고 입력한 후 실행했을때
		//아래과 같이 출력되게 프로그램을 작성한다.
		//사과=10
		//배=35
		//귤=15
		//합:60
		int sum = 0;
		for(String fruit : args ) {
			System.out.println(fruit);
			sum += Integer.parseInt( fruit.split("=")[1] );
//			String data[] = fruit.split("=");
//			sum += Integer.parseInt( data[1] ); //String -> int
		}
		System.out.println("합: "  + sum);
		System.out.println("----------");
		
		
		sum = 0;
		for(String fruit : args ) {
			System.out.println(fruit);
			int pos = fruit.indexOf("=")+1;
			sum += Integer.parseInt( fruit.substring(pos) );
		}
		System.out.println("합: "  + sum);
		System.out.println("----------");
		
		
		StringTokenizer token;
		sum = 0;
		for(String fruit : args ) {
			System.out.println(fruit);
			token = new StringTokenizer( fruit, "=" );
			int no=0;
			while(token.hasMoreTokens()) {
				String str = token.nextToken();
				if(no==1) sum += Integer.valueOf( str  );
				no++;
			}
		}
		System.out.println("합: "  + sum);
		System.out.println("----------");
		
	}
}
