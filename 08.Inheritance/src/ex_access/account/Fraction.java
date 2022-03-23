package ex_access.account;

//분수 계산 클래스
public class Fraction {
	//분모, 분자
	int denominator; //분모
	int numerator; //분자
	
	Fraction(int denominator, int numerator){
		this.denominator = denominator;
		this.numerator = numerator;
//		doubleType();
	}
	
	private double doubleType() {
		return (double)numerator / denominator;
	}
	
	int intType() {
		return (int)doubleType();
	}
	
}
