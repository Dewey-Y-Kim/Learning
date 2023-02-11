package Jv03Oop;

import Jv02API.String;

public class Oop08_FinalTest {
	// final 변수는 값이 설정되면 변경 불가.
	// final 변수는 대문자로 사용
	// 단어구별은 _를 이용
	
	final String COMPANY = "멀캠";
	private final String ADDRESS;
	static final String PHONE ="010-1234-1234";
	public Oop08_FinalTest(){	
		ADDRESS="서울시 강남구";
		//ADDRESS="강북구"; //final 변수는 값을 변경할 수 없다.
		
	}
	//메소드의 final은 오버라이딩이 안됨.
	public void information() {
		System.out.println("회사명 : "+COMPANY);
		System.out.println("주  소 :"+ADDRESS);
		
	}
	
}
