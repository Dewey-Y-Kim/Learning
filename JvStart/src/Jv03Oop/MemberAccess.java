package Jv03Oop;

import Jv02API.String;

public class MemberAccess {
	String id = "goguma";
	String name= "고구마";
	String tel="010-8888-7777";
	String email = "goguma@daum.net";
	public MemberAccess() {		
	}
	public MemberDTO getMember() {
		MemberDTO dto = new MemberDTO();
		dto.setUserid(id);
		dto.setUsername(name);
		dto.setTel(tel);
		dto.setEmail(email);
		
		return dto;		
	}
	public MemberDTO[] getAllMember() {
		//DB회원선택후
		// 1명의 회원은 DTO담고  배열에 담는다.
		MemberDTO m1 = new MemberDTO();
		m1.setUserid("java");
		m1.setUsername("홍길동");
		m1.setTel("010-4567-2584");
		
		MemberDTO m2 = new MemberDTO("master","마스터","010-7777-8888");
		MemberDTO m3 = new MemberDTO("admin","나관리자","010-1111-2222");
		
		// 배열에 MemberDTO 담기
		//int[] a = new int[3];
		MemberDTO[] member = new MemberDTO[3];
		member[0] = m1;
		member[1] = m2;
		member[2] = m3;
		
		return member;		
	}
}
