package Jv01Basic;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class FileReaderTEst {

	public FileReaderTEst() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File file = new File("src/sungjuk.txt");
		System.setIn(new FileInputStream(file));
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()){
			
			String str = scan.nextLine();
			System.out.println(str);}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
