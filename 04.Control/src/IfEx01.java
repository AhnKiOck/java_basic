
public class IfEx01 {
	public static void main(String[] args) {
		//두 수 중에 어떤 수가 더 큰 수 인지 출력
		int no1 = 5, no2 = 10;
		if( no1 > no2 ) {  // 5 > 10 : F
			System.out.printf("%d가 %d보다 더 큰 수 \n", no1, no2);
		}
		if( no1 <= no2 ) {//5 <= 10 : true
			System.out.printf("%d는 %d과 같거나 더 작은 수 \n", no1, no2);
		}
	
		//아빠나이와 엄마나이를 비교해서 출력
		int dadAge = 45, momAge = 47;
		if( dadAge > momAge ) {
			System.out.println("아빠 나이가 엄마 나이보다 더 많다");
		}
		if( dadAge < momAge ) { //45 < 47 :  T
			System.out.println("아빠 나이가 엄마 나이보다 더 적다");
		}
		if( dadAge == momAge ) {
			System.out.println("아빠 나이와 엄마 나이는 같다");
		}
		
		//정수가 짝수인지 홀수인지 판단하여 출력
		int even = 20, odd = 13;
		if( even % 2 == 0 ) {
			System.out.println( even + "는 짝수" );
		}
		
		//직접코드실습
		//odd 의 데이터값이 홀수 임을 출력하는   if문을 작성하세요
//		if( odd % 2 == 1 ) {
//		if( odd % 2 != 0 ) {
		if( odd % 2 > 0 ) {
			System.out.println( odd + "는 홀수" );
		}
		
		
		
	}
}






