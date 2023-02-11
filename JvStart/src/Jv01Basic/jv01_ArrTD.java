package Jv01Basic;
import java.util.Arrays;

public class jv01_ArrTD {

	public jv01_ArrTD() {
		// 2차원 배열 : 행과 열이 있는 표형식으로 데이터를 관리할 수 있다.
	}

	public static void main(String[] args) {
		// 2차원 배열 생성
		int arr[][]; // 생성 전
		int arr2[][]=new int[5][4]; 
		// 생성됨 초기값 int : 0; double = 0.0 object = null;
		Object[][] obj = new Object[2][3];
		arr2[1][0] = 100; // 1행 0 열 10 대입
		arr2[2][1] = 2;
		/*
		 * 1차원 배열 : 배열명.length - >  배열의 크기
		 * 2차원 배열 : 배열명[행].length -> 행index의 크기
		 */
		
		for(int row = 0 ; row < arr2.length ; row++) {
			for(int col = 0 ; col < arr2[row].length; col++) {
				System.out.print(arr2[row][col]+" \t ");
			}
			System.out.println();
		}
		
		int arr3[][] = new int[][] {{1,2,3}, 
								    {10,20,30,40}, 
								    {100, 200, 300}};
        String arr4[][] = {{"A","B","C","D"},{"가","나","다"},{"1","2","3"}};
        System.out.println("====== arr3 =====");
        for(int row = 0 ; row < arr3.length ; row++) {
			for(int col = 0 ; col < arr3[row].length; col++) {
				System.out.print(arr3[row][col]+" \t ");
			}
		System.out.println();
		}
        System.out.println("====== arr4 =====");
        for(int row = 0 ; row < arr4.length ; row++) {
			for(int col = 0 ; col < arr4[row].length; col++) {
				System.out.print(arr4[row][col]+" \t ");
			}
		System.out.println();
		}

	}

}
