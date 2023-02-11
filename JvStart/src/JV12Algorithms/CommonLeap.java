package JV12Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
[처리조건] 
년도를 입력받아 윤년과 평년을 구별하여 출력하라.
첫번째 입력은 입력받을 년도의 갯수

Scanner, Calendar api사용하지 말것

[처리결과]
6
4 100 400 2000 2001 2004
#1 윤년
#2 평년
#3 윤년
#4 윤년
#5 평년
#6 윤년
*/
public class CommonLeap {

	static void startCommonLeaf() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			String[] y = br.readLine().split(" ");//년도입력
			String[] re = new String[cnt]; // new String[y.length];
			
			//윤년과 평년
			for(int i=0; i<cnt; i++) {
				int year = Integer.parseInt(y[i]);
				if(year%4==0 && year%100!=0 || year%400==0 ){//윤년
					re[i]="윤년";
				}else{//평년
					re[i]="평년";
				}
			}
			print(cnt, re);
		}catch(Exception e) {			
		}
	}
	static void print(int cnt, String[] re) {
		for(int i=0; i<cnt; i++) {
			System.out.printf("#%d %s\n", i+1, re[i]);
		}
	}
	public static void main(String[] args) {
		startCommonLeaf();
	}
}
