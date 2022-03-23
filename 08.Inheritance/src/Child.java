
public class Child extends Parent{
	String childField;
//	Child(){super();}
	Child(String field, int no){
		//서브클래스에 수퍼클래스 생성자 호출문
		super(field, no);
	}
//	String field;
//	int no;
//	
//	Parent(String field, int no){
//		this.field = field;
//		this.no = no;
//	}
//	
//	abstract void parentMethod() ;
	
//	추상이 아닌 경우
	void parentMethod() {
		System.out.println("Child 메소드");
	}
	void childMethod() {
		System.out.println("Child 메소드 ");
	}
}
