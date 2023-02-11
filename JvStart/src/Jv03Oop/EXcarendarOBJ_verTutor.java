package Jv03Oop;
import java.util.Calendar;
import java.util.Scanner;

import Jv02API.String;

public class EXcarendarOBJ_verTutor {
	public EXcarendarOBJ_verTutor() {}
	public void start() {
		//년
		int year = inputData("년도");
		//월
		int month = inputData("월");
		//요일
		int week = getWeek(year, month);
		//마지막날
		int lastDay= getLastDay(year,month);
		//제목
		titlePrint(year,month);
		//공백 출력
		spacePrint(week);
		//날짜
		dayPrint(lastDay,week);
	}
	public void monthPrint() {
		int year =inputData("년도");
		int month = inputData("월");
		int week = getWeek(year,month);
		int lastDay = getLastDay(year,month);
		spacePrint(week);
		dayPrint(lastDay,week);
	}
	//  맴버변수 없음
	//입력 (년도, 월)
	public int inputData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=>");
		return scan.nextInt();
	}
	// 요일 구하기
	public int getWeek(int year, int month) {
		Calendar now= Calendar.getInstance();
		now.set(year, month-1,1);
		return now.get(Calendar.DAY_OF_MONTH);
		
	}
	//마지막 날 구하기
	public int getLastDay(int year, int month) {
		int lastDay = 31;
		switch (month) {
		case 4:case 6: case 9 :
		case 11 : lastDay=30;break;
		case 2 : if(year%4 ==0 && year%100!=0 || year%400 == 0 ) {
				lastDay= 29;
			} else {
				lastDay =28;
			}
		
		}
		return lastDay;
	}
	public void titlePrint(int year, int month) {
		System.out.println("\t\t****"+year+"년 "+month+"월******");
		weekTitle();
	}
	public void weekTitle() {
		System.out.println("월\t화\t수\t목\t금\t토");
	}
	
	//공백 출력
	public void spacePrint(int week) {
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
	}
	//날짜 출력
	public void dayPrint(int lastDay, int week) {
		for (int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if((week +i -1 )%7==0) {System.out.println();}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
