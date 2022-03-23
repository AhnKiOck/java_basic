package byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputMain02 {
	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			in = new FileInputStream( "output.dat" );
			byte[] data = new byte[4];
			/*
			while( true ) {
				int no = in.read(data); //실제 읽어온 데이터의 갯수가 리턴됨
				if(no==-1) break;
				for( int idx=0; idx<no; idx++) {
					System.out.println( data[idx] );
				}
			}
			*/
			int no;
			while( (no = in.read(data)) != -1 ) {
				for( int idx=0; idx<no; idx++) {
					System.out.println( data[idx] );
				}
			}
		
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음:" + e.getMessage());
		}catch(IOException e) {
			System.out.println("읽기 오류" + e.getMessage());
		}finally {
			try {
				in.close();
			}catch(Exception e) {}
		}
	}
}
