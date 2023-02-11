package Jv03Oop;

import Jv02API.String;

public class StaticTest {

	// static
	// 멤버변수, 메소드에 static을 표기한다.
	// 멤버변수에 static은 데이터형 왼쪽에 기술하고 
	// 멤버변수를 접근할 때 객체를 생성하지 않고 클래스명.멤버변수로 접근이 가능하다.
	// 객체를 여러개 만들더라도 static변수는 1개만 존재한다. 싱글톤
	
	int num = 10;
	String name = "홍길동";
	static String local = "강남구";
	
	public StaticTest() {}
	
	//메소드에 static 만들기
	// 객체를 만들지 않고 호출하여 사용할 수 있다.
	public static  void testMethod() {
		int a = 500;
		//                        같은 클래스 static 변수이므로 클래스명을 생략가능하다.
		System.out.println("local="+ local);
	}
	public void print() {
		System.out.println("num="+ num);
	}
	
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		//값변경
		st2.local = "영등포구";
		System.out.println("st1->"+ st1.local);
		System.out.println("st3->"+ st3.local);
		System.out.println(StaticTest.local);
		System.out.println("pi->"+ Math.PI);
		
		st1.print();
		// testMethod()는 static 메소드이므로 1개만 존재하고 클래스명.메소드명으로 호출할 수 있다.
		StaticTest.testMethod();
	}
}

class Test01{
	
}

class Test02{
	
}