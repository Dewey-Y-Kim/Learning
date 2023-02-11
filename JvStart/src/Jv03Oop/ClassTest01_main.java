package Jv03Oop;

import Jv02API.String;

public class ClassTest01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTest01 ct1 = new ClassTest01();
		ClassTest01 ct2 = new ClassTest01("김도형");
		ClassTest01 ct3 = new ClassTest01(9999, "안중근");
		ct1.method1();
		String result = ct1.method2(12412, 12314);
		System.out.println(" result="+ result);
		System.out.println(ct1.getMyName());
		//객체 내의 맴버변수의 값 변경하기//객체명.맴버변수 = 값
		ct3.myName="잠탱";
		System.out.println(ct1.getMyName());
		System.out.println(ct3.getMyName());
		test02();
		
	}
	int s=0;
	public static void test02() {
		System.out.print("Test02");
	}
	
}
