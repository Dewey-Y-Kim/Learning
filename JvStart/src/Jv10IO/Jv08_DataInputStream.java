package Jv10IO;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jv08_DataInputStream {

	public Jv08_DataInputStream() {
		// DataInputStream : 파일에서 원래 데이터형의 크기로 값을 읽어온다.
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("/Users/do-hyoungkim/Documents/Data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
			int readInt = dis.readInt();
			double readDouble = dis.readDouble();
			boolean readBoolean = dis.readBoolean();
			char readChar = dis.readChar();
			
			System.out.printf("Int.%d\t Double.%f \tboolean.%b\t char.%s",readInt,readDouble,readBoolean, readChar);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv08_DataInputStream();
	}

}
