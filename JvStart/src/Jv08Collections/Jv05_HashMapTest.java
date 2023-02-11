package Jv08Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Jv05_HashMapTest {

	public Jv05_HashMapTest() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		/* 
		 * HashMap
		 * key와 value를 가진다
		 * key 중복불가
		 * put< K , V > : 객체추가
		 */
		HashMap<String, MemberDTO> hm = new HashMap<>();
		
		hm.put("손오공", new MemberDTO("son","오공","010-1234-1234"));
		MemberDTO dto = new MemberDTO();
		dto.setUserid("vestable");
		dto.setName("지터");
		dto.setTel("011-1234-1234");
		hm.put("베지터", dto);
		hm.put("kingSeJong", new MemberDTO("king","SeJong","012-4321-4321"));
		hm.put("런닝맨",new MemberDTO("runnigman","Runner","013-1234-1234"));
		hm.put("Song", new MemberDTO("union","guild","014-1234-1234"));
		hm.put("고객", new MemberDTO("guest",null,null));
		
		
		//Map 컬렉션에서 객체 얻어오기
		MemberDTO value=hm.get("Song");
		System.out.println(value.toString()+ "\thmsize : "+hm.size());
		hm.put("Song", new MemberDTO("guild","union","015-1234-1234"));
		value=hm.get("Song");
		System.out.println(value.toString()+ "\thmsize : "+hm.size());
		
		// 모든 key 가져오기
		System.out.println("======================모든 키 가져오기================");
		Set<String> keylist = hm.keySet();
		Iterator<String> ii = keylist.iterator();
		while(ii.hasNext()) {
			MemberDTO dto2 = hm.get(ii.next());
			System.out.println(dto2.toString());
		}
		
		System.out.println("======================value를 이용한 가져오기================");
		Collection<MemberDTO> valueList = hm.values();
		Iterator<MemberDTO> iii = valueList.iterator();
		while(iii.hasNext()) {
			System.out.println(iii.next().toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv05_HashMapTest hmt = new Jv05_HashMapTest();
		hmt.start();
	}

}
