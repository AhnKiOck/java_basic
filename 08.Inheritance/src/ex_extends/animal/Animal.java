package ex_extends.animal;

public class Animal {
	//품종
	String kind;
	
//	Animal(){
//	}
	Animal(String kind){
		this.kind = kind;
	}
	
	//먹는다
	void eat() {
		System.out.println(kind + " 먹는다");
	}
	//잠을잔다
	void sleep() {
		System.out.println(kind + " 잠을 잔다");
	}
}
