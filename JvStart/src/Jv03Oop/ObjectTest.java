package Jv03Oop;

import Jv02API.String;

public class ObjectTest {

	public static void main(String[] args) {
		GuGuDanObject go = new GuGuDanObject();
		
		//int d = go.inputDan();
		//go.oneDan(d);
		
		//int d = GuGuDanObject.inputDan();
		//GuGuDanObject.oneDan(d);

		GuGuDanObject.allDan();
		// static 메소드 내에서 일반 메소드 호출불가
		//go.allDan();
		//go.oneDan(8);
	}
}
