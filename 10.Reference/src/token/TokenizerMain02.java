package token;

import java.util.StringTokenizer;

public class TokenizerMain02 {
	public static void main(String[] args) {
		//문자열:  사과=5,배=20,복숭아=30
		//위 문자열에 대해 토큰을 분리한 결과가 
		//사과=5
		//배=20
		//복숭아=30
		//위와 같이 되도록 StringTokenizer 클래스를 사용해 토큰을 분리해 출력
		StringTokenizer token =
		new StringTokenizer("사과=5,배=20,복숭아=30", ",");
		while( token.hasMoreTokens() ) {
			System.out.println( token.nextToken() );
		}
		
		
		
	}
}
