package Jv10IO;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Jv02_InputStreamReaderTest {

	public Jv02_InputStreamReaderTest() {
		// InputStreamReader : 콘솔에서 문자(유니코드)단위로 입력받는 클래스
		
	
		InputStreamReader isr = new InputStreamReader(System.in);
		while(true) {
			try {
				
			//	int strInt =isr.read(); // 1번에 한 문자씩 입력받는다.
			//	System.out.println(strInt +" --> "+(char)strInt);
			
				//배열을 이용한 입력
				char[] st = new char[10];
				int stInt = isr.read(st);
				// new String(st); 
				
				System.out.println(stInt + "-->"+String.valueOf(st));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv02_InputStreamReaderTest();
	}

}
