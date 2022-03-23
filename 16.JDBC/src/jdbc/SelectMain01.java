package jdbc;
import java.sql.*;

public class SelectMain01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//2.드라이버관리자로 연결객체 생성
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//DriverManager.getConnection(url, "hr", "hr");
//			String url 
//			= "jdbc:oracle:thin:@studyoracle_medium?tns_admin=lib/wallet_studyoracle";
			conn 
			= DriverManager.getConnection(url, "hr", "hr");
			System.out.println("DB연결성공");
			
			//3.쿼리문
			String sql = "select * from employees";
			//쿼리문 실행 기능을 갖고있는 클래스 Statement 
			st = conn.createStatement();
			rs = st.executeQuery(sql); //sql developer 에서 ctrl+enter 
			while( rs.next() ) {  //true /false
				int emp_id = rs.getInt("employee_id");
				String name = rs.getString("last_name") 
									+  " " + rs.getString("first_name");
				int salary = rs.getInt("salary");
				Date hire_date = rs.getDate("hire_date");
				System.out.println( 
						emp_id+ ", " + name+ ", "+ salary + ", " + hire_date);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//4.자원회수
			try{ if(rs!=null) rs.close(); }catch(Exception e) {}
			try{ if(st!=null) st.close(); }catch(Exception e) {}
			try{ if(conn!=null) conn.close(); }catch(Exception e) {}
		}
	}
}
