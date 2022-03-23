package jdbc;
import java.sql.*;

public class JDBCMain {
	public static void main(String[] args) {
		try {
			//1. 드라이버생성 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 생성 완료");

			//2. DB와 연결 - 드라이버관리자로 연결객체를 생성
			//DriverManager.getConnection("DB위치", "username", "password");
			//1)로컬시스템설치DB인 경우
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			Connection conn = DriverManager.getConnection(url, "hr", "hr");
			//2)클라우드DB인 경우
			String url = "jdbc:oracle:thin:@studyoracle_medium?TNS_ADMIN=lib/wallet_studyoracle";
			Connection conn = DriverManager.getConnection(url, "hr", "Spring211001");
			System.out.println("DB 접속 성공");
		
			//3. 쿼리문선언
			
			//4. DB 연결 해제 - 자원회수
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
