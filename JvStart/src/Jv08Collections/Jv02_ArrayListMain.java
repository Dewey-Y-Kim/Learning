package Jv08Collections;
import java.util.ArrayList;

public class Jv02_ArrayListMain {

	public Jv02_ArrayListMain() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		Jv02_ArrayListTest alt = new Jv02_ArrayListTest();
		ArrayList al = alt.memberList();
		
		for (int i = 0 ; i<al.size();i++) {
			MemberDTO dto = (MemberDTO)al.get(i);
			System.out.printf("%s\t %s\t %s\t %s\t\n" , dto.getUserid(), dto.getName(),dto.getTel(),dto.getEmail());
			
		}
		System.out.println("==============================================");
		Object[] memObj = al.toArray();
		for (Object m : memObj) {
			MemberDTO dto=(MemberDTO)m;
			System.out.println(dto.toString());
		}
		System.out.println("============ArrayList 확장for문쓰기==============");
		for( Object m : al ) {
			MemberDTO dto=(MemberDTO)m;
			System.out.println(dto.toString());
		}
		System.out.println("============ArrayList 제너릭===================");
		ArrayList<MemberDTO> atl2 = alt.memberList2();
		for (MemberDTO m: atl2) {
			System.out.println(m.toString());
		}
		System.out.println("==============================================");
		for (int i = 0; i<atl2.size(); i++) {
			MemberDTO dto = atl2.get(i);
			System.out.printf("%10s %10s %15s %10s %10s\n",dto.getUserid(),dto.getPasswd(),dto.getName(),dto.getEmail(),dto.getTel(),dto.getEmail());
			
		}
		
	
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv02_ArrayListMain().start();
		
	}
	

}
