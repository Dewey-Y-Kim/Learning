package Jv03Oop;


public class cc extends bb{
	int c=30;
	// public cc() {}
	public int getData() {
	// 상위 클래스의 c맴버변수는 접근제한자가 private이므로 상속되지 않는다.
	// System.out.println("BB.c : "+super.c);
		
	// 상위 클래스의 get welcome()메소드는 접근제한자가 private이므로 상속되지 않는다.
	// System.out.println(getWelcome());
	return b+20;
	}

}
