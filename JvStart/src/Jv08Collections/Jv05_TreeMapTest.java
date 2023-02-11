package Jv08Collections;
import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Jv05_TreeMapTest {

	public Jv05_TreeMapTest() {
		// TODO Auto-generated constructor stub
		/*
	 * treeMap
	 * key 와 value를 가진다.
	 * key를 정렬한다.
	 */
	
	TreeMap<String, MemberDTO> tm= new TreeMap<>();
	tm.put("손오공", new MemberDTO("son","오공","010-1234-1234"));
	tm.put("베지터",new MemberDTO("vestable", "지터","011-1234-1234"));
	tm.put("kingSeJong", new MemberDTO("king","SeJong","012-4321-4321"));
	tm.put("런닝맨",new MemberDTO("runnigman","Runner","013-1234-1234"));
	tm.put("Song", new MemberDTO("union","guild","014-1234-1234"));
	tm.put("고객", new MemberDTO("guest",null,null));
	
	System.out.println("--------key목록을 구하여 전체 출력-------------------");
	Set<String> keyList= tm.keySet();
	System.out.println("keySet() : "+keyList.toString());
	
	System.out.println("-----------------value목록을 구하여 전체출력 --------------");
	Collection<MemberDTO> valueList = tm.values();
	Object[] objList = valueList.toArray();
	for(Object obj:objList) {
		MemberDTO dto =(MemberDTO)obj;
		System.out.println(dto.toString());
		
	}
	
}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv05_TreeMapTest tmt= new Jv05_TreeMapTest();
	}

}
