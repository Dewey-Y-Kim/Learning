package Jv03Oop;

import java.lang.System;

import Jv02API.String;

public class Student {
	int num = 1;
	public String name = "홍길동";
	int ban = 5;
	public Student() {
		
	}
	public void studentPrint() {
		System.out.println("번호==>"+num);
		System.out.println("이름==>"+name);
		System.out.println("반==>"+ban);
	}
}
