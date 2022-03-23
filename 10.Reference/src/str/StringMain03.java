package str;

public class StringMain03 {
	public static void main(String[] args) {
		// 직접코드실습
		String email[] = { 
				  "hong1234@naver.com"
				, "park901231@hanmail.net"
				, "jeon@daum.net"
				, "abcdedf12345@hrd.go.kr"
				, "a45@hrd.go.kr"
				, "aafadf45@gmail.com"
				};
		
		//출력결과    
		//  이메일 : hong1234@naver.com
		//  아이디 : hong1234
		//  이메일서비스 : naver.com
		// 반복문(for문) 으로 이메일에 대해 위의 출력결과처럼 
		// 아이디와 이메일서비스를 분류해서 출력한다.
		
		for( String e : email) {
			int atSign = e.indexOf("@");
			System.out.println( "이메일 : "  + e );
			System.out.println( "아이디 : " + e.substring(0, atSign) );
			System.out.println( "이메일서비스 : " + e.substring(atSign+1) );
			System.out.println("-------------");
		}
		
		
	}
}
