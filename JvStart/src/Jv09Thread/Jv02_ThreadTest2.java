package Jv09Thread;

public class Jv02_ThreadTest2 implements Runnable{
	
	String msg;
	int i=0;
	
	public Jv02_ThreadTest2() {
		/* 스레드 처리 클래스 생성
		 * 1. interface Runnable() 상속 및 추상메소드 오버라이딩
		 * 2. 스레드 구현 코드 기술.
		 * 3. 스레드 스케쥴러 등록
		 */
	}
	
	public Jv02_ThreadTest2(String msg) {
		this.msg = msg;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(msg+"==>"+ ++i + Thread.currentThread().getName());
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		/*
		 *  인터페이스 Runnabe을 상속받아 run()를 오버라이딩 한 경우
		 *  해당 클래스를 객체생성후 Thread 클래스를 객체 생성하여야 한다.
		 */
		
		Jv02_ThreadTest2 tt1= new Jv02_ThreadTest2("first");
		Thread t1 = new Thread(tt1, "첫번째"); //:첫번째 - thread 이름
		/*
		Thread t2 = new Thread(tt1, "두번째"); //:첫번째 - thread 이름
		Thread t3 = new Thread(tt1, "첫번째"); //:첫번째 - thread 이름
		*/
	
		Jv02_ThreadTest2 tt2 = new Jv02_ThreadTest2("second");
		Thread t2 = new Thread(tt2, "두번째");
		
		Jv02_ThreadTest2 tt3 = new Jv02_ThreadTest2("third");
		Thread t3 = new Thread(tt3, "두번째");
		// Thread만 따로 객체를 만들면 어케 됨?
		
		 
		t1.start();
		t2.start();
		t3.start();
	}
}
