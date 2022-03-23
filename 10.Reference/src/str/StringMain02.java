package str;

public class StringMain02 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍 입문";
		//문자열의 길이를 리턴하는 메소드: length()
		
		System.out.println( str.length() );
		
		//문자열 일부를 리턴하는 메소드:  substring()
		System.out.println( str.substring(3, 8) ); //3 ~ (8-1)까지 리턴
		//3~(8-3)개의 문자열을 리턴하는 형태
		System.out.println( str.substring(3) ); //3~끝까지 리턴
		
		//문자열과 문자열을 연결하는 메소드:  concat()
		String str1 = "Do it! ";
		System.out.println( str1.concat(str) );
		System.out.println( str1 );
		str1 = str1.concat( str );
		System.out.println( str1 );
		
		str1 = " Do it! ";
		System.out.println( "["+ str1 + "]" );
		//문자열에서 앞뒤 공백 제거하여 리턴하는 메소드: trim()
		System.out.println( "[" + str1.trim() + "]");
		System.out.println( "[" + str1 + "]");
		str1 = str1.trim();
		System.out.println( "[" + str1 + "]");
		
		//영문자에 대한 대/소문자화 메소드 : toUpperCase()/toLowerCase()
		System.out.println( str1.toUpperCase() );
		System.out.println( str1.toLowerCase() );
		
		//문자열 변경 메소드: replace()
		System.out.println( "변경전: " + str );
		str = str.replace("자바", "Java");
		System.out.println( "변경후: " +str );
		
		str = str.replace( "a", "A" );
		System.out.println( "변경후: " +str );
		
		
		//문자열에서 특정 문자열의 시작위치를 리턴하는 메소드
		//: indexOf(), lastIndexOf()
		str = "문자열에서 특정 문자나 문자열의 시작위치를 리턴하는 메소드";
		//     0         9    13
		//왼쪽 끝에서부터 첫 번째로 만나는 문자열 시작위치: 0
		System.out.println( str.indexOf("문자열") );
		//오른쪽 끝에서부터 첫 번째로 만나는 문자열 의 시작위치: 13
		System.out.println( str.lastIndexOf("문자열") );
		
		
		//왼쪽 6 위치에서부터 첫 번째로 만나는 문자열 시작위치: 13
		System.out.println( str.indexOf("문자열", 6) );
		//왼쪽 6 위치에서부터 첫 번째로 만나는 문자 시작위치: 9
		System.out.println( str.indexOf("문자", 6) );
		
		//왼쪽 10 위치에서부터 왼쪽방향으로 첫번쨰 만나는 문자  의 위치: 9
		System.out.println( str.lastIndexOf("문자", 10));
		
		
		//문자열에서 특정 구분자를 기준으로 분리한 데이터가 배열의 형태로 리턴하는 메소드
		//: split(구분자);
		String phone = "010-1234-5678";
		String tel[] = phone.split("-");
		System.out.println(tel[0]);
		System.out.println(tel[1]);
		System.out.println(tel[2]);
		
	}
}
