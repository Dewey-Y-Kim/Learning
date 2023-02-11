package Jv10IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Jv10_FileCopyTest {

	public Jv10_FileCopyTest() {
		/* 
		 * file2file write
		 * 읽을 file을 객체로.
		 */
		File orgFile = new File("/Users/do-hyoungkim/Documents","ka.jpeg");
		File tgtFile = new File("/Users/do-hyoungkim/Documents/test",orgFile.getName());
		try {
			FileInputStream fis = new FileInputStream(orgFile);
			FileOutputStream fos = new FileOutputStream(tgtFile);
			
			// 파일의 크기만큼 배열 생성
			byte[] inData = new byte[(int)orgFile.length()];
			System.out.println("cheak");
			int cnt = fis.read(inData,0,inData.length);
			System.out.println("읽어온 바이트수 = "+cnt+", 배열의 길이 ="+ inData.length);
			fos.write(inData,0,cnt);
			fos.close();
			fis.close();
		} catch(Exception fnfe) {
			fnfe.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv10_FileCopyTest();
	}

}
