package ex_extends.people;

//학생정보
public class Student extends People{
	//필드: 이름, 나이, 학번
	String /* name, */studentNo;
//	int age;
	
	Student(){ super();  }
	//먹는다
//	void eat() {
//		System.out.println( name + " 먹는다");
//	}
	//잠을 잔다
//	void sleep() {
//		System.out.println( name + " 잠을 잔다");
//	}
	//학교에 간다
	void gotoSchool() {
		System.out.println( name + " 등교한다");
	}
}


