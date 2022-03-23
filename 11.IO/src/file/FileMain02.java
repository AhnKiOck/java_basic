package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain02 {
	public static void main(String[] args) {
		File dir = new File("c:/io");
		//해당 폴더가 없으면 폴더를 만든다.
		if( !dir.exists() ) dir.mkdir();
		
		//해당 폴더에 파일을 만들어 내용을 쓴다
		PrintWriter writer = null;
		try {
			writer = new PrintWriter( dir + "/" + "연락처.txt" );
			writer.print("성명: 홍길동");
			writer.println("성별: 남");
			writer.println("연락처: 010-1234-5678");
			writer.println("이메일: hong@naver.com");
		
		}catch(IOException e) {
		}finally {
			writer.close();
		}
		System.out.println("쓰기 완료");
		
		//"2021/11/09"
		SimpleDateFormat sdf 
				= new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format( new Date() );
		
		dir = new File( "/" + today );
		if( ! dir.exists() ) dir.mkdirs(); //하위디렉토리까지 한번에 생성됨
		
		try {
			writer = new PrintWriter( dir + "/" + "연락처.html" );
			writer.print("<htc:/ioml>");
			writer.print("<body>");
			writer.print("<h1>파일 IO</h1>");
			writer.print("오늘은 파일IO 를 실습중입니다");
			writer.print("</body>");
			writer.print("</html>");
			
		}catch(IOException e) {
		}finally {
			writer.close();
		}
		System.out.println("쓰기완료");
		
		
		dir = new File( "c:/io/" + today );
		if( ! dir.exists() ) dir.mkdirs();
		
		ObjectOutputStream out = null;
		try {
			out = 
				new ObjectOutputStream( new FileOutputStream(dir + "/" + "student2.html" ) );
			StringBuilder sb = new StringBuilder();
			sb.append("<html>");
			sb.append("<body>");
			sb.append("<h1>학생 명단</h1>");
			//표의 형식으로 학생명단을 출력한다
			sb.append("<table border=1 >");
			sb.append("<tr><th>성명</th><td>홍길동</td>");
			sb.append("</tr>");
			
			sb.append("<tr><th>성별</th><td>남</td>");
			sb.append("</tr>");
			
			sb.append("<tr><th>연락처</th><td>010-1234-5677</td>");
			sb.append("</tr>");
			
			sb.append("<tr><th>이메일</th><td>hong@naver.com</td>");
			sb.append("</tr>");
			
			sb.append("</table>");		
			String table = sb.toString();
			out.writeObject(table);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			
		}
		
		/*
		writer = null;
		try {
			
			writer 
				= new PrintWriter( dir + "/" + "student.html" );
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>학생 명단</h1>");
			//표의 형식으로 학생명단을 출력한다
			writer.println("<table border=1 >");
			writer.println("<tr><th>성명</th><td>홍길동</td>");
			writer.println("</tr>");
			
			writer.println("<tr><th>성별</th><td>남</td>");
			writer.println("</tr>");
			
			writer.println("<tr><th>연락처</th><td>010-1234-5677</td>");
			writer.println("</tr>");
			
			writer.println("<tr><th>이메일</th><td>hong@naver.com</td>");
			writer.println("</tr>");
			
			writer.println("</table>");
			

			writer.println("<table border=1 >");
			writer.println("<tr>");
			writer.println("<th>성명</th><th>성별</th><th>연락처</th><th>이메일</th>");
			writer.println("</tr>");
//			홍길동	남	010-1234-5678	
//			심청	여	062-987-5121	

			writer.println("<tr><td>홍길동</td><td>남</td>"
							+ "<td>010-1234-5678</td><td>hong@naver.com</td>");
			writer.println("</tr>");
			
			writer.println("<tr><td>심청</td><td>여</td>"
							+ "<td>062-987-5121</td><td>sim@hrd.go.kr</td>");
			writer.println("</tr>");
			
			writer.println("</table>");
			
			writer.println("</body>");
			writer.println("</html>");
			
		}catch(IOException e) {
		}finally {
			writer.close();
		}
		 */
		
		
	}
}
