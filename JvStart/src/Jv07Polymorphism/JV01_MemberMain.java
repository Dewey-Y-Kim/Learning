package Jv07Polymorphism;

public class JV01_MemberMain {

	public JV01_MemberMain() {
		// TODO Auto-generated constructor stub
		JV01_MemberAccess ma = new JV01_MemberAccess();
		JV01_MemberDTO m =ma.getMember();
		System.out.println(m.toString());
		
		JV01_MemberDTO[] arr=ma.getAllMember();
		
		for(int i=0; i<arr.length; i++) {
			JV01_MemberDTO dto = arr[i];
			System.out.printf("%s \t %s \t %s \t %s \t %s \n", dto.getUserid(), dto.getPasswd(),dto.getName(),dto.getTel(),dto.getEmail() );
		}
	}
	
	public static void main(String[] args) {
		new JV01_MemberMain();
	}

}
