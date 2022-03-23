package ex_abstract.people;

public class Student extends People{
	String studentNo;
	
	Student(String name, int age, String studentNo){
		super(name, age); //수퍼클래스의 생성자 호출문
		this.studentNo = studentNo;
	}
	
//	abstract void go();
	void go() {
		System.out.println( name + " 학교에 간다");
	}
}
