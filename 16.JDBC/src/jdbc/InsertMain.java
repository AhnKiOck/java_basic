package jdbc;

import java.sql.*;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			int emp_id = 700;
			String last_name = "홍";
			String first_name = "길동";
			String email = "hong@naver.com";
			String job_id = "IT_PROG";
			int salary = 5000;

			String sql = "insert into employees " + "(employee_id,last_name,first_name,email,job_id,salary,hire_date) "
					+ "values (?,?,?,?,?,?,sysdate)";
			// st = conn.createStatement();
			// st.executeUpdate(sql); -기존 방식
			// 쿼리문을 미리 준비해두는 형태
			ps = conn.prepareStatement(sql);
			// 쿼리문 실행전에 ? 에 값을 넣는 처리
			ps.setInt(1, emp_id);
			ps.setString(2, last_name);
			ps.setString(3, first_name);
			ps.setString(4, email);
			ps.setString(5, job_id);
			ps.setInt(6, salary);
			// 쿼리문 실행
			int count = ps.executeUpdate();
			// select문 : executeQuery
			// insert/update/delete 문 : executeUpdate
			if (count > 0)
				System.out.println("삽입저장 성공");

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
			}
		}
	}
}
