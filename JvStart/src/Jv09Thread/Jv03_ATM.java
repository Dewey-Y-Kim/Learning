package Jv09Thread;

public class Jv03_ATM implements Runnable{
	
	private static int money = 20000;
	public Jv03_ATM() {
		/* 
		 * Syncronized 메소드 전체
		 * 동기화 : Syncronized 키워드를 이용. 스레드 실행중 다른 실행이 대기모드로 전환
		 * run() 표기, run()메소드 내에 전체 또는 일부에 표시가능.
		 */
	}
	
	@Override
	public synchronized void run() {
		// 스레드 시작시 100원씩 10번 연속 출
		for(int i=1; money>0 ;i++) {
			getCash(1000);
			if(money%2000==0) { //잔액 2000배수일때 동기화 해제
				try{
					this.wait();
				}catch(InterruptedException ie) {}
			} else { //다시 동기화
				this.notify();
			}
		}
		
	}
	/*
	public void run() {
		// 메소드 내 일부만 동기화 시키기
		synchronized(this) {
			for(int i=1; money>0 ;i++) {
				getCash(100);
				if(money%2000==0) { //잔액 2000배수일때 동기화 해제
					try{
						this.wait();
					}catch(InterruptedException ie) {}
				} else { //다시 동기화
					this.notify();
				}
			}
			
		}
		System.out.println("끝났네/");
	}
	*/

	//출금 처리 메소드
	public void getCash(int cash){
		if(money>=cash) {//잔고가 있을 때
			money -= cash;
			System.out.println(Thread.currentThread().getName()+" : 출금\t 잔액 : "+money+"원");
		}else {//잔고가 없을 때
			System.out.println("잔액이 부족합니다. \n잔액 : "+money+"원");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv03_ATM atm = new Jv03_ATM();
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		
		// son.setPriority(Thread.MAX_PRIORITY);
		mother.start();
		son.start();

		/*
		try {
		mother.join(300);
		son.join(300);
		} catch(InterruptedException ie){}
		son.stop();
		mother.stop();
		*/
		
	}

}
