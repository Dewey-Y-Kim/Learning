package Jv02API;

public class MathTest {

	public MathTest() {		
	}

	public static void main(String[] args) {
		System.out.println((int)Math.ceil(5.1) +", "+ (int)Math.ceil(-5.1));// 6 올림(큰값)   -5.1  -5

		int n = (int)Math.round(52.3);
		int n2 = Math.round((float)52.3);
		
		System.out.println(Math.floor(8.9)+", "+ Math.floor(-3.1));
		
		System.out.println(Math.sqrt(10));
		
		System.out.println((int)Math.pow(5, 3));
	}

}
