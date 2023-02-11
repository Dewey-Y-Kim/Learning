package Jv03Oop;
import java.util.Calendar;
import java.util.Scanner;

import Jv02API.String;

public class ClassTest01 {
	//맴버 변수(필드) - 현재 클래스 내에서 사용 가능한 전역변수
	//맴버 변수는 초기값이 자동으로 설정된다.
	//	정수(byte, short, int, long)은 0, 실수형(float, double)은 0.0, 논리형(boolean) 초기값은 false
	//  배열, 클래스형 (객체형) 은 null;
	
	int dataNum= 1234;
	String myName="졸려용";
	Scanner scan = new Scanner(System.in);
	String name="세종";
	
	int num; // 0
	String userid; //null
	Calendar now; // null
	int[] arr; //null
	
	
	//메소드 : 기능구현, 변수선언, 계산, 기본명령어(if, switch, for, while..... 사용 가
	//1. 생성자메소드 : 
	//  - 메소드 명이 클래스명과 같아야한
	//  - 반환형이 없다.
	//  - 생성자 메소드는 여러개 만들 수 있다. 단 매개변수의 개수나 데이터형은 달라야 한다.
	//  - 생성자 메소드를 만들지 않을 경우 컴파일러가 매개변수 없는 생성자를 자동으로 클래스에 넣어준다.
	//    Classtest01(){}
	//  - 객체 생성시 한번 실행. 객체의 초기값을 설정할 때 사용한다.
	public ClassTest01() {
		System.out.println("CassTest01() 생성자 메소드 실행됨.");
	}
	public ClassTest01(int num) {
		System.out.println("CassTest01(int num 생성자 메소드 실행됨.     "+num );
	}
	public ClassTest01(String name) {
		System.out.println("ClassTest01(String name)생성자 메소드 실행됨...."+name);
	}
	public ClassTest01(int num,String name) {
		//맴버에 있는 변수에 지역변수의 값을 설정하기
		//this는 메소드의 지역변수와 맴버변수가 같은 이름일때, 맴버변수를 지정하는 키워드(현재 클래스)
		this.num = num;
		System.out.println("ClassTest01(int num, String name) 생성자 메소드가 실행됨...."
				+ ""+num+",  "+name+",   "+this.num+",  "+myName);
	}
	
	//2. 메소드
	//	-필요한 만큼 생성가능
	//	- public 반환형 메소드(arg1 , arg2 ....){}
	//  - 메소드를 실행한 결과가 메소드 밖으로 내보내는것..
	//  - void 반환값이 없다.
	
	// 메소드명 생성 규칙
	//	- 소문자로 시작, 두번째단어는 문자를 대문자, ()가 있어야 한다.
		 
	public void method1() {
		int a=100;
		int b= 200;
		int c= a+b;
		System.out.println("c="+ c);
	}
	//     반환형   		매개변수 : 반환은 한개밖에 안됨.
	public String method2(int a, int b) {
		int c= a+b;
		return "c="+c;
	}
	public String getMyName() {
		//같은 클래스의 다른 메소드 호출
		method1();
		method2(10, 20);
		return myName;
	}
	
}
