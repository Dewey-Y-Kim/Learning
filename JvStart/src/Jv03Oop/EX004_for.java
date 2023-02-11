package Jv03Oop;
import java.util.Scanner;

import Jv02API.String;
public class EX004_for {

	public static void main(String[] args) {
		System.out.print("단 입력 ->");
		Scanner sc=new Scanner(System.in);
		int mat= sc.nextInt();
		if (mat <=1 || mat>9) System.out.println("단을 잘못 입력 하였습니다.");
		else {
			for (int i=2; i<=9; i++) {
				System.out.println(mat+" * "+i+" = "+mat*i);
			}
		}
	}

}
/*
[실행]
단 입력->10
단을 잘못입력하였습니다.

단 입력-> 5
5 * 2 = 10
5 * 3 = 15
...
5*9 =45
 */
		