package etc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentList {
	public static void main(String[] args) {
		//직접코드실습
		//student.txt  파일을 참고한다.
		//1. 22 개의 문자열을 저장할 수 있는 배열변수 선언
		String filename = "src/etc/student.txt";
		String list[] = new String[22];
		
		//2. BufferedReader 클래스를 사용해 student.txt 파일에서
		//	 데이터를 한 줄씩 읽어온다
		BufferedReader reader = null;
		try {
			reader = new BufferedReader( 
					new FileReader(filename) );
			//3. 읽어온 데이터를 배열변수에 저장한다.
			for( int idx=0; idx<list.length; idx++ ) {
//				String line = reader.readLine();
//				list[idx] = line;
				list[idx] = reader.readLine();
			}
			/*
			int idx = 0;
			while( true ) {
				String line = reader.readLine();
				if( line == null ) break;
				list[idx++] = line;
			}
			*/
		
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}finally {
			try{ reader.close(); }catch(Exception e) {}
		}
		
		//4. 문자열 배열변수에 담긴 학생목록을 표의 형식으로 파일로 출력을 내보낸다.
		//   c:/io/student/list.html  파일로 저장한다.
		File dir = new File("c:/io/student");
		if( !dir.exists() ) dir.mkdirs();
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter( dir + "/" + "list.html" ); 
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h2>학생명단 목록</h2>");
			writer.println("<table border=1 >");
			writer.println("<tr><th>성명</th><th>성별</th>");
			writer.println("	<th>연락처</th><th>이메일</th>");
			writer.println("</tr>");
			
			//list[0] : 강소라,여,010-1234-7701,rkdthfk@naver.com
			//String data[] = { "강소라", "여"
			//					, "010-1234-7701"
			//					, "rkdthfk@naver.com"}
			
			for(int idx=0; idx<list.length; idx++) {
				String data[] = list[idx].split(",");
				writer.printf("<tr><td>%s</td><td>%s</td>"
									, data[0], data[1]);
				writer.printf("	<td>%s</td><td>%s</td>"
									, data[2], data[3]);
				writer.println("</tr>");
			}
			
			writer.println("</table>");
			writer.println("</body>");
			writer.println("</html>");
//			성명	성별	연락처	이메일

		}catch(IOException e) {
			System.out.println("쓰기 오류");
		}finally {
			writer.close();
		}
		System.out.println("쓰기 완료");
		
		
		
		
		
		
		
		
	}
}
