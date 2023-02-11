package JV12Algorithms;

import java.util.Scanner;

public class Diamond {

	//정수입력
	static int dataIn() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력(1~49)=");
		int max = scan.nextInt();
		if(max%2==0) {
			max++;
		}
		return max;
	}
	// 다이아몬드 출력
	static void diamondPrint(int max) {
		int step = 2;
		char str = 'A';
		for(int i=1; i>=1 ; i+=step) { // i=1,3,5,.......max,..... 5,3,1
			//공백
			for(int s=1; s<=(max-i)/2; s++) {
				System.out.print(" ");
			}
			//문자
			for(int j=1; j<=i; j++) {
				System.out.print(str++);//출력 다음문자가 만들어짐
				if(str>'Z') str = 'A';
			}			
			System.out.println();
			if(i==max) step = -2;
		}
	}
	public static void main(String[] args) {
		diamondPrint(dataIn());
	}
}
