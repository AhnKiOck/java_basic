package token;

import java.util.StringTokenizer;

public class TokenizerMain {
	public static void main(String[] args) {
			
		StringTokenizer token 
				= new StringTokenizer("사과 배 복숭아");
		//문자열에서 토큰을 분리하기 위한 기준: 구분자
		//기본 구분자 : 공백문자
		//토근을 분리해서 반환하는 메소드: nextToken()
/*		
		String fruit = token.nextToken();
		//첫번째 토큰이 반환되고  token 에는 사과가 빠진 배 복숭아 만 남는다
		System.out.println( fruit );
		
		fruit = token.nextToken();
		//첫번째 토큰이 반환되고 token 에는 배가 빠진 복숭아 만 남는다.
		System.out.println( fruit );
		
		fruit = token.nextToken();
		//첫번째 토큰이 반환되고 token 에는 남은 토큰이 없다.
		System.out.println( fruit );
		
		//fruit = token.nextToken();
		System.out.println("-------------");
*/
		
		//토큰이 남아 있는지 확인하는 메소드: hasMoreTokens()
		//남아 있으면 true / 없으면   false
		String fruit;
		while( token.hasMoreTokens() ) {
			fruit = token.nextToken();
			System.out.println( fruit );
		}
		System.out.println("---------");
		
		
		//특정 구분자로 토큰을 분리하려면 생성자 파라미터 두번째로 구분자를 명시한다
		String animal = "개,고양이,토끼,새";
		token = new StringTokenizer(animal, ",");
		while( token.hasMoreTokens() ) {
			animal = token.nextToken();
			System.out.println( animal );
		}
		System.out.println("-------------");
		
		//토큰의 갯수를 파악해서 for문으로 처리할수도 있다.
		animal = "개,고양이,토끼,새";
		token = new StringTokenizer( animal, "," );
		int count = token.countTokens(); //토큰의 갯수를 리턴
		for( int i=0; i<count; i++) {
			System.out.println(  token.nextToken() );
		}
		System.out.println("-------------");

		
		//토큰의 구분자를 여러 개 지정할 수 있다
		String datas = "개,고양이,토끼,새|사과,배,복숭아";
		token = new StringTokenizer(datas, ",|");
		while( token.hasMoreTokens() ) {
			System.out.println( token.nextToken() );
		}
		System.out.println("-------------");
		
		datas = "개,고양이,새|사과,배,복숭아|물,쥬스,커피";
		token = new StringTokenizer(datas, "|");
		int kind = token.countTokens();
		String category[] = new String[kind]; //배열선언
		//종류별로 3 종류의 토큰 분리
		for(int i=0; i<kind; i++) {
			category[i] = token.nextToken();
			System.out.println(category[i]);
		}
		//각 종류에 대한 토큰 분리
		for( int i=0; i<kind; i++) {
			token = new StringTokenizer(category[i], ",");
			while( token.hasMoreTokens() ) {
				System.out.println( token.nextToken() );
			}
			System.out.println("-------------");
		}
		System.out.println("-------------");
		
		
		//구분자 자체도 하나의 토큰으로 분리하려면 생성자 파라미터 3번째로  true 지정
		token = new StringTokenizer(datas, "|,", true);
		while( token.hasMoreTokens() ) {
			System.out.println( token.nextToken() );
		}
		System.out.println("-------------");
		
		
		
	}
}
