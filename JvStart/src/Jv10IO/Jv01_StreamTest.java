package Jv10IO;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.imageio.IIOException;

public class Jv01_StreamTest {

	public Jv01_StreamTest() {
		/*
		 *  InputStream : InputStream은 추상메소드를 포함한 추상클래스이므로 상속을 받아 추상메소드를 오버라이딩 해야한다.
		 *  System.in 필드에 객체가 생성되어 있다.
		 */
		InputStream is = System.in;
		/*
		try {
			while(true) {
			//read() : 콘솔 파일 네트워크에서 자바로 읽어오기.
			int code = is.read(); //사용자가 값을 입력후 enter입력시까지 기다림, 입력후 값이 없을때 -1
			if (code < 0) {
				break;
			}
			System.out.println(code+", "+(char)code);
		*/
		//read(byte[]);한번에 바이트 배열크기만큼 읽어오기
		while(true) {
			byte[] data = new byte[10];
			
			try {
				
				int code = is.read(data);
				System.out.println(Arrays.toString(data));
				System.out.println("code =>"+code);
				System.out.println(new String(data,0,code)+"-------");
			}catch(IOException ie) {
				System.out.println(ie.getMessage());
				break;
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv01_StreamTest();
	/*
	 * 실행
	 * test
	 */
		
	}

}
