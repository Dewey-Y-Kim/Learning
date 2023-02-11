package Jv11Oracle;
import java.util.Scanner;

public class Jv04_Delete extends DBConnect {

	public Jv04_Delete() {
		// TODO Auto-generated constructor stub
		start();
	}
	
	public void start() {
		//사원명을 입력받아 데이터 삭제
		try{
			System.out.println("삭제할 사원명 : ");
			Scanner sc= new Scanner(System.in);
			String ename= sc.nextLine();
			
			DBConnection();
			
			sql = "delete from emp2 where ename=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, ename);
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(ename+"사원의 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제 정보가 없습니다.");
			}
		
		} catch(Exception e) {
			System.out.println("Exception Appear"+ e.getMessage());
		} finally {
			DBClose();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv04_Delete();
	}

}
