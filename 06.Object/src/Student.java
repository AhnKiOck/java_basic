//학생정보관리 클래스
public class Student {
	static int seqId/* = 210000 */;
	String name, phone;
	int id; //학번 예)210003
	
//	static 초기화블럭: static {}
	static {
		seqId = 210000;
		System.out.println("클래스가 로딩될때 stock블럭 실행");
	}
	//필드(인스턴스변수) 는 생성자를 통해 초기화
	Student(String name){
		System.out.println(name+" 객체 생성");
		this.name = name;
		this.id = ++seqId; //seqId:210001 -> 210002 -> 210003
	}
	Student(String name, String phone){
		//생성자에서 생성자 호출하기 - 생성자 호출문 부터 작성한다
		this(name);
//		this.name = name;
//		this.id = ++seqId;
		this.phone = phone;
	}
}
