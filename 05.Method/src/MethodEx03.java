
public class MethodEx03 {
	public static void main(String[] args) {
		String result = oddEven(10);
		System.out.println("10: " + result );
		
		System.out.println("15: " + oddEven(15) );
	}//main메소드끝
	
	//짝수/홀수를 판단하여 문자열을 리턴하는 메소드를 선언
	static String oddEven(int no) {
		String result;// = "";
		switch( no%2 ) {
		case 0:
			result = "짝수";
			break;
		//case 1:
		default:
			result = "홀수";
			break;
		}
		return result;
	}

	
	
}
