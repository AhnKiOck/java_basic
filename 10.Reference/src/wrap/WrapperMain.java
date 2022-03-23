package wrap;

public class WrapperMain {
	public static void main(String[] args) {
		
		Integer data1 = new Integer( 200000 );
		int intData = data1.intValue();
		System.out.println( intData );
		
		byte no = 12;
		new Byte( no );
		Byte data2 = new Byte( (byte)12 );
		byte byteData = data2.byteValue();
		System.out.println( byteData );
		
		Double data3 = new Double( 3.14 );
		Character data4 = new Character( '봄' );
		Boolean data5 = new Boolean( true );
		
		Boolean data6 = new Boolean( "true" );
		boolean boolData = data6.booleanValue();
		System.out.println( boolData );
		
		Double data7 = new Double( "3.14" );
		
		
		String str1 = "123";
		String str2 = "321";
		System.out.println( str1 + str2 );
		
		//숫자로 된 문자열 간 산술연산
		//String -> int  : 불가
		//int a = (int)str1; 불가
		
		//Wrapper 클래스에는 객체생성없이 사용하는 static 메소드들이 있다
		//parseInt(): 프리미티브 타입으로 리턴하는 메소드
		//valueOf() : Wrapper 타입으로 리턴하는 메소드
		
		int no1 = Integer.parseInt( str1 );  //String -> int
		Integer no2 = Integer.valueOf( str2 );//String -> Integer
		// int + Integer 
		System.out.println(  no1 + no2 );
		
		
		int no3 = no2; //Integer -> int
		//Wrapper 타입이 프리미티브 타입으로 자동변환 : UnBoxing
		
		Integer no4 = no1; // int -> Integer
		//프리미티브 타입이 Wrapper 타입으로 자동변환: AutoBoxing
		
		
		
		
	
	}
}
