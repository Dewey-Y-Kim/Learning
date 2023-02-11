package Jv08Collections;
import java.util.Calendar;
import java.util.LinkedList;

public class Jv03_LinkedListTest {

	public Jv03_LinkedListTest() {
		// TODO Auto-generated constructor stub
	}
	public static int count =1 ;
	
	//번호표를 뽑으면 numDTO 객체를 만들어 que에 추가
	public static LinkedList waitlist = new LinkedList();
	
	// guest in
	public void inGuest() {
		// numDTO 객체를 만들어
		// 1. num의 dto추가 num은 1증가
			numDTO person = new numDTO();
			
		 // 2. 현재 날짜/시간 DTO세팅
			person.setNum(count++);
		 // 3. 대기인수 : watingList의 크기를 구해 waitingCount세팅;
			person.setWaitingCount(waitlist.size());
			person.setDateTime(Calendar.getInstance());
		 // 4. 출력
		 System.out.println(person.toString());
		 	waitlist.offer(person);
		 System.out.println("---------------------------");
		 
		 
		 
		 
	}
	
	//guest out
	public void outGuest() {
		waitlist.poll();
		try {Thread.sleep(100);}catch(Exception e) {}
		System.out.println("남은 대기인수 -->"+(waitlist.size()-1 ));
		
	}
	
	
}
