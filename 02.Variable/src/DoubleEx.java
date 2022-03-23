
public class DoubleEx {
	public static void main(String[] args) {
		 double pi = 3.14; //초기화 : 31.4 * 0.1, 0.314 * 10 
		 System.out.println( pi );
		 pi = pi + 1;
		 System.out.println( pi );
		 //출력표현형식 지정 
		 //: 숫자중 정수 %d, 숫자중 부동소수 %f, 문자 %c, 문자열  %s
		 System.out.printf( "pi + 1 = %.2f",  pi );
		 
		 float no = 3.14F; //3.14f
	}
}
