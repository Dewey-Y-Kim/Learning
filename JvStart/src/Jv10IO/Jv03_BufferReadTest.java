package Jv10IO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jv03_BufferReadTest {

	public Jv03_BufferReadTest() {
		// 콘솔에서 입력받은 buffer에 임시로 저장한 후 줄 단위로(enter 기준) 읽어오는 기능이 있다.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		try {
			String line = br.readLine(); 
			System.out.println(line);
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv03_BufferReadTest();
	}

}
