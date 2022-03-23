package jdbc;

import java.sql.*;

public class SelectMain02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			conn = DriverManager.getConnection(url, "hr", "hr");
			System.out.println("DB연결 성공");
			
			String sql = "select * from employees";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				int emp_id = rs.getInt("employee_id");
				String name = rs.getString("last_name") + " " + rs.getString("first_name");
				Date date = rs.getDate("hire_date");
				System.out.println(emp_id+", "+ name+","+date);
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			if(conn != null) try{conn.close();}catch(Exception e) {}
			if(st != null) try{st.close();}catch(Exception e) {}
			if(rs != null) try{rs.close();}catch(Exception e) {}
		}
		
	}
}
