package Jv11Oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jv01_Search {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@192.168.0.198:1521:xe" ;
	String userid = "scott";
	String pw = "tiger";
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch( Exception e) {
			System.out.println("Driver Loading Exception");
		}
	}
	Scanner sc = new Scanner(System.in);
	
	public Jv01_Search() {
		// TODO Auto-generated constructor stub
		employee();
	}
	
	public void employee() {
		//  이름 입력받아 DB조회하기
		try {
			conn = DriverManager.getConnection(url, userid, pw);
			
			System.out.println("사 원 명 :");
			String name = sc.nextLine();
			String sql = "select empno, ename, job, to_char(hiredate), sal from emp where ename=upper(?)";
			pstmt = conn.prepareStatement(sql);
			// 쿼리문에 ?가 있을때 값 세팅
			pstmt.setString(1, name); //setString Set
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {//사원 정보가 있을때
				System.out.printf("%d \t %s \t %s \t %s\t %f",rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}else {
				System.out.println(name+"사원이 존재하지 않습니다.");
			}
			
		} catch(Exception e) {
			System.out.println("Searching Employee Exception Appeared..."+e.getMessage());
			e.printStackTrace();
		} finally {
			
			if(rs!= null)
				try {
					rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv01_Search();
	}

}
