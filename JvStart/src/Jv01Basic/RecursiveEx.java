package Jv01Basic;

import java.util.Scanner;

/*
1217 

두수를 입력받아 거듭제곱을 재귀호출로 작성하라.
[입력]
5
3
[결과]
125
*/
public class RecursiveEx {

	static int expo(int n, int m) {
		if(m==0) return 1;
		return n * expo(n, m-1);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n = s.nextInt(); // 5
		int m = s.nextInt(); // 3		

		System.out.println(expo(n,m));
	}
}
