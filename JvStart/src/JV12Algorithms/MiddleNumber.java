package JV12Algorithms;

import java.util.Scanner;

/*
[문제]
3개의 정수를 입력받아 중간값을 출력하라.

[실행결과]
54
75
34
54
*/
public class MiddleNumber {

	public MiddleNumber() {
		
	}
	static int middleCheck(int a, int b, int c) {		
		if(a<b && b<c || c<b && b<a) {//b가 중간값일때
			return b;
		}else if(b<a && a<c || c<a && a<b) {//a가 중간값일때
			return a;
		}else if(a<c && c<b || b<c && c<a) {//c가 중간값일때
			return c;
		}else {//중간값이 없을때
			return -1;
		}		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());
		
		int middle = middleCheck(a, b, c);
		System.out.println(middle);
	}

}
