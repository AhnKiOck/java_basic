package map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class HashMapMain03 {
	public static void main(String[] args) {
		//직접코드실습
		//1. BufferedReader  클래스를 사용해  student.txt 파일에서
		String filename = "src/list/student.txt";
		BufferedReader reader = null;
		HashMap<String, Student> map 
				= new HashMap<String, Student>();
		try {
			reader = new BufferedReader( new FileReader(filename) );
			//   한 줄씩 읽어와 
			String line = null;
			while( (line = reader.readLine()) !=null  ) {
				String student[] = line.split(",");
				map.put(student[0]
						, new Student(student[0], student[1], student[2], student[3]));
			}
			/*
			while( true ) {
				String line = reader.readLine();
				if( line==null ) break;
				//   읽어온 데이터를  Student 객체로 만들어 자료구조 HashMap  에 저장한다.
				//강소라,여,010-1234-7701,rkdthfk@naver.com
				String student[] = line.split(",");
//				Student s 
//					= new Student(student[0], student[1], student[2], student[3]);
//				map.put(student[0], s);
				map.put(student[0]
						, new Student(student[0], student[1], student[2], student[3]));
			}
			*/
		
		}catch(FileNotFoundException e) {
			System.out.println("해당파일없음");
		}catch(IOException e) {
			System.out.println("읽기오류");
		}finally{
			try{ reader.close(); }catch(IOException e) {}
		}
		//2. 저장을 모두 끝낸 후 자료구조의 학생목록에서 학생의 정보를 찾아
		//   Console에 출력되게 한다(System.out.print)
		//   찾을 학생의 이름은 프로그램 실행시  Program arguments로 입력한다
		//   본인이름 짝꿍이름 홍길동 모두 세 개의 이름을 넣는다
		for(String name : args) {
			Student student = map.get(name);
			System.out.println("-----------------");
			if( student==null ) {
				System.out.println(name + "님의 정보는 없습니다");
			}else {
				System.out.println("성명: " + student.name);
				System.out.println("성별: " + student.gender);
				System.out.println("전화번호 : " + student.phone);
				System.out.println("이메일: " + student.email);
			}
			System.out.println("-----------------");
		}
		
		// 출력결과
		// 성명: 조성빈
		// 성별: 남
		// 전화번호 : 010-1234-5678
		// 이메일: whtjdqls@naver.com
		
		// 성명: 김동현
		// 성별: 남
		// 전화번호 : 010-5678-14122
		// 이메일: whtjdqls@naver.com
		
		// 홍길동 님의 정보는 없습니다
		
		
		
		
		
		
	}
}
