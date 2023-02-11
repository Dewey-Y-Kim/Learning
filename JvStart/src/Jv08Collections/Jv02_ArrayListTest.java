package Jv08Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Jv02_ArrayListTest {

	public Jv02_ArrayListTest() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList memberList() {
		// 회원 1명의 정보를 DTO에 셋팅하고
		// DTO를 ArrayList에 추가하여 리턴해주는 메소드
		ArrayList memList = new ArrayList();
		// add(Object ) : 마지막에 객체 추가
		// add(int, obeject) : int 위치에 객체를 추가하여 int 위치에 객체가 있으면 다음으로 이동한다.
		memList.add(new MemberDTO("hong","kil","010-1234-1234","hong@gmail.com"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("master","ms","010-2345-2345","ma@gamil.com"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("Admin");
		dto.setName("dk");
		dto.setEmail("d@dto.com");
		memList.add(dto);
		
		return memList;
	}
	
	public ArrayList<MemberDTO> memberList2() {
		// 회원 1명의 정보를 DTO에 셋팅하고
		// DTO를 ArrayList에 추가하여 리턴해주는 메소드
		
		/* 
		 * 컬렉션에 제너릭을 설정하면
		 * 컬렉션에 추가할 수 있는 객체타입을 지정할 수 있다.
		 * 컬렉션에 설정된 타입과 다르면 추가할 수 없다.
		 */
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
		// add(Object ) : 마지막에 객체 추가
		// add(int, obeject) : int 위치에 객체를 추가하여 int 위치에 객체가 있으면 다음으로 이동한다.
		memList.add(new MemberDTO("hong","kil","010-1234-1234","hong@gmail.com"));
		memList.add(new MemberDTO());
		memList.add(new MemberDTO("master","ms","010-2345-2345","ma@gamil.com"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("Admin");
		dto.setName("dk");
		dto.setEmail("d@dto.com");
		memList.add(dto);
		
		
		//memList.add(new Scanner(System.in)); 
		// -> scanner는 memberDTO가 아니므로 추가할 수 없다.
		 
		return memList;
	}
	

}
