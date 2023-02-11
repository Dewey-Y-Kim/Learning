package Jv02API;
import java.util.StringTokenizer;
import java.lang.*;
public class Java09_StringTokenize {

	public Java09_StringTokenize() {
		/*
		 *  StringTokenizer
		 *  문자열을 특정문자로 쪼개기
		 *  연속 구분 기호일 때는 공백을 버린다.
		 */
		java.lang.String data = "12 54, 32. 65 76:32 75";
		StringTokenizer st = new StringTokenizer(data, " ,.:");
		
		System.out.println("토큰수 : "+ st.countTokens());
		// stringTokenizer 는 index가 없으며, next()메소드를 이용하여 토큰을 얻어와야 한다.
		// 합구하기
		int sum =0;
		while(st.hasMoreTokens()) {// 토큰이 있는 동안 반복수행
			sum +=Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Java09_StringTokenize();
	}
}
