
public class MethodEx04 {
	public static void main(String[] args) {
		int no=6;
		print(no);
//		System.out.println( no + ": " + triple(no) );
//		System.out.println( no + ": " 
//				+ (triple(no) ? "3의 배수임" : "3의 배수가 아님") );

		no=7;
		print(no);

		no=87;
		print(no);
	
		no=78;
		print(no);

		
//		if( triple(no)  ) {
//			System.out.println(no + ": 3의 배수임");
//		}else {
//			System.out.println(no + ": 3의 배수가 아님");
//		}
	}
	
	static void print(int no) {
		System.out.println( no + ": " + triple(no) );
		System.out.println( no + ": " 
				+ (triple(no) ? "3의 배수임" : "3의 배수가 아님") );
	}
	
	//3의 배수여부(true/false)를 리턴하는 메소드 선언
	static boolean triple(int no) {
		//어떤 수를 3으로 나머지: 0, 1, 2
		boolean result = false;
		switch( no%3 ) {
		case 0:
			result = true;
			break;
		default:
			result = false;
			break;
		}
		return result;
	}
}
