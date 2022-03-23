package etc;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMain {
	public static void main(String[] args) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter( "report.txt" );
			writer.println("--- 성적표 ---");
			writer.print("성명\t 국어\t 영어\t 수학\t 평균\n");
			writer.printf("%s\t %d\t %d\t %d\t %.1f \n"
						, "홍길동", 90, 85, 78, (90+85+78)/3.0 );
			writer.printf("%s\t %d\t %d\t %d\t %.1f \n"
					, "박문수", 84, 95, 65, (84+95+65)/3.0 );
		
		}catch(IOException e) {
		}finally {
			try{ writer.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
	}
}
