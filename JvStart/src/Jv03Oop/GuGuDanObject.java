package Jv03Oop;
import java.util.Scanner;

public class GuGuDanObject {
	int a;
	static int b;
	public GuGuDanObject() {}
	// 단을 입력받는 메소드
	public int inputDan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단입력->");
		int dan = scan.nextInt();
		return dan;
	}
	// 1개의 단을 처리하는 메소드
	public static void oneDan(int dan) {
		for(int i=1; i<=9; i++) {
			int result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
		}
	}
	// 전체단(2~9)을 처리하는 메소드
	public static void allDan() {
		for(int dan=2; dan<=9; dan++) {//단
			System.out.println("="+dan+"단=");
			oneDan(dan);
			/*for(int i=1; i<=9; i++) {
				int result = dan * i;
				System.out.println(dan + " * " + i + " = " + result);
			}*/
		}
	} 
}
