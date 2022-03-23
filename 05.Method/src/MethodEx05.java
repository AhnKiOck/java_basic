import java.util.Scanner;

public class MethodEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 어떤수까지의 합을 구할것인지 입력하세요");
		int no = sc.nextInt();
		int sum = accumulate( no );
		System.out.println("1부터 "+ no +"까지의 합: " + sum);
		sc.close();
		
	}//main메소드 끝
	
	//1부터 키보드로 입력한 수까지의 합을 구해서 리턴하는 메소드
	static int accumulate(int no) {
		int sum = 0;
		//1+2+3+...9+10
		for( int i=1; i<=no; i++ ) {
			//sum = sum + i;
			sum += i;
		}
		return sum;
	}
	
}
