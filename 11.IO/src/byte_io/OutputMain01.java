package byte_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain01 {

	public static void main(String[] args) {

		FileOutputStream out = null;
		try{
			out = new FileOutputStream( "output.dat" );
			
			byte data[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//			for(byte no : data ) {
//				out.write( no );
//			}
			//한꺼번에 배열 데이터를 쓰기 할 수 있다
			out.write( data );
			
		}catch(IOException e) {
			System.out.println("쓰기 오류:"+ e.getMessage());
		}finally {
			try {
				out.close();
			}catch(Exception e) {}
		}
		System.out.println("Finished");
	}
}
