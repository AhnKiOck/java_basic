package ex_extends.people;

//	사람클래스
public class People {
//	필드: 이름, 나이
	String name;
	int age;
	People(){}
	
//	먹는다
	void eat() {
		System.out.println( name + " 먹는다");
	}
//	잠을 잔다
	void sleep() {
		System.out.println(name+ " 잠을 잔다");
	}
}



