import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.등록   2.변경  3.삭제  4.조회");
		System.out.print("선택? ");
		int code = 0;
		do {
			code = Common.numberInput(sc);
			if( code==1 ) 
				System.out.print("번호 다시 입력하세요: "); 
			else if( code==-1 ) 
				System.out.print("문자가 아닌 숫자 번호를 입력하세요: "); 
		}while ( code!=0 ) ;
		sc.close();
	}
	
}
