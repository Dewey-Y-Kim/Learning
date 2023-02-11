package Jv11Oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jv01_Select {

	public Jv01_Select() {
		// TODO Auto-generated constructor stub
		start();
	}
	
	public  void start() {
		// oracle 데이터베이스 레코드 선택하기
		Connection conn = null;	
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		try {
				// 1.JDBC 드라이버를 자바 가상머신에 등록
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@192.168.0.198:1521:xe" ;
				String userid = "scott";
				String pw = "tiger";
				
				// 2. DB연결
				conn=DriverManager.getConnection(url, userid, pw);
			
				// 3. sql 작성 후 Statement 생성하기
				String sql = "Select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp Order By ename asc ";
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				System.out.println("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno");
				while(rs.next()) { // record가 있으면 true 없으면 false
					// 현재 point 의 record를 가져올 수 있다.
					int empno =rs.getInt(1); // rs.getInt("empno");
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int mgr = rs.getInt(4);
					String hiredate = rs.getString(5);
					double sal = rs.getDouble(6);
					double comm = rs.getDouble(7);
					int deptno = rs.getInt(7);
					System.out.printf("%5d\t%10s\t%10s\t%5d\t%10s\t%10f\t%10f\t%5d\n",empno, ename, job, mgr, hiredate, sal, comm, deptno);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Connection Exception"+e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC driver error"+e.getMessage());
			} finally {
				 // db 닫기 사용 순서의 역순으로
				if(rs != null)
					try {
						rs.close();
						if(pstmt != null) pstmt.close();
						if(conn != null) conn.close();
					} catch (SQLException sqle) {
						// TODO Auto-generated catch block
						System.out.println("sql Exception appeared"+ sqle.getMessage());
					}
				
				
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv01_Select();
		}

}
