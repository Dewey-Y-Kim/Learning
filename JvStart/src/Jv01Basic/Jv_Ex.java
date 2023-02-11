package Jv01Basic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.Collections;

public class Jv_Ex {

	public Jv_Ex() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("/Users/do-hyoungkim/Documents","sungjuk.txt");
		int row=-1;
		String[] nameArr=new String[10];
		Integer[] rank=new Integer[10];
		int[][] scoreArr= new int[12][6];
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			String s=" ";
			while(s !=null) {
				s= br.readLine();
				if(s!=null) {
					row++;
					String[] t;
					t= s.split(",");
					nameArr[row]=t[0];
					for(int i=0;i<3;i++) {
						scoreArr[row][i]=Integer.parseInt(t[i+1]);
						scoreArr[row][3]+=scoreArr[row][i];
						scoreArr[10][i]+=scoreArr[row][i];
					}
				}
			}
			for (int i=0; i<3;i++) {//각 과목 평균
				scoreArr[11][i]=scoreArr[10][i]/10;
				
			}
			for (int i=0; i<10;i++) {//각인원 평균
				scoreArr[i][4]=scoreArr[i][3]/3;
				rank[i]=scoreArr[i][4];
			}
			Arrays.sort(rank);
			for(int i=0;i<10;i++) {//등수 매기
				for(int j=0;j<10;j++) {
					if(scoreArr[i][4]==rank[j]) {
						scoreArr[i][5]=10-j;
						break;
					}
				}
			}
			for(int i=0; i<12;i++) { //프린트
				if(i<10) {
					System.out.print(nameArr[i]+"\t");
				} else{
					System.out.print("\t");
				}
				
				for(int j=0;j<6;j++) {
					System.out.print(scoreArr[i][j]+"\t");
				}
				System.out.println();
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

		
