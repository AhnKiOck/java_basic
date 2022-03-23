import java.util.Scanner;

public class Common {
	static int numberInput(Scanner sc) {
		int input = 0;
		try {
			input =  Integer.valueOf( sc.next() ) ;
		}catch(NumberFormatException e) {
			return -1;
		}
		if( input < 1 || input > 4 ) {
			return 1;
		}else return 0;
	}
}
