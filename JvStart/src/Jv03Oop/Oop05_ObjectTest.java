package Jv03Oop;

import Jv02API.String;

public class Oop05_ObjectTest {

	public static void main(String[] args) {
		Oop04_static go = new Oop04_static();
		
		// go.oneDan(go.inputDan());
		int num= go.inputDan();
		// static 메소드 내에서 일반 메소드 호출불가.
		if(num==1)return;
		go.allDan();
		
		
		
	}
	public void ts() {
		int a=100;
	}

}
