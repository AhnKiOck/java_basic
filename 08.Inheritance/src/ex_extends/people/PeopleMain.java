package ex_extends.people;

public class PeopleMain {
	public static void main(String[] args) {
		People people = new People();
		System.out.println("---------");
		people.name = "나그네";
		people.age = 30;
		people.eat();
		people.sleep();
		System.out.println("---------");
		
		Student hong = new Student();
		System.out.println("---------");
		hong.name = "홍길동";
		hong.age = 20;
		hong.studentNo = "2110001";
		hong.eat();
		hong.sleep();
		hong.gotoSchool();
		System.out.println("---------");
		
		Worker jeon = new Worker();
		System.out.println("---------");
		jeon.name = "전우치";
		jeon.age = 35;
		jeon.workerNo = "215001";
		jeon.eat();
		jeon.sleep();
		jeon.gotoWork();
		System.out.println("---------");
		
		
	}
}
