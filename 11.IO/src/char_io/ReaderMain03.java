package char_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain03 {
	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			reader = new FileReader( "src/char_io/test.txt" );
			/*
			char data[] = new char[20]; //문자를 20개씩 읽어서 담아둘 배열
			while( true ) {
				int no = reader.read( data ); //읽어온 문자의 갯수 리턴
				if( no==-1 ) break; //더 이상 읽을 데이터가 없으면 읽기 중단
//				System.out.println( data );
				
				// 실제로 읽어온 데이터의 갯수만큼 출력
				for(int idx=0; idx<no; idx++ ) {
					System.out.print( data[idx] );
				}
			}
			*/
			while( true ) {
				//30+30+30+7(23)
				char data[] = new char[30];
				int no = reader.read( data );
				if( no==-1 ) break;
//				System.out.print( data );
				System.out.print( String.valueOf(data).trim()  );
			}
			
		
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음: "+ e.getMessage());
		}catch(IOException e) {
			System.out.println("읽기 오류:" + e.getMessage());
		}finally {
			try {
				reader.close();
			}catch(Exception e) {}
		}
		
	}
}
