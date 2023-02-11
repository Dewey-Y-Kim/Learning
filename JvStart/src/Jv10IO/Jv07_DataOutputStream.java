package Jv10IO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Jv07_DataOutputStream {

	public Jv07_DataOutputStream() {
		//  기본 데이터형의 값을 해당 데이터형의 byte만큼 확보하여, 저장
		try {
			File file = new File("/users/do-hyoungkim/documents/","data.txt");
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			int dataInt = 5128;
			double dataDouble = 13.2;
			boolean dataBoolean = true;
			char dataChar = 'c';
			dos.writeInt(dataInt);
			dos.writeDouble(dataDouble);
			dos.writeBoolean(dataBoolean);
			dos.writeChar(dataChar);
			
			
			
			
		} catch (FileNotFoundException fnfe) {
		} catch (IOException ie) {}
		
		
	}
	
		
		
	
	
	
	
	public static void main(String[] args) {
		///
		new Jv07_DataOutputStream();
		
	}
}
