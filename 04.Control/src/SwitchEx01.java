
public class SwitchEx01 {
	public static void main(String[] args) {
		//짝수/홀수를 판단하는 switch 문
		int no = 8;
		switch( no % 2 ) {
		case 0:
			System.out.println(no + ": 짝수");
			break;
		case 1:
			System.out.println(no + ": 홀수");
			break;
		}
		
	}
}
