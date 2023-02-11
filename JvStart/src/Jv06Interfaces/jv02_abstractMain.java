package Jv06Interfaces;

// 추상 클래스 사용하기.
// 1. 추상클래스는 반드시 extends 상속받아한다.
// 2. 상속받은 추상클래스의 모든 추상메소드를 오버라이딩(overriding을 해야 한다.
// 3. 추상클래스는 미완성 클래스 -> 객체생성(new) 불가
public class jv02_abstractMain extends jv02_abstractTest {

	public jv02_abstractMain() {
		// TODO Auto-generated constructor stub
	}
	public void minus(int a, int b) {
		int minus = Math.abs(a-b);
		System.out.println(a + "-" + b + " = "+ minus);
		
	}
	/*
	public void divide(int a, int b) {
	/*	float div = (float)(a) / (float)(b);
		System.out.println(a+" / "+b+" = "+ div); 
	}
	
*/
	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jv02_abstractMain at = new jv02_abstractMain();
		at.add(5, 6);
		at.minus(6, 120);
		at.divide(2, 4);
		
		// new jb01_abstractTest();
	}
	

}
