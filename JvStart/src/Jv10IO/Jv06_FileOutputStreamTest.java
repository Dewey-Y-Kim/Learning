package Jv10IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Jv06_FileOutputStreamTest {

	public Jv06_FileOutputStreamTest() {
		// FileOutputStream : byte 단위로 파일 쓰기
		try {
			File file = new File("/users/do-hyoungkim/documents","Test.txt");
			FileOutputStream fos = new FileOutputStream(file);
			
			String[] inData = {"Java","문자열\n"," 파일로 만들기"};
			for(String data : inData) {
				fos.write(data.getBytes());
			}
		}catch(IOException IOE) {
			IOE.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Jv06_FileOutputStreamTest();
	}
}
