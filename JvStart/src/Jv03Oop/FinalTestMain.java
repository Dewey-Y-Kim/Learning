package Jv03Oop;

import Jv02API.String;

public class FinalTestMain {

	public FinalTestMain() {
		
	}
	public void start() {
		//
		FinalTest ft = new FinalTest();
		System.out.println(ft.COMPANY);
		System.out.println(FinalTest.PHONE);
		//System.out.println(ft.ADDRESS); // private는객체를 통한 접근불가
		ft.information();
	}
	public static void main(String[] args) {
		new FinalTestMain().start();
	}
}
