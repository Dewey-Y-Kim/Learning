package Jv01Basic;

public class Array2ex02 {

	public Array2ex02() {
		// TODO Auto-generated constructor stub
	}
	
	public void Array2ex02_1() {
		String[][] arr = new String[5][5];
		for(int r=0;r<5;r++) {
			for(int c=0;c<5;c++) {
				if ((c== 4-r) || (c== r)) {
					arr[r][c]="X";
				}else {
					arr[r][c]="O";
				}
			}
		}
		for(int r=0;r<5;r++) {
			for(int c=0;c<5;c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	
	public void Array2ex02_2() {
		int[][] arr=new int[4][5];
		int i=0;
		System.out.println(arr.length);
		System.out.println(arr[i].length);
		for(int r=0;r<arr.length-1;r++) {
			for(int c=0;c<arr[r].length-1;c++) {
				if(c==4||r==3) {
					arr[r][c]=0;
				} else {
					i++;
					arr[r][c]=i;
				}
			}
		}
		for(int r=0;r<4;r++) {
			for(int c=0;c<5;c++) {
				System.out.print(arr[r][c]+"\t");
			}
			System.out.println();
		}
	}
	
	public void Array2ex02_3() {
		int[][] arr=new int[4][5];
		int i=0;
		
		for(int r=0;r<arr.length-1;r++) {
			
			for(int c=0;c<arr[r].length-1;c++) {
				if ( r != arr.length-1 ) {
					i++;
					arr[r][c]=i;
					arr[r][4]+=arr[r][c];
					arr[3][c]+=arr[r][c];
				}
				
			}
			
		}
		printArr(arr);
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
		new Array2ex02().Array2ex02_1();
		System.out.println("\n");
		new Array2ex02().Array2ex02_2();
		System.out.println("\n");
		new Array2ex02().Array2ex02_3();
	}
}
