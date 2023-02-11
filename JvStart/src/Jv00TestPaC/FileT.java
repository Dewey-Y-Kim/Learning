package Jv00TestPaC;
import java.io.File;

public class FileT {

	public FileT() {
		// TODO Auto-generated constructor stub
	}
	public void test() {
		File f1 = new File("/Users/do-hyoungkim/Documents");
		File[] f2=f1.listFiles();
		for(File f:	f2) {
			System.out.println(f.getPath());
		}
		
	}
	public static void main(String args) {
		FileT f = new FileT();
		f.test();
	}
}
