
public class PhysicalInfoMain {
	public static void main(String[] args) {
		
		//홍길동 의 신체정보 16살때 키 162.0, 체중 60.5
		PhysicalInfo hong 
			= new PhysicalInfo("홍길동", 16, 162.0, 60.5);
		//현재 신체정보출력
		printInfo( hong );
//		printInfo( hong.name, hong.age, hong.height, hong.weight );
//		System.out.println("------------");
//		System.out.println("이름: " + hong.name );
//		System.out.println("나이: " + hong.age );
//		System.out.println("키: " + hong.height );
//		System.out.println("체중: " + hong.weight );
//		System.out.println("------------");
		
		//홍길동 의 신체정보 17살때 키와 체중에 변화가 생김: 키 165.0, 체중 68.5
		hong.update(17, 165.0, 68.5);
		//현재 신체정보출력
		printInfo( hong );
//		printInfo( hong.name, hong.age, hong.height, hong.weight );
//		System.out.println("------------");
//		System.out.println("이름: " + hong.name );
//		System.out.println("나이: " + hong.age );
//		System.out.println("키: " + hong.height );
//		System.out.println("체중: " + hong.weight );
//		System.out.println("------------");
		
		//홍길동 의 신체정보 18살때 체중변화없이 키가 변화함: 키 175.5
		hong.update(18, 175.5);
		//현재 신체정보출력
		printInfo( hong );
//		printInfo( hong.name, hong.age, hong.height, hong.weight );
//		System.out.println("------------");
//		System.out.println("이름: " + hong.name );
//		System.out.println("나이: " + hong.age );
//		System.out.println("키: " + hong.height );
//		System.out.println("체중: " + hong.weight );
//		System.out.println("------------");
		
		//홍길동 의 신체정보 19살때 키도, 체중변화없음: 나이만 바뀜
		hong.update(19);
		printInfo( hong );
//		printInfo( hong.name, hong.age, hong.height, hong.weight );
//		System.out.println("------------");
//		System.out.println("이름: " + hong.name );
//		System.out.println("나이: " + hong.age );
//		System.out.println("키: " + hong.height );
//		System.out.println("체중: " + hong.weight );
//		System.out.println("------------");
	}
	
	static void printInfo(PhysicalInfo person) {
		System.out.println("------------");
		System.out.println("이름: " + person.name );
		System.out.println("나이: " + person.age );
		System.out.println("키: " + person.height );
		System.out.println("체중: " + person.weight );
		System.out.println("------------");
	}
	
	static void printInfo(String name, int age
							, double height, double weight) {
		//현재 신체정보출력
		System.out.println("------------");
		System.out.println("이름: " + name );
		System.out.println("나이: " + age );
		System.out.println("키: " + height );
		System.out.println("체중: " + weight );
		System.out.println("------------");
	}
	
}
