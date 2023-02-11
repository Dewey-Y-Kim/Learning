package Jv01Basic;

public class Array2Ex03 {

	

	public static void main(String[] args) {
		
		int [][] arr = {
				{1,2,3,4,0},
				{5,6,7,8,0},
				{9,10,11,12,0},
				{9,10,23,12,0},
				{0,0,0,0,0}
		};
		//계산
		for(int r=0; r<arr.length-1 ; r++) {//0,1,2      4
			for(int c=0; c<arr[r].length-1; c++) {//0,1,2,3  5
				//누적
				arr[r][arr[r].length-1] += arr[r][c];//행의 합
				arr[arr.length-1][c] += arr[r][c]; //열의 합
			}
		}
		//출력
		for(int r=0; r<arr.length; r++) {
			for(int c=0; c<arr[r].length; c++) {
				System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}
	}
}
