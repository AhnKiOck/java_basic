package file;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	public static void main(String[] args) {
		
		//현재 디렉토리에(상대경로) 있는 파일을 생성
		//File file = new File( "string.txt" );
		//현재 디렉토리에(절대경로) 있는 파일을 생성
		//File file = new File( "E:\Study_Java\11.IO\string.txt" );
		
		//현재 위치: .		
		//상위 위치: ..
		
		File file = new File(".");
		//현재 디렉토리에 있는 파일들과 서브디렉토리의 목록을 가져온다
		File[] list = file.listFiles();
		
		SimpleDateFormat sdf 		
			= new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for( File f : list ) {
			 long time = f.lastModified(); // 파일의 최종수정일시 
			 System.out.print( 
					sdf.format( new Date(time) ) + "   " );
			 
			 String name = f.getName();
			 //파일인지, 디렉토리 인지 파악
			 if( f.isDirectory() ) {
				 System.out.printf(
						 "%-10s %-25s", "<DIR>", name);
				 //-10s <DIR> 문자를 10자리로 왼쪽 정렬
				 //-25s 폴더명을 25자리로 왼쪽 정렬
			 }else {
				 System.out.printf(
						 "%10d %-25s", f.length(), name);
				 //10d: 파일크기를 10자리로 오른쪽 정렬
				 //-25s 파일명을 25자리로 왼쪽 정렬
			 }
			 System.out.println();
		}
		
		
		
		
		
		
		
	}
}
