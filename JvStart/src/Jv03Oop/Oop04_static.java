package Jv03Oop;
import java.util.Scanner;

import Jv02API.String;

public class Oop04_static {
	
	public static void main(String args) {
		System.out.println("Hello Java..");
	}
	
	//단을 입력받는 메소드
	public Oop04_static() {}
	
	public int inputDan() {
		Scanner scan =new Scanner(System.in);
		System.out.print("단 입력 - > ");
		int dan = scan.nextInt();
		return dan;
	}
	//1개의 단을 처리하는 메소드
	public void oneDan(int dan) {
		for(int i=1; i<=9; i++) {
			int result = dan * i;
			System.out.println(dan +" * "+ i + " = "+ result);
		}
	}
	
	//전체 단(2~9을 처리하는 메소드
	public void allDan() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("****"+dan+"단 ****");
			/* for(int i=1; i<=9; i++) {
				int result= dan * i;
				System.out.println(dan+" * "+ i +" = " + result);
			} */
			oneDan(dan);
		}
	}
}
