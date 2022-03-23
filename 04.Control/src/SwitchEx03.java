
public class SwitchEx03 {
	public static void main(String[] args) {
		//어떤 수가 3의 배수인지 판단하는  switch 문
		//수를 3으로 나눈 나머지: 0,1,2 중에 0인 경우가 3의 배수
		int no = 9;
		if( no%3 == 1 || no%3 == 2 ) {
			System.out.println( no + ": 3의 배수가 아님");
		}else {
			System.out.println( no + ": 3의 배수");
		}
		
		no = 5;
		switch( no%3 ) {
		case 1:
		case 2:
			System.out.println( no + ": 3의 배수가 아님");
			break;
		default:
			System.out.println( no + ": 3의 배수");
		}
		
		
	}
}
