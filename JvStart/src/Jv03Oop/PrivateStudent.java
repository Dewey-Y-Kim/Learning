package Jv03Oop;

import Jv02API.String;

public class PrivateStudent {
	int num = 999;
	//캡슐화 : 정보 보호
	private String name = "gildong";
	
	PrivateStudent() {
		
	}
	public void output() {
		System.out.println(num+","+name);
	}
	
	//캡슐화된 변수의 정보를 외부에서 사용하도록 메소드를 생성해줘야 한다.
	// getter : getName()
	public String getName() {		
		return name;
	}
	// setter 
	public void setName(String name) {
		this.name = name;
	}
}
