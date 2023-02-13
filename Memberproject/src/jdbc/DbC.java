package jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbC {
	
	public DbC() {
		// TODO Auto-generated constructor stub
	}
	protected Connection connect = null;
	protected PreparedStatement ps = null;
	protected CallableStatement cs = null;
	protected ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@192.168.0.198:1521:xe"; //내부망에 주소 부여
	String userid = "Scott";
	String pw = "tiger";	
		
	protected String sql = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch( Exception e) {
			e.printStackTrace();
			System.out.println("연결이 실패하였습니다.");
		}	
	}
	
	//DB Connect
	public void Connect() {
		try {
			connect = DriverManager.getConnection(url, userid, pw);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결에 실패했습니다.");
		}
	}
	// Db Close
	public void DbClose() {
		try {
			if(rs != null) { rs.close(); }
			if(ps != null) { ps.close(); }
			if(cs != null) { ps.close(); }
			if(connect != null) { connect.close(); }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

