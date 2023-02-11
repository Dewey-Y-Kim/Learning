package Jv02API;
import java.util.Calendar;

public class Java02_carendarTest {

	public static void main(String[] args) {
		/*
		// 현재 시스템에 날짜 시간 관련 객체 만들기
		// static 메소드는 클래스.메소드명;
		
		// 년도 구하기
		int year = now.get(Calendar.YEAR);
		int year1 = now.get(1);
		
		System.out.print(year+"      "+year1+"\n");
		int month = now.get(Calendar.MONTH);
		System.out.println(month);
		//System.out.println(now);
		*/
		Calendar now=Calendar.getInstance();
		// 원하는 날짜와 시간으로 변경 -> set();
		now.set(2024, 1, 11);
		now.set(Calendar.YEAR,2024); //날짜 시간중 하나만 바꿀 때
		// 오늘은 2023-01-04 수요일입니다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;  //월 : 0~11 
		int day= now.get(Calendar.DAY_OF_MONTH);
		int week= now.get(Calendar.DAY_OF_WEEK);  //요일 1~7
		// now의 날짜 정보에서 월의 마지막 날 구하
		int lastDay= now.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Last day= "+lastDay);
		java.lang.String weekStr="토요일";
		switch(week) {
			case 1: weekStr="일요일";break;
			case 2: weekStr="월요일";break;
			case 3: weekStr="화요일";break;
			case 4: weekStr="수요일";break;
			case 5: weekStr="목요일";break;
			case 6: weekStr="금요일";break;
			case 7: weekStr="토요일";
		}
		System.out.println("오늘은 "+year+"-"+month+"-"+day+" "+weekStr+"입니다.");
		
	}

}
