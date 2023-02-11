package Jv10IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Jv09_1_ObjectInputStramtest {

	public Jv09_1_ObjectInputStramtest() {
		// ObjectInputStream : 파일에 객체로 저장되어있는 정보를 얻어오기.
		try {
			File f = new File("/Users/do-hyoungkim/Documents","object.txt");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Jv01_VectorTest vt = (Jv01_VectorTest)ois.readObject();
			System.out.println("vt.msg : ");
			
			
			System.out.println();
		}catch(Exception e){
			e.printStackTrace();}
		
	}
	
	public static void main(String[] args) {
		new Jv09_1_ObjectInputStramtest();
	}
}
