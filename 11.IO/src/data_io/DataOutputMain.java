package data_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputMain {
	public static void main(String[] args) {
		//데이터를 파일에 쓰기 작업:  FileOutputStream
		//파일에 쓰기작업할 프리미티브 타입 데이터를 바이트 스트림으로 바꾼다
		//: DataOutputStream
//		FileOutputStream fos
//		= new FileOutputStream( "src/data_io/output.dat" );
//		DataOutputStream out = new DataOutputStream( fos );
		String filename =  "src/data_io/output.dat";
		
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			out = new DataOutputStream( 
					new FileOutputStream( filename ) );
			in = new DataInputStream( 
					new FileInputStream( filename ) );
			int data[] = { 1000, 2000, 3000, 4000, 5000
						, 6000, 7000, 8000, 9000, 10000 };
			//int : 4byte : 40bytes
			for( int value : data ) {
				//출력(쓰기) 할 데이터의 타입에 따라 메소드 호출
				out.writeInt( value );
			}
			System.out.println("쓰기 ");
			while( true ) {
				System.out.println( in.readInt() );
			}
			
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			try{ out.close(); 
				System.out.println("파일크기: " + out.size());
			}catch(Exception e) {}
		}
		System.out.println("Finished");
		
		
		
	}
}
