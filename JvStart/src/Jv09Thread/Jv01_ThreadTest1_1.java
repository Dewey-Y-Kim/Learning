package Jv09Thread;

public class Jv01_ThreadTest1_1 extends Thread{
/*
 * 1. Thread 클래스 상속
 * 2. 스레드 처리할 실행문을 run()메소드에  오버라이딩 하여 구현
 * 3. start() 를 이용하여 자바가상 머신에 스레드 스케쥴러에 등록한다.
 */
	String msg;
	public Jv01_ThreadTest1_1() {
		// TODO Auto-generated constructor stub
	}
	
	public Jv01_ThreadTest1_1(String msg) {
		this.msg = msg;
	}
	public void multiThread() {
		for(int i=1;;i++) {
			System.out.println(msg+"-->"+i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException ie) {}
		}
	}
	
	
	
	
	
	public void run() {
		multiThread();
	}
	
	public static void main(String[] args) {
		// Thread 구현되는 방법  
		Jv01_ThreadTest1_1 tt1 = new Jv01_ThreadTest1_1("첫번째");
		Jv01_ThreadTest1_1 tt2 = new Jv01_ThreadTest1_1("두번쨰");
		Jv01_ThreadTest1_1 tt3 = new Jv01_ThreadTest1_1("세번째");
		
		tt1.start();
		tt2.start();
		tt3.start();
		
	}

}
