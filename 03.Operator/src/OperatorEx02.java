
public class OperatorEx02 {
	public static void main(String[] args) {
		int su = 5, result;
		result = ++su; //su+1-> su:6, su-> result:6 
		System.out.println("result: " + result + ", su: " + su);
		
		result = su++; //su-> result:6, su+1-> su:7
		System.out.println("result: " + result + ", su: " + su);
		
		result = --su; //su-1-> su:6, su-> result:6
		System.out.println("result: " + result + ", su: " + su);
		
		result = su--; //su-> result:6, su-1-> su:5
		System.out.println("result: " + result + ", su: " + su);
		
//		 ++변수 : 변수+1-> 변수에 담기고, 그 변수가 사용됨
//		   --변수 : 변수-1-> 변수에 담기고, 그 변수가 사용됨
//		     변수++ : 변수가 사용이 되고 난 후 변수+1-> 변수에 담긴다.
//		     변수-- : 변수가 사용이 되고 난 후 변수-1-> 변수에 담긴다
		
		//특정기호 표현하지 위한 형태 \ 를 사용함
		//tab: \t, enter: \n, " : \"
		System.out.println("여러분~ \t반갑습니다");
		System.out.println("여러분~ \n반갑습니다");
		System.out.println("\"여러분~ 반갑습니다\"");
		
		
		int a = 1, b = 3, sum;
		sum = a + ++b; //a:1 , b:b+1->b:4, sum:1+4:5
		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
		
		a = 1; b = 3;	//a:1, b:3 : b+1->b:4, sum:a+b:1+3:4
		sum = a + b++;
		System.out.printf("a:%d, b:%d, sum:%d \n", a, b, sum);
		
		//출력형식을 지정: printf 
		//정수: %d, 실수: %f, 문자: %c, 문자열: %s
		//print, println
		//출력형식을 지정
		
		int no = 1;
		no++;  // no = no+1;
		System.out.println( no );
		no--;
		--no;
		++no;
		
		//비교연산자: 참/거짓의 결과
		System.out.println("10 > 5 ? " + (10 > 5) );
		
		no = 10;
		//변수는 동일한 변수명을 여러개 선언(재선언)할 수 없다.
		boolean tf = 10 <= 5;
		System.out.println("10 <= 5 ? " + tf );
		
		tf = 10 == 5;
		System.out.println("10 == 5 ? " + tf );

		tf = 10 != 5;
		System.out.println("10 != 5 ? " + tf );
		
	}
}
