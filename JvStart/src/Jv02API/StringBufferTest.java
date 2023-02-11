package Jv02API;

public class StringBufferTest {

	public static void main(String[] args) {
		// 문자열처리 하는 클래스 : String, StringBuffer, StringBuilder
		
		StringBuffer sb = new StringBuffer();
		//마지막에 추가
		sb.append(1234);
		sb.append("ABCDE");
		sb.append(5555.3698);
		sb.append(true);
		// 0123456
		// 1234ABCDE5555.3698true
		//원하는 위치에 추가  
		sb.insert(5, "스트링버퍼");
		// 012345 67
		// 1234A스트링버퍼BCDE5555.3698true
		//문자열의 일부 지우기
		sb.delete(3, 6);
		
		System.out.println("capacity->"+ sb.capacity());
		System.out.println(sb.toString());
		
		sb.reverse();
		System.out.println(sb.toString());
		
		sb.setLength(sb.length()-3);
		System.out.println(sb.toString());
	}
}
