package JV12Algorithms;

import java.util.Scanner;

/*
9
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********

*/
public class Sequence02 {

	public Sequence02() {
		
	}
	static void triangle(int max) {
		for(int row=1; row<=max; row++) {//출력할 문자의 갯수 1,2,3,4,5,6,7,8,9
			//공백           9 - 1
			for(int s=1; s<=max-row; s++) {
				System.out.print(" ");
			}
			//문자출력
			for(int i=1; i<=row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		
		triangle(max);
	}

}
