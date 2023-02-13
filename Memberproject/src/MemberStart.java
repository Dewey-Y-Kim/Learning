import java.util.List;
import java.util.Scanner;

import Member.MemberDAO;
import Member.MemberDTO;
import jdbc.DbC;

public class MemberStart extends DbC {
	Scanner sc = new Scanner(System.in);
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
			
			while(AdminLogin.logStatus) {//로그인 성공
				// 회원정보 처리메뉴		
				int menu = menuOutput();
				switch(menu) {
					case 1: // 전체회원목록
						memberList();
						break; 
					case 2: // 회원등록
						memberInsert();
						break; 
					case 3: // 회원수정
						memberEdit();
						break; 
					case 4: // 회원삭제
						memberDel();
						break;
					case 5: // 회원검색 - 이름 연락처
						memberSearch();
						break;
					case 6: // 로그아웃
						login.logout();
						break;
					case 7: //프로그램 종료
						System.out.println("회원관리 프로그램이 종료되었습니다.");
						System.exit(0);
						break;
					default :
						System.out.println("메뉴를 잘못 입력하였습니다.");
						
				}
			}
			
		} while(true);
	}
	// 콘솔에서 데이터 입력 받는 메소드
	public String conInput(String title) {
		
		System.out.print(title +" : ");
		return sc.nextLine();
	}
	
	// 메뉴 표시
	public int menuOutput() {
		int menu=-1;
		try {
		System.out.println("1.전체회원목록 \t 2.회원등록 \t 3.회원수정 \t 4.회원삭제 \t 5. 회원검색 \t 6. 로그아웃 \t 7.종료");
		menu=Integer.parseInt(sc.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("메뉴는 숫자여야 합니다.");
		}
		return menu;
	}
	public void memberPrint(List<MemberDTO> list) {
		System.out.printf("%s\t %10s\t %15s\t %20s\t %20s\t %10s\n", "번호","회원명","연락처", "이메일", "주소", "등록일");
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.printf("%d\t %10s\t %15s\t %20s\t %20s\t %10s\n", dto.getNo(), dto.getUsername(), dto.getTel(), dto.getEmail(), dto.getAddr(), dto.getWritedate());
		}
	}
	public void memberList() {
		MemberDAO dao=MemberDAO.getInstance();
		List<MemberDTO> list= dao.memberAll();
		memberPrint(list);
	}
	public void memberInsert() {
		// 회원명, 회원 연락처, 이메일, 주소를 DTO에 담는다.
		String username = conInput("회원명");
		String tel = conInput("연락처(ex:010-1234-5678)");
		String email = conInput("이메일");
		//이메일 유효성 검사 등 가능
		String addr = conInput("주소");
		
		MemberDTO dto = new MemberDTO(username, tel, email, addr);
		MemberDAO dao = MemberDAO.getInstance();
		int result=dao.memberwrite(dto);
		// result =0 회원등록 성공 / =1 실패
		if(result > 0) {
			System.out.println("회원이 등록 되었습니다.");
		}else {
			System.out.println("회원등록이 실패하였습니다.");
		}
	}
	//3. edit
	public void memberEdit() {
		// 수정할 회원이름
		String username = conInput("수정할 회원명");
		// 수정할 항목 선택( 연락처, 이메일, 주소)
		int item = Integer.parseInt(conInput("수정할 항목(1.연락처  2.이메일  3. 주소"));
		// 변경할 값 선택
		String editdata= conInput("수정할 값");
		
		MemberDAO dao=MemberDAO.getInstance();
		int result=dao.memberUpdate(username, item, editdata);
		if(result>0) {
			System.out.println("회원 정보가 "+result+"명 수정 되었습니다.");
		}else {
			System.out.println("회원 정보가 실패하였습니다.");
		}
	}
	//4.delelte
	public void memberDel() {
		memberSearch();
		int no=Integer.parseInt(conInput("삭제할 회원번호"));
		MemberDAO dao= MemberDAO.getInstance();
		int result = dao.memberDelete(no);
		if(result>0) {
			System.out.println(no+"번 회원이 삭제되었습니다.");
		} else {
			System.out.println(no+"번 회원을 삭제하지 못했습니다.");
		}
		
	}
	//5.search
	public void memberSearch() {
		String keyword=conInput("검색할 회원명 or 전화번호");
		MemberDAO dao=MemberDAO.getInstance();
		List<MemberDTO> list= dao.Searchselect(keyword);
		
		memberPrint(list);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberStart ms = new MemberStart();
		ms.start();
	}

}
