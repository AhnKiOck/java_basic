package char_io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterMain01 {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			//1.파일열기
			writer = new FileWriter( "output.txt", true );
			
			//2.내용쓰기
			char data[] = { '자', '바', ' '
					, '프', '로', '그', '래', '밍', ' ', '입', '문' };
//			for(int idx=0; idx<data.length; idx++) {
//				writer.write( data[idx] );
//			}
			//향상된  for문으로 변경
//			for( char ch : data ) {
//				writer.write( ch );
//			}
			//한꺼번에 배열의 문자를 모두 쓰기작업 할 수 있다.
			writer.write( data );
			//스트림을 바로 내려보내려면
			writer.flush();
			
		}catch(IOException e) {
			System.out.println("쓰기 오류:" + e.getMessage());
		}finally {
			//3.파일닫기
			try {
				writer.close(); //스트림이 내려보내진다 
			}catch(Exception e) {}
		}
		System.out.println("Finished");
	}
}




