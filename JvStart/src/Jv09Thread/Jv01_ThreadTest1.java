package Jv09Thread;

public class Jv01_ThreadTest1 extends java.lang.Thread{

	String msg;
	public Jv01_ThreadTest1() {
		// TODO Auto-generated constructor stub
	}
	
	public Jv01_ThreadTest1(String msg) {
		this.msg = msg;
	}
	public void multiThread() {
		for(int i=1;;i++) {
			System.out.println(msg+"-->"+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv01_ThreadTest1 tt1 = new Jv01_ThreadTest1("첫번째");
		Jv01_ThreadTest1 tt2 = new Jv01_ThreadTest1("두번쨰");
		Jv01_ThreadTest1 tt3 = new Jv01_ThreadTest1("두번쨰");
		
		tt1.multiThread();
		tt2.multiThread();
		tt3.multiThread();
		
	}

}
