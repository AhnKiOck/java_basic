
package str;

public class StringBuilderMain {
	public static void main(String[] args) {
		StringBuilder sb 
			= new StringBuilder(); // 기본 버퍼가 16인 객체가 생성된다
		System.out.println( sb.capacity() );
		
		sb = new StringBuilder( "안녕" ); //기본버퍼 16 + 문자열길이
		System.out.println( sb.capacity() + ", " + sb.length() );
		
		//저장할 문자열의 길이 를 추측할 수 있다면 버퍼크기를 처음부터 크게 잡아서 생성가능
		sb = new StringBuilder( 100 );
		System.out.println( sb.capacity() );

		//문자열을 변경할 수 있다.
		sb.append( "안녕" );
		System.out.println( sb );
		sb.append( ", 즐거운 하루" );
		System.out.println( sb );
		
		//문자열을 특정 위치에 삽입할 수 있다: insert()
		sb.insert(4, "여러분~");
		System.out.println( sb );
		
		//문자열의 특정 위치에 있는 문자열을 삭제할 수 있다: delete()
		sb.delete(8, 11);
		System.out.println( "sb: " + sb );
		//안녕, 여러분~ 하루
		
		String str = "안녕, " + "여러분~ " + "하루";
		System.out.println( "str: "+ str );
		
		if( str.equals(sb) ) //String 타입과 StringBuilder 타입
			System.out.println("같음");
		else
			System.out.println("다름");
		
//		String result = sb.toString();
		
		if( str.equals(sb.toString()) )
			System.out.println("같음");
		else
			System.out.println("다름");
		
		System.out.println( str.hashCode() );
		System.out.println( sb.toString().hashCode() );
		
	}
}
