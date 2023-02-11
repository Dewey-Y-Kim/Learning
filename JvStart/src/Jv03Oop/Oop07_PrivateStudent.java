package Jv03Oop;

import Jv02API.String;

public class Oop07_PrivateStudent {
	int num = 999;
	//캡슐화 : 정보보
	private String name = "gongdu";
	Oop07_PrivateStudent() {
		System.out.println(num+"name");
		
	}
	public void output() {
		System.out.println(num+","+name);
	}
	// 캡슐화된 변수의 정보를 외부에서 사용하도록 메소드를 설정해 주어야 한다.
	public String getName() { //getter : getName()
		return name;
	}
	
	public void setName(String name) { //setter :
		this.name=name;
	}
}
