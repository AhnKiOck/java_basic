
public class StudentMain {
	public static void main(String[] args) {
		Student hong = new Student("홍길동");
		Student jeon = new Student("전우치", "062-1234-5678");
		Student park = new Student("박문수", "010-9876-5432");
		
		//학생정보조회-출력문
		printInfo( hong );
		printInfo( jeon );
		printInfo( park );
	}
	
	static void printInfo(Student student) {
		//학번, 성명, 연락처 출력
		System.out.println("-------------");
		System.out.println("학번: " + student.id );
		System.out.println("성명: " + student.name );
		System.out.println("연락처: " 
				+ (student.phone==null ? "" : student.phone) );
		System.out.println("-------------");
	}
}
