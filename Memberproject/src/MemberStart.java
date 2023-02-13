import java.util.Scanner;

import jdbc.DbC;

public class MemberStart extends DbC {

	public MemberStart() {
		// TODO Auto-generated constructor stub
	}
	public void start() {

		do {
			// 관리자 로그인 - 아이디, 비밀번호 입력		
			System.out.println("-------관리자 로그인------");
			String adminId = conInput("관리자 아이디 : ");
			String adminPw = conInput("관리자 비밀번호 : ");
			
			AdminLogin login = new AdminLogin(adminId, adminPw);

			if(AdminLogin.logStatus) {//로그인 성공
				// 회원정보 처리메뉴		
				menuOutput();
			}else { // 로그인 실패
				System.out.println("관리자 로그인이 실패하였습니다.");
			}
		} while(true);
	}
	// 콘솔에서 데이터 입력 받는 메소드
	public String conInput(String title) {
		Scanner sc = new Scanner(System.in);
		System.out.print(title +" : ");
		return sc.nextLine();
	}
	public void menuOutput() {
		System.out.println("1. 전체회원\t2.회원등록\t3.회원수정\t4.회원삭제\t5. 회원검색\t6. 로그아웃\t7.종료");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberStart ms = new MemberStart();
		ms.start();
	}

}
