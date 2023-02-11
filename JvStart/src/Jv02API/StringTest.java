package Jv02API;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		String addr1 = "서울시 강남구";
		String addr2 = "서울시 강남구";
		String addr3 = new String("서울시 강남구");
		
		if(addr1 == addr2) {
			System.out.println("addr1, addr2는 같다.");
		}else {
			System.out.println("addr1, addr2는 다르다.");
		}

		if(addr2 == addr3) {
			System.out.println("addr2, addr3는 같다.");
		}else {
			System.out.println("addr2, addr3는 다르다");
		}
		// addr3.equals(addr2)
		if(addr2.equals(addr3)) {
			System.out.println("addr2, addr3는 같다.");
		}else {
			System.out.println("addr2, addr3는 다르다.");
		}
		
		//            0123456789012345679012
		String str = "Java programing test..";
		String str2 ="java String Test";
		// 특정 index위치의 문자를 얻어오기
		char r1 = str.charAt(5);
		System.out.println("r1->"+ r1);
		
		// str과 str2를 비교하는 메소드
		// str-str2을 계산하여 값의 차이를 구한다.
		// J  -> 74
		// j  -> 106  
		// 74 - 106 = -32
		// -  ->  str이 str2보다 작다
		// +  ->  str이 str2보다 크다
		// 0  ->  두수는 같다.
		int r2 = str.compareTo(str2);
		System.out.println("r2->"+ r2);
		
		int r3 = str.compareToIgnoreCase(str2); // 대소문자 구별없이 크기를 구한다.
		System.out.println("r3->"+ r3);
		
		//문자열 연결
		String r4 = str.concat(str2); // str2.concat(str);
		System.out.println("r4->"+ r4);
		
		byte r5[] = str.getBytes();
		System.out.println(Arrays.toString(r5));
		
//                0123456789012345679012
//	String str = "Java programing test..";
		//먼저 만나는 문자의 index를 구한다.
		//없으면 -1
		int r6 = str.indexOf("a");
		System.out.println("r6->"+ r6);
		
		int r7 = str.lastIndexOf("a");
		System.out.println("r7->"+ r7);
		
		//찾을 위치를 정해준다.
		int r8 = str.indexOf("a", 5);
		System.out.println("r8->"+ r8);
		
		String r9 = str.replace("Java", "자바");  // replaceAll()
		System.out.println("r9->"+ r9);
		
		//문자를 조각내기
		String tel = "010-1234-5678";  // 02-123-5678
		String telSplit[] = tel.split("-");
		System.out.println(Arrays.toString(telSplit));
		
//              0123456789012345679012
//String str = "Java programing test..";
		
		//문자열 일부 데이터 얻어오기    substring
		String r10= str.substring(16); // index위치에서 끝까지
		System.out.println("r10->"+ r10);
		
		String r11 = str.substring(5, 12); // 첫번째 index위치에서 두번째 index앞까지 문자열 얻어오기
		System.out.println("r11->"+ r11);
		
		String str3 = "    Trim 테스트     ";
		System.out.println("===="+ str3.trim()+"****");
		
		// valueOf : 정수, 실수, 논리, char배열을 문자열로 변환한다.
		char c[] = {'J','A','V','A'};
		
		String r12 = String.valueOf(c);
		System.out.println("r12->"+ r12);
		
		//문자열의 크기비교
		String str10 = "Oracle"; // O->79
		String str11 = "oralce"; // o->111
		
		// compareTo(String) : 
		// + : 왼쪽객체가 크다.
		// - : 오른쪽객체가 크다.
		int result10 = str11.compareTo(str10);
		System.out.println("str10, str11 ->" + result10);// -32
	}
}
