package location;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LocationDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	public LocationDTO locationList(int emp_id){
		LocationDTO dto=null;
		String sql = "select location_id,street_address,postal_code,city,state_province,country_id"
				+ " from locations"
				+ " where location_id = (select location_id from departments d right outer join"
				+ " employees e using(department_id) "
				+ "where employee_id = ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, emp_id);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto = new LocationDTO();
				dto.setLocation_id(rs.getInt("location_id"));
				dto.setStreet_address(rs.getString("street_address"));
				dto.setPostal_code(rs.getString("postal_code"));
				dto.setCity(rs.getString("city"));
				dto.setState_province(rs.getString("state_province"));
				dto.setCountry_id(rs.getString("country_id"));
				
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			disconnect();
		}
		return dto;
	}
	public LocationDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url,"hr","hr");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void disconnect() {
		if(rs != null) try{rs.close();}catch(Exception e) {}
		if(ps != null) try{ps.close();}catch(Exception e) {}
		if(conn != null) try{conn.close();}catch(Exception e) {}
	}
}
