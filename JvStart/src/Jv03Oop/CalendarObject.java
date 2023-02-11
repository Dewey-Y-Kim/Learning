package Jv03Oop;
import java.util.Calendar;
import java.util.Scanner;

import Jv02API.String;

public class CalendarObject {
	//멤버변수없음
	public CalendarObject() {}
	public void start() {
		//년
		int year = inputData("년도");
		//월
		int month = inputData("월");
		//요일
		int week = getWeek(year, month);
		//마지막날
		int lastDay = getLastDay(year, month);
		//제목
		titlePrint(year, month);
		//공백출력
		spacePrint(week);
		//날짜
		dayPrint(lastDay, week);
	}
	public void start2(int y, int m) {
		int w = getWeek(y, m);
		int lastDay = getLastDay(y, m);
		spacePrint(w);
		dayPrint(lastDay, w);
	}
	//입력 (년도,월)
	public int inputData(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"=>");
		return scan.nextInt();
	}
	//요일구하기(1일)
	public int getWeek(int year, int month) {
		Calendar now = Calendar.getInstance();
		now.set(year, month-1, 1);
		return now.get(Calendar.DAY_OF_WEEK);
	}
	//마지막날 구하기
	public int getLastDay(int year, int month) {
		int lastDay = 31;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 30;break;
		case 2:
			// 년도가 4의배수이고 100으로 나눠지지 않아야 한다.
			// 400의 배수의 해는 윤년
			if( year%4==0 && year%100!=0  || year%400==0 ) {//윤년
				lastDay = 29;
			}else {//평년
				lastDay = 28;
			}			
		}
		return lastDay;
	}
	//title출력
	public void titlePrint(int year, int month) {
		System.out.println("\t\t****"+year+"년 "+month+"월****");	
		weekTitle();
	}
	public void weekTitle() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}
	
	//공백출력
	public void spacePrint(int week) {
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
	}
	//날짜 출력
	public void dayPrint(int lastDay, int week) {
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if( (week-1+i)%7==0 ) {
				System.out.println();
			}
		}
	}
}
