package Jv04Inner;

public class CCC extends BBB{
	int c=30;
	public CCC() {}
	public int getData() {	
		// 상위클래스의 c멤버변수는 접근제한자 private이므로
		// 상속되지 않는다.
		//System.out.println("BBB.c="+ super.c);
		
		// 상위클래스의 getWelcome()메소드는 접근제한자 private이므로
		// 상속되지 않는다.
		//System.out.println(getWelcome());
		
		return b+20;
	}
	
}
