package list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArrayListMain03 {
	public static void main(String[] args) {
		//직접코드 실습
		//1.BufferedReader 클래스를 사용해  student.txt 파일의데이터를
		String filename = "src/list/student.txt";
		
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader( new FileReader(filename) );
			//  한 줄씩 읽어와 자료구조 ArrayList 에 저장한다
			while( true ) {
				String line = reader.readLine();
				if( line == null ) break;
				list.add( line ); 
			}
		
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}finally {
			try{ reader.close(); }catch(IOException e) {}
		}
		
		//2.자료구조에 있는 학생목록을 표의 형식으로 출력되게 
		//  c:/collection/student/list.html 파일로 저장한다
		File dir = new File("c:/collection/student");
		if( !dir.exists() ) dir.mkdirs();
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter( dir + "/list.html" ); 
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h2>학생목록</h2>");
			writer.println("<table border=1 >");
			writer.print("<tr><th>번호</th><th>성명</th><th>성별</th>"
						   + "<th>전화번호</th><th>이메일</th></tr>");
			int no=0;
			for( String student : list ) {
				//강소라,여,010-1234-7701,rkdthfk@naver.com
				String[] info = student.split(",");
				writer.printf("<tr><td>%d</td><td>%s</td><td>%s</td>"
						   + "<td>%s</td><td>%s</td></tr>"
						, ++no, info[0], info[1], info[2], info[3]);
			}
			
			writer.println("</table>");
			writer.println("</body>");
			writer.println("</html>");
		
		}catch(IOException e) {
			System.out.println("쓰기 오류");
		}finally {
			writer.close();
		}
		
		
		
	}
}
