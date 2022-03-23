package set;

import java.util.HashSet;

public class HashSetMain {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add( "홍길동" );
		set.add( "박문수" );
		set.add( "심청" );
		set.add( "박문수" );
		System.out.println( set.size() );
		
		for( String name  : set ) {
			System.out.println( name );
		}
		
		HashSet<Student> list = new HashSet<Student>();
		Student hong = new Student("홍길동", "남"
						, "010-1234-5678", "hong@naver.com");
		list.add( hong );
		list.add( new Student("심청", "여"
						, "010-8745-6214", "sim@gmail.com") );
		list.add( new Student("홍길동", "남"
						, "010-1234-5678", "hong@naver.com") );
		list.add( new Student("박문수", "남"
						, "010-4112-8441", "park@hrd.go.kr") );
		for( Student student : list ) {
			System.out.println("성명: " + student.name );
			System.out.println("성별: " + student.gender );
			System.out.println("전화번호: " + student.phone );
			System.out.println("이메일: " + student.email );
			System.out.println("---------------------");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
