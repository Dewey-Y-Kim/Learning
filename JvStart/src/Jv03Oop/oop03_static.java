package Jv03Oop;

import Jv02API.String;

public class oop03_static {

	//static
	/*
	 * 맴버 변수, 메소드에 static을 표기
	 * 맴버변수에 static은 데이터형은 데이터형 왼쪽에 기술하고
	 * 맴버변수를 접근할 떄 객체를 생성하지 않고 클래스명.멤버변수로 접근이 가능하다.
	 * 객체를 여러개 만들더라도 static 변수는 1개만 존재한다. 싱글톤.
	 * static { } //맴버 영역에서 실행문을 구현할때 사용할 수 있다. 클래스 내에서 가장 먼저 실행된다. 데이터베이스 db로딩등 기초세팅에 사용
	 * static 속성은 클래스내 유일!
	 */
	int num =10;
	String name="홍길동";
	static String Local="강남구";
	public static void testMethod() {
		// num=100;
		System.out.println("local = "+Local);
	}
	void print() {
		System.out.println("num = "+num);
	}
	public static void main(String[] args) {
		oop03_static st1 = new oop03_static();
		oop03_static st2 = new oop03_static();
		oop03_static st3 = new oop03_static();
		System.out.println(st1.Local);
		System.out.println(st2.Local);
		st2.Local = "강동구";
		System.out.println(st3.Local);
		System.out.println(st1.Local);
		System.out.println(oop03_static.Local);
		System.out.println("pi="+Math.PI);
		st1.print();
		//testMethod()는 static메소드이므로 1개만 존재하고 클래스명.메소드명으로 호출할 수 있다.
		oop03_static.testMethod();
		testMethod();
		
		
	}
	
	static {
		System.out.println("맴버영역에서 실행됨");
	}
	
			
}

