package str;

public class StringMain {
	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		//String 타입은 동일한 문자열의 인스턴스는 하나만 생성하고 주소값을 공유한다
		
		if( str1 == str2 ) {
			System.out.println("같은 인스턴스");
		}else {
			System.out.println("다른 인스턴스");
		}
	
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		
		//참조값이 같은지 비교
		if( str3 == str4 )
			System.out.println("같은 인스턴스");
		else
			System.out.println("다른 인스턴스");
		
		//데이터값이 같은지 비교
		if( str3.equals(str4) )
			System.out.println("같은 데이터값");
		else
			System.out.println("다른 데이터값");
			
		
		str1 += "여러분"; //안녕여러분
		
		
		
		
	}
}
