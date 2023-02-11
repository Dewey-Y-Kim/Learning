package Jv01Basic;

public class Array03 {

	public Array03() {
		// TODO Auto-generated constructor stub
	}
	public void printArr(int[][] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [] [] arr= {{1,2,3,4,0}, {5,6,7,8,0},{9,10,11,12,0},{0,0,0,0,0 }};
		
		//
		for(int r=0; r<arr.length-1;r++) {//0, 1, 2
			for(int c=0; c<arr[r].length-1;c++) { // 0,1,2,3
				//누적
				//행의 합
				arr[r][4]+=arr[r][c];
				arr[3][c]+=arr[r][c];
				
			}
		}
		new Array03().printArr(arr);
	}
	
}
