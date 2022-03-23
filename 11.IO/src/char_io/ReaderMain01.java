package char_io;

import java.io.*;

public class ReaderMain01 {
	public static void main(String[] args) {
//		String filename = "입출력";
//		String filename = "src/char_io/test.txt";
//		String filename = "C:\\test\\설치와 설정.txt";
		String filename = "C:/test/설치와 설정.txt";
		FileReader reader = null;
		try {
			//1.파일열기
			reader = new FileReader( filename );
			
			//2.내용읽기
			while( true ) {
				//문자 한개씩 읽기
				int data = reader.read();  //읽어온 문자 한 개가 리턴됨
				//더 이상 읽어올 문자가 없으면  -1 이 리턴된다
				if( data == -1 ) break;
				System.out.print( (char)data );
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음:" + e.getMessage() );
		}catch(IOException e) {
			System.out.println("읽기 오류:" + e.getMessage() );
		}finally {
			//3.파일닫기
			try {
				reader.close();
			}catch(Exception e) {
			}
		}
	}
}
