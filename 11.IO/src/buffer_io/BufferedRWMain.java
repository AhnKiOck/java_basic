package buffer_io;
import java.io.*;

public class BufferedRWMain {
	public static void main(String[] args) {
		//문자 단위 데이터를 버퍼링해서 입출력하기
		String filename ="src/buffer_io/buffered.txt";
		BufferedWriter out = null;
		
		try {
			out = new BufferedWriter( 
					new FileWriter(filename) );
			char data[] = {'문', '자', '단', '위', '\n', '데'
					, '이', '터', '를', '\n', '버', '퍼', '링'};
			out.write(data);
			out.flush();
			
		}catch(IOException e) {
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		//읽기
		BufferedReader in = null;
		try{
			in = new BufferedReader( 
					new FileReader(filename) );
			/*
			while(true) {
				int data = in.read();
				if( data==-1 ) break;
				System.out.print(  (char)data  );
			}
			
			int data;
			while( (data = in.read()) != -1 ) {
				System.out.print(  (char)data  );
			}
			*/
			
			//문자열을 한 줄씩 읽는 기능: readLine()
			/*
			while( true ) {
				String line = in.readLine();
				if( line == null ) break;
				System.out.println( line );
			}
			*/
			String line;
			while( ( line = in.readLine() ) != null ) {
				System.out.println( line );
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}finally {
			try {  in.close(); }catch(Exception e) {}
		}
		
		
		
		
		
		
		
	}
}
