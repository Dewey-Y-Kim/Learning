package Jv10IO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Jv09_ObjectOutputStream {

	public Jv09_ObjectOutputStream() {
		// Object Output Stream  객체를 쓰기할 수 있는 클래스
		try {
			File f = new File("/Users/do-hyoungkim/Documents","object.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Jv01_VectorTest vt = new Jv01_VectorTest();
			vt.msg = "ObjectOutputStream이용한 객체를 파일로 기록하기";
			oos.writeObject(vt);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 
		new Jv09_ObjectOutputStream();
	}

}
