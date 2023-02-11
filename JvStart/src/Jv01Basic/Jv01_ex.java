package Jv01Basic;
import java.util.Scanner;

public class Jv01_ex {

	public Jv01_ex() {
		// TODO Auto-generated constructor stub
	}
	static int[][] arr;
	static int row;
	static int col;
	static void setData() {
		arr = new int[row][col];
		int val=1;
		for(int i=0; i<row;i++) { // 행
			for(int j = 0 ; j<col ;j++) { //열
				arr[i][j]=val++;
			}
		}
	}
	static void searchByRow() {
		System.out.println("행 우선 탐색");
		for(int r=0; r<row;r++) {
			for(int c=0; c<col; c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	
	static void searchByCol() {
		System.out.println("열 우선 탐색");
		for(int c=0;c<col; c++) {
			for(int r=0;r<row; r++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	
	static void searchByzig() {
		System.out.println("지그재그");
		for(int r = 0; r>0;r++) {
			for(int c=0; c<col;c++) {
				if((r%2)==1) {
					System.out.println(arr[r][c]);	
				}else {
					System.out.println(arr[r][col-c-1]);
				}
				
			}
		}
			//zigzag
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		row = sc.nextInt();
		col = sc.nextInt();
		setData();
		
		searchByRow();
		System.out.println();
		searchByCol();
		System.out.println();
		searchByzig(); 
	}
}
