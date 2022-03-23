package ex_poly.animal2;

public class Dog extends Animal{
	
//	Dog(){
//		super();
//	}
	Dog(String kind){
		super(kind);
	}
	//땅위를 달린다
	void run() {
		System.out.println(kind + " 땅위를 달린다");
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
