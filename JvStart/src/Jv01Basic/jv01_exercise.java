package Jv01Basic;

public class jv01_exercise {

	public jv01_exercise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][4];
		int num=0;
		for (int i=0 ; i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				num++;
				arr[i][j]=num;
			}
		}
		
		for (int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("======= 열우선 ========");
		for (int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
				
			}
			System.out.println();
		}
		
		
	}

}
