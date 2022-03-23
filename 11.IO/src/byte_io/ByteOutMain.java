package byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutMain {
	public static void main(String[] args) {
		String filename = "응용SW기초기술활용.pdf";
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream( filename );
			byte data[] = new byte[1024]; //1K//11311
			
			out = new FileOutputStream( "c:/test/복사한파일.pdf" );
			while( true ) {
				int no = in.read(data);
				if( no==-1 ) break;
				for(int idx=0; idx<no; idx++ ) {
					out.write( data[idx] );
				}
			}
			
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			try{ in.close(); }catch(Exception e) {}
			try{ out.close(); }catch(Exception e) {}
		}
		
	}
}
