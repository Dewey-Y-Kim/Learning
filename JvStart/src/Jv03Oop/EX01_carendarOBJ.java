package Jv03Oop;
import java.util.Calendar;
import java.util.Scanner;

import Jv02API.String;

public class EX01_carendarOBJ {
	public static void main(String args) {
		
		EX01_carendarOBJ st=new EX01_carendarOBJ();
		int[] set=st.Input();
		int[] dateDate=st.Date(set);
		st.Print(set,dateDate);
		
	}
	
	
	public int[] Input(){
		Scanner scan = new Scanner(System.in);
		System.out.print("년도=");
		int year = scan.nextInt();
		System.out.print("월 = ");
		int month = scan.nextInt() - 1;
		int[] set = {year, month, 1};
		return set;
	}
	public int[] Date(int[] set) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(set[0],set[1], set[2]);
		int dateData[]= new int[2];
		dateData[0] =calendar.get(Calendar.DAY_OF_WEEK);
		dateData[1] =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return dateData;
	}
	
	public void Print(int[] set, int[] dateData) {
		System.out.println("\t\t\t"+set[0]+"년 "+(set[1]+1)+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i=1;i<=dateData[1]+dateData[0]-1;i++) {
			if(i<dateData[0]) {System.out.print("\t");}
			else {
				if(i%7==0) {
					System.out.println(i-dateData[0]+1);
				} else {
					System.out.print(i-dateData[0]+1+"\t");
				}
			}
		}
	}
}
