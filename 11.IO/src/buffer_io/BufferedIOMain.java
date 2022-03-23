package buffer_io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOMain {
	public static void main(String[] args) {

		String filename = "src/buffer_io/buffered.dat";
		
		//쓰기
		BufferedOutputStream out = null;
		try {
			out = new BufferedOutputStream( 
					new FileOutputStream(filename) );
			byte data[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
			out.write(data);
			//8192 사이즈의 버퍼에 9 의 데이터를 담았다 : 8183의 공간이 남아있다
			//버퍼가 다 채워져야 쓰기작업이 된다.
			//out.flush(); //스프림을 바로 내려보내기
			
		}catch(IOException e) {
			System.out.println("쓰기 오류");
		}finally {
			try { out.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		//읽기
		BufferedInputStream in = null;
		
		try {
			in = new BufferedInputStream(
					new FileInputStream(filename) );
			/*
			while( true ) {
				byte data = (byte)in.read(); //읽어온 데이터 리턴
				if( data==-1) break;
				System.out.print( data + " ");
			}
			byte data;
			while( ( data = (byte)in.read() ) != -1 ) {
				System.out.print( data + " ");
			}
			*/
			byte data[] = new byte[5];
			while( true ) {
				int no = in.read(data); //읽어온 데이터의 갯수 리턴
				if( no==-1 ) break;
				for(int i=0; i<no; i++ ) {
					System.out.print(data[i] + " ");
				}
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		
		
		
		
		
	
	}
}
