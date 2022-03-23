package jdbc;
import java.sql.*;

public class UpdateMain01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
//			String url = "jdbc:oracle:thin:@studyoracle_medium?tns_admin=lib/wellet_studyoracle";
//			conn = DriverManager.getConnection(url, "hr", "Spring211001");
			
			//100번 사원의 급여, 이메일, 전화번호를 변경한다
			int salary = 26000;
			String email = "king@naver.com", phone = "010-1234-8522";
			
			String sql 
			= "update employees "
			+ "set salary = "+ salary + ", email = '" + email + "'"
			+ ", phone_number = '" + phone + "' "
			+ "where employee_id = 100";
			st = conn.createStatement();
			int count = st.executeUpdate(sql); 
			//executeQuery(): select문,  executeUpdate() : insert문/update문/delete문
			if( count>0 ) System.out.println("변경 성공");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if( st!=null ) try{ st.close(); }catch(Exception e) {}
			if( conn!=null ) try{ conn.close(); }catch(Exception e) {}
		}
	}
}
