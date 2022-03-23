
public class SwitchEx02 {
	public static void main(String[] args) {
		//어떤 수가 3의 배수인지 판단하는  switch 문
		//수를 3으로 나눈 나머지: 0,1,2 중에 0인 경우가 3의 배수
		int no = 6;
		switch( no%3 ) {
		case 0:
			System.out.println(no + ": 3의 배수");
			break;
		case 1:
			System.out.println(no + ": 3의 배수가 아님");
			break;
		case 2:
			System.out.println(no + ": 3의 배수가 아님");
			break;
		}
		
		if( no%3 == 0 ) {
			System.out.println(no + ": 3의 배수");
		}else if( no%3 == 1 ) {
			System.out.println(no + ": 3의 배수가 아님");
		}else if( no%3 == 2 ) {
			System.out.println(no + ": 3의 배수가 아님");
		}
		
		switch( no%3 ) {
		case 0:
			System.out.println(no + ": 3의 배수");
			break;
		default:
			System.out.println(no + ": 3의 배수가 아님");
			break;
		}
		
		//switch 문의 형태를 if문으로 변경해 본다
		if( no%3 == 0 ) {
			System.out.println(no + ": 3의 배수");
		}else {
			System.out.println(no + ": 3의 배수가 아님");
		}
		
		
		
		
		
	}
}
