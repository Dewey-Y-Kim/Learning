package Jv03Oop;

import Jv02API.String;

public class Oop08_FinalTestMain {
	public Oop08_FinalTestMain(){}
	
	public void start() {
		Oop08_FinalTest ft = new Oop08_FinalTest();
		System.out.println(ft.COMPANY);
		System.out.println(Oop08_FinalTest.PHONE);
		// System.out.println(ft.ADDRESS); // private는 객체를 동한 접근 불가.
		ft.information();
		
	}
	public static void main(String[] args) {
		
		new Oop08_FinalTestMain().start();
	}
}
