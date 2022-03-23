package data_io;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputMain {
	public static void main(String[] args) {
		
		String filename = "src/data_io/output.dat";
		DataInputStream in = null;
		
		try {
			in = new DataInputStream( 
					new FileInputStream( filename ) );

			while( true ) {
				int data = in.readInt();
				System.out.println( data );
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음"+e.getMessage());
		}catch(EOFException e) {
			System.out.println("파일의 끝까지 다 읽음");
		}catch(IOException e) {
			System.out.println("읽기오류" + e.getMessage());
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
			
			
	}
}
