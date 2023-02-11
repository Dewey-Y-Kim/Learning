package Jv07Polymorphism;

public class JV01_MemberAccess {
	String id = "youth";
	String name = "잠탱";
	String tel = "010-1234-1234";
	String email = "alpha@beta.com";
	
	public JV01_MemberAccess() {
		// TODO Auto-generated constructor stub
	}
	public JV01_MemberDTO getMember() {
		JV01_MemberDTO dto = new JV01_MemberDTO();
		dto.setUserid(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setTel(tel);
		return dto;
	}
	
	public JV01_MemberDTO[] getAllMember() {
		// dv 회원 선택후
		// 1명의 회원은 DTO에 담고 배열에 담는다.
		// JV01_MemberDTO m1 = new JV01_MemberDTO("wl","gang","4321","010-1234-1234","b");
		JV01_MemberDTO[] member = new JV01_MemberDTO[3];
		// id name pw tel email
		member[0] = new JV01_MemberDTO("id","hong","1234","010-1234-4231", "a123@gmail.com");
		member[1] = new JV01_MemberDTO("we","kang","2345","010-2345-4231", "b123@gmail.com");
		member[2] = new JV01_MemberDTO("as","song","3456","010-3456-4231", "c123@gmail.com");
		return member;
		
		
	}
}
