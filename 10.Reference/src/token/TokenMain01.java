package token;

public class TokenMain01 {
	public static void main(String datas[]) {
		
		int sum = 0;
		for( int idx=0; idx<datas.length; idx++) {
			System.out.println( datas[idx] );
			//String -> int  
			sum += Integer.parseInt( datas[idx] );
		}
		System.out.println( "합: " + sum );
		
		sum = 0;
		System.out.println("--------");
		for( String str : datas ) {
			System.out.println(str);
			sum += Integer.valueOf(str);
		}
		System.out.println( "합: " + sum );
		
		
		
	}
}
