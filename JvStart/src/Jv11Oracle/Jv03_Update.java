package Jv11Oracle;
import java.util.Scanner;

public class Jv03_Update extends DBConnect {

	public Jv03_Update() {
		// TODO Auto-generated constructor stub
		start();
	}
	public void start() {
		// 수정할 사원의 번호를 입력받아 담당업무, 급여, 상여금 수정
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("수정할 사원 번호 :");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("담당 업무 :");
			String job = sc.nextLine();
			System.out.print("급여 :");
			double sal = Double.parseDouble(sc.nextLine());
			System.out.print("상여금 :");
			double comm = Double.parseDouble(sc.nextLine());
			
			DBConnection();
			
			sql="update emp2 set job=?, sal=?, comm=? where empno=?";
			pstmt= connection.prepareStatement(sql);
			pstmt.setString(1, job);
			pstmt.setDouble(2, sal);
			pstmt.setDouble(3, comm);
			pstmt.setInt(4, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println(empno+"사원의 정보가 수정되었습니다.");
			} else {
				System.out.println("사원정보 수정에 실패하였습니다.");
			}
			
		} catch(Exception e) {
			System.out.println("예외!"+e.getMessage());
		} finally {
			DBClose();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv03_Update();
	}

}
