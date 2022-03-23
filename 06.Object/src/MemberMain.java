
public class MemberMain {
	public static void main(String[] args) {
		//대문자로 시작하는 데이터타입의 변수는 참조변수
		String name = new String("홍길동");
		String nickname = new String( "홍길동");
		if( name.equals(nickname) ) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
			
		}
		if( name == nickname ) {
			System.out.println("같은 데이터");
		}else {
			System.out.println("다른 데이터");
			
		}
		
		
		
		Member member1 = new Member("흥부", "poorman", "zebi");
		Member member2 
		= new Member("놀부", "richman", "money", "062-1234-5678", 38);
		Member member3 
		= new Member("나그네", "itsme", "1234", 10);
		
		member3 
		= new Member("나그네", "itsme", "1234", "010-1234-5678");
		
		member3 
		= new Member("나그네", "itsme", 20, "1234");
		
		printMember(member1);
		printMember(member2);
//		printMemberInfo(member1.name, member1.id, member1.password
//				, member1.phone, member1.age );
//		printMemberInfo(member2.name, member2.id, member2.password
//				, member2.phone, member2.age );
		
	}
	static void printMember(Member member) {
		System.out.println("회원정보 ------------------");
		System.out.println("이름	: " + member.name );
		System.out.println("아이디  	: " + member.id );
		System.out.println("비밀번호	: " + member.password );
		System.out.println("전화번호	: " 
				+ (member.phone==null ? "" : member.phone )  );
		System.out.println("나이     	: "
				+ (member.age==0 ? "" : member.age ) );
		System.out.println("-------------------------");
	}
	
	//회원정보출력 - 내정보보기 화면
	static void printMemberInfo(String name, String id
			, String password, String phone, int age ) {
		System.out.println("회원정보 ------------------");
		System.out.println("이름	: " + name );
		System.out.println("아이디  	: " + id );
		System.out.println("비밀번호	: " + password );
		System.out.println("전화번호	: " + phone );
		System.out.println("나이     	: " + age );
		System.out.println("-------------------------");
	}
	
}
