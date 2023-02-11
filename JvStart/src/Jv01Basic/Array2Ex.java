package Jv01Basic;

import java.util.Scanner;

public class Array2Ex {
	
	static int arr[][];
	static int row;
	static int col;
	
	public Array2Ex() {
		
	}
	static void setData() {
		arr = new int[row][col];
		int value = 1 ;
		for(int i=0; i<row; i++) {//행
			for(int j=0; j<col; j++) {//열
				arr[i][j] = value++;
			}
		}
	}
	static void searchByRow() {
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	static void searchByCol() {
		for(int c=0; c<col; c++) {//열 index
			for(int r=0; r<row; r++) {// 행 index
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	static void searchByZigzag() {
		for(int r=0; r<row; r++) {//행
			if(r%2==0) {
				for(int c=0; c<col; c++) {//열  0,1,2,3    
					System.out.print( arr[r][c]+"\t");
				}
			}else {
				for(int c=col-1; c>=0; c--) {// 3,2,1,0
					System.out.print(arr[r][c]+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		row = scan.nextInt();//행의 수
		col = scan.nextInt();//열의 열
		//초기값
		setData();
		System.out.println("** 행우선 탐색 **");
		searchByRow();
		System.out.println("** 열우선 탐색 **");
		searchByCol();
		System.out.println("** 지그재그 탐색 **");
		searchByZigzag();
	}
}
