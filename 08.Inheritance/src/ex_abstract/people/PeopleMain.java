package ex_abstract.people;

public class PeopleMain {
	public static void main(String[] args) {
		//new People(); //추상클래스이므로 객체생성 불가
		Student hong = new Student("홍길동", 15, "210001");
		hong.eat();
		hong.sleep();
		hong.go();
		
		Worker jeon = new Worker("전우치", 34, "215001");
		jeon.eat();
		jeon.sleep();
		jeon.go();
		
		
	}
}
