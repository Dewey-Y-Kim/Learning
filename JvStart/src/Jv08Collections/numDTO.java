package Jv08Collections;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class numDTO {

	public numDTO() {
		// TODO Auto-generated constructor stub
	
	}
	private int num; //번호
	private Calendar dateTime; //날짜,시간
	private int waitingCount; // 대기인수
	
	/*
	 * 현재시간 : 2023-01-12 03:15:16 (목)
	 * 대기인수 : 4
	 */
	@Override
	public String toString() {
		String message ="";
		message += "번호 : "+ num + "\n";
		// SimpleDateFormat : 날짜를 원하는 패턴으로 만들수 있다.
		SimpleDateFormat sDF = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss (E)");
		
		//날짜를 패턴에 입력
		String dateTimeSTR = sDF.format(dateTime.getTime());
		
		message += "현재시간 : "+dateTimeSTR+"\n";
		
		// 대기열에 남아있는 객체 수
		//LinkedListTEst.wationList.size()
		message += "대기인수 : "+waitingCount; 
		
		return message;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Calendar getDateTime() {
		return dateTime;
	}
	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}
	public int getWaitingCount() {
		return waitingCount;
	}
	public void setWaitingCount(int waitingCount) {
		this.waitingCount = waitingCount;
	}

	
}
