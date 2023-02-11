package Jv10IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Jv05_FileReaderTest {

	public Jv05_FileReaderTest() {
		// 파일 문자를 읽어 콘솔(줄단위)출력
		
		File file = new File("/users/do-hyoungkim/documents","EX01_carendarOBJ.java");
		// System.out.println(file.exists());
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while(true) { //BufferedReader 객체에서 1줄씩 읽어 콘솔에 출력
				String line= br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);
				
			}
		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			fnfe.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("The End.....");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv05_FileReaderTest();
	}

}
