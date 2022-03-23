package ex_extends.animal;

public class Bird extends Animal{
	Bird(String kind){
		super(kind);
	}
	//하늘을 난다
	void fly() {
		System.out.println( kind + " 하늘을 난다");
	}
//	String kind;
//	//먹는다
//	void eat() {
//		System.out.println(kind + " 먹는다");
//	}
//	//잠을잔다
//	void sleep() {
//		System.out.println(kind + " 잠을 잔다");
//	}
}
