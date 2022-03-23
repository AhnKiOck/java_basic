package ex_access.account;

public class FractionMain {
	public static void main(String[] args) {
		Fraction f = new Fraction(3, 100);
		System.out.println( "100/3 : " + f.intType());
		//System.out.println( "100/3 : " + f.doubleType());
		//접근 제한자 private 로 메소드 호출불가
		
	}
}
