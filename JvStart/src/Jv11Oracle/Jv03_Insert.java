package Jv11Oracle;
import java.sql.SQLException;
import java.util.Scanner;

public class Jv03_Insert extends DBConnect {

	public Jv03_Insert() {
		// TODO Auto-generated constructor stub
		start();
	}
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		//****** 사원등록 *******
		System.out.print("사원 번호 :");
		int empno = Integer.parseInt(sc.nextLine());
		System.out.print("사원 명 :");
		String ename = sc.nextLine();
		System.out.print("업무 :");
		String job = sc.nextLine();
		System.out.print("관리자 번호 :");
		int mgr = Integer.parseInt(sc.nextLine());
		System.out.println("입사일(YYYY-MM-DD) :");
		String hiredate = sc.nextLine();
		System.out.print("급여 :");
		double sal = Double.parseDouble(sc.nextLine());
		System.out.print("상여금 :");
		double comm = Double.parseDouble(sc.nextLine());
		System.out.print("부서코드 :");
		int deptno= Integer.parseInt(sc.nextLine());
		try {
		DBConnection();
		
		sql= "insert into emp2(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
				+"values(?,?,?,?,to_date(?,'YYYY-MM-DD'),?,?,?)";
		
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setString(5, hiredate);
			pstmt.setDouble(6, sal);
			pstmt.setDouble(7, comm);
			pstmt.setInt(8, deptno);
			
			// 실행
			int result = pstmt.executeUpdate();
			if ( result > 0) {
				System.out.println("사원이 등록되었습니다.");
			}else {
				System.out.println("사원 등록이 실패하였습니다.");
			}
			// commit은 프로그램에서 연동하여 insert, update, delete는 자동으로 commit이 된다.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBClose();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv03_Insert();
	}

}
