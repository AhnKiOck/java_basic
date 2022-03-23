package ex_abstract.people;

abstract public class People {
	String name;
	int age;
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void eat() {
		System.out.println( name + " 먹는다");
	}
	void sleep() {
		System.out.println( name + " 잠을 잔다");
	}
	abstract void go();
}
