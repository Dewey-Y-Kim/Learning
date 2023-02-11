package Jv03Oop;
import Jv02_api.String;

public class SubTest extends SuperTest{
	public SubTest(int a) { super(a); }
	
	public SubTest() {
		this.a=10;
		// super.a=10;
		// a=10;
		// super(10);
		// this(10);
	}
	public static void main(String[] args) {
		SubTest st = new SubTest();
		
		System.out.println(st.a);
	}

}
