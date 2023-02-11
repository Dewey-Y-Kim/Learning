package JV12Algorithms;

/*

    *
   ***
  *****
 *******
*********

*********
 *******
  *****
   ***
    *
*/
public class Triangle {
	static void startTriangle(int max) {
		//int max = 9;
		for(int i=1; i<=max; i+=2) {//출력문자수 1,3,5,7,9,11,13,       i+=2,  i=i+2
			//공백출력	    (max-i)/2		
			for(int s=1; s<=(max-i)/2; s++) {//  1 --> 4
				System.out.print(" ");
			}			
			for(int j=1; j<=i; j++) {//문자출력
				System.out.print("*");
			}
			////
			System.out.println();
		}
	}
	static void startTriangle2(int max) {
		for(int i=max; i>0; i-=2) {//max=9->  i=9, 7, 5, 3, 1
			//공백
			for(int s=1; s<=(max-i)/2; s++ ) {
				System.out.print(" ");
			}			
			for(int j=1; j<=i; j++) {//문자
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		startTriangle(9);
		startTriangle2(9);
	}
}
