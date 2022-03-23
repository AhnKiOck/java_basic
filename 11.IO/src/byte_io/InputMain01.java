package byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputMain01 {
	public static void main(String[] args) {
		FileInputStream in = null;
		
		try {
			in = new FileInputStream( "output.dat" );
		
//			while( true ) {
//				int data = in.read();
//				if( data==-1 ) break;
//				System.out.println( data );
//			}
			int data;
			while( ( data = in.read() ) != -1 ) {
				System.out.println( data );
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음: " + e.getMessage());
		}catch(IOException e) {
			System.out.println("읽기 오류:" + e.getMessage());
		}finally {
			try {
				in.close();
			}catch(Exception e) {}
		}
		
	}
}
