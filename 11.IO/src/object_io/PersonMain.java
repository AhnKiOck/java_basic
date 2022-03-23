package object_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonMain {
	public static void main(String[] args) {
		String filename = "src/object_io/person.dat";
		
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream( 
					new FileOutputStream(filename) );
			Person hong = new Person("홍길동", 19, '남');
			out.writeObject( hong );
			out.writeObject( new Person("심청", 25, '여') );
//			out.writeObject( new Circle(5) );
			
		}catch(IOException e) {
			System.out.println("쓰기 오류:" + e.getMessage());
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		//직접코드실습
		//person.dat 파일에 저장된  Person 정보를 읽어와 출력하시오.
		//출력결과
		//성명: 홍길동   나이: 19  	성별: 남
		//성명: 심청      나이: 25  	성별: 여
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream( 
					new FileInputStream(filename) );
			while( true ) {
//				Person person = (Person)in.readObject();
//				if(obj instanceof Person ) {
//				}
				Object obj = in.readObject();
				if( obj instanceof Person ) {
					Person person =  (Person)obj;
					System.out.printf("성명: %s   나이: %d  	성별: %c \n"
								, person.name, person.age, person.gender);
					
				}else 
				if( obj instanceof Circle ) {
					Circle c = (Circle)obj;
					System.out.println("원의 반지름:" + c.radius);
				}
				
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일없음");
		}catch(EOFException e) {
			System.out.println("읽기 완료");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 레퍼런스 타입 없음");
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
