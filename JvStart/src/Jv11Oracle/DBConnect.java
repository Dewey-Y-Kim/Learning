package Jv11Oracle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	protected Connection connection =null;
	protected PreparedStatement pstmt =null;
	protected CallableStatement cstmt = null;
	
	protected ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@192.168.0.198:1521:xe";
	String userid = "scott";
	String pw = "tiger";
	
	protected String sql = null;
	
	static {
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");

		}catch(Exception e) {
			System.out.println("Driver loading Exception appeared"+ e.getMessage());
		}
	}
	// DB연결
	public void DBConnection(){
		try {
			connection = DriverManager.getConnection(url, userid, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// DB종료
	public void DBClose() {
		try {
			if(rs!=null) rs.close();
			if(pstmt != null) pstmt.close();
			if(connection != null) connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
