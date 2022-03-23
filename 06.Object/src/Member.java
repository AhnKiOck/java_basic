
public class Member {
//	필드
//	회원가입시 필수항목, 선택항목 이 있다
//	필수항목: 이름, 아이디, 비밀번호
//	선택항목: 전화번호, 나이
	String name, id, password, phone;
	// 01012345678  010-1234-5678
	int age;

	//생성자선언 - 필드의 초기화: 파라미터값을 필드에 대입
	//파라미터 변수명과 필드명 이 같다면 필드를 구분하기 위해
	//필드명 앞에 객체의 변수다 라고 지정 - this
	//this: 현재 실행중인 객체(인스턴스) 자신을 가리킨다
	
	Member(String name, String id, String password){
		//변수는 선언된 가까운 블럭의 영향을 받는다
		//필수항목 3개의 필드를 초기화
		this.name = name;
		this.id = id;
		this.password = password;
	}
//	선택항목중 전화번호/나이 모두 입력, 전화번호만 입력, 나이만 입력, 입력 안하는 경우
	Member(String name, String id, String password, int age){
		//필수항목 3개의 필드와 선택항목  age 필드의 초기화 
//		Member(name, id, password);
//		생성자에서 생성자 호출시 생성자명을 그대로 사용불가 - this
//		생성자 호출문부터 선언한다.
		this(name, id, password);
		this.age = age;
//		this.name = name;
//		this.id = id;
//		this.password = password;
	}
	
	Member(String name, String id, int age, String password){
		//필수항목 3개의 필드와 선택항목  age 필드의 초기화 
		this(name, id, password);
//		this.name = name;
//		this.id = id;
//		this.password = password;
		this.age = age;
	}
//	
	Member(String name, String id, String password, String phone){
		//필수항목 3개의 필드와 선택항목 phone 필드의 초기화 
		this(name, id, password);
//		this.name = name;
//		this.id = id;
//		this.password = password;
		this.phone = phone;
	}
	
	Member(String name, String id, String password
					, String phone, int age){
		//필수항목 3개의 필드와 선택항목  age, phone 필드의 초기화
/*		
		this(name, id, password);
//		this.name = name;
//		this.id = id;
//		this.password = password;
		this.phone = phone;
		this.age = age;
*/		
		this(name, id, password, age);
		this.phone = phone;
	}
	
//	기능(메소드)
//	비밀번호 를 변경한다.
	void changePassword(String password) {
		this.password = password;
	}
//	전화번호를 변경한다.
	void changePhone(String phone) {
		this.phone = phone;
	}
//	나이를 변경한다
	void changeAge(int age) {
		this.age = age;
	}
	
}
