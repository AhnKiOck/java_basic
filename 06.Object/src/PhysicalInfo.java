//신체정보관리
public class PhysicalInfo {
	//필드: 이름, 나이, 키, 체중
	String name;
	int age;
	double height, weight;
	
	//생성자: 필드를 모두 초기화하는 생성자
	PhysicalInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	PhysicalInfo(String name, int age, double height, double weight){
		this(name, age);
//		this.name = name;
//		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//메소드: 나이를 변경한다 ,
	void update(int age) {
		this.age = age;
	}
	//      나이, 키를 변경한다.
	void update(int age, double height) {
		//this.age = age;
		this.height = height ;
		update( age );
	}
	
	void update(double height, int age) {
		//this.age = age;
		this.height = height ;
		update( age );
	}
	//		나이, 키, 몸무게를 변경한다
	void update(int age, double height, double weight) {
		update( age, height );
//		this.age = age;
//		this.height = height;
		this.weight = weight;
	}
	
	
}
