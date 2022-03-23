package goods1;

import java.util.Scanner;

public class Input {

	public static int inputInt(Scanner scanner) {
		int result=0;
		while(true) {
			String inputStr = scanner.next();
			try{
				result = Integer.valueOf(inputStr);
				break;
			}catch(Exception e) {
				System.out.println("문자는 인식이 불가합니다. 숫자를 입력해주세요");
				continue;
			}
		}
		return result;
	}
	
	public static boolean intPositive(int num, String txt) {
		if(num<0) {
			System.out.println(txt+"은/는 0 이상의 값을 입력해주세요.");
			return false;
		}else return true;
	}
	
	public static boolean intScope(int num1, int num2, int input, String script) {
		if(num1>num2) {
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		if(num1>input || num2<input) {
			System.out.printf("%s에서 선택 가능한 번호를 입력해주세요(%d~%d)\n", script, num1, num2);
			return false;
		}else return true;
	}
}
