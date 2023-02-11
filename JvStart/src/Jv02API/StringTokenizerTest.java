package Jv02API;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {
		//문자열을 특정문자로 쪼개기
		//   연속 구분기호일때는 공백을 버린다.
		
		String data = "12 54,32.65,,,,,,,,76:32 75";  // 12, 54, 32, 65, 76, 32, 75
		StringTokenizer st = new StringTokenizer(data, " ,.:");
		
		System.out.println("토큰수 : "+ st.countTokens());
		// StringTokenizer는 index가 없으며, nextToken()메소드를 이용하여 토큰을 얻어와야 한다.		
		//합구하기
		int sum = 0;
		while(st.hasMoreTokens()) {//토큰이 있을때 까지 반복수행, true(있다.), false(없다)
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		new StringTokenizerTest();
	}
}
