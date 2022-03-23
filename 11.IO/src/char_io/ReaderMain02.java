package char_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain02 {
	public static void main(String[] args) {
		FileReader reader = null;

		try {
			reader = new FileReader("src/char_io/test.txt");
			//한꺼번에 읽어서 담아둘 충분한 크기의 배열을 선언
			char data[] = new char[500];
			
			int no = reader.read( data ); //읽어온 문자의 갯수를 리턴
			System.out.println( "총 문자수: " + no );
			System.out.println( data );
			System.out.println( "]" );
			//문자열 String 에서 공백문자 제거: trim()
			//배열변수 char -> String 로
			System.out.println( String.valueOf(data).trim() );
			System.out.println( "]" );
		
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일업음:" + e.getMessage());
		}catch(IOException e) {
			System.out.println("읽기 오류:" + e.getMessage() );
		}finally {
			try {
				reader.close();
			}catch(Exception e) {}
		}
	}
}
