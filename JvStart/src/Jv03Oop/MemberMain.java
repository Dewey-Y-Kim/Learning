package Jv03Oop;

import Jv02API.String;

public class MemberMain {

	public MemberMain() {
		MemberAccess ma = new MemberAccess();
		MemberDTO m = ma.getMember();
		System.out.println(m.toString());	
		
		MemberDTO[] arr = ma.getAllMember();
		
		for(int i=0; i<arr.length; i++) {
			MemberDTO dto = arr[i];
			System.out.printf("%s\t%s\t%s\n", dto.getUserid(), dto.getUsername(), dto.getTel());
		}
	}

	public static void main(String[] args) {
		new MemberMain();
	}
}
