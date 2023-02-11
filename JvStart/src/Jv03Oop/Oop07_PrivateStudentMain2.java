package Jv03Oop;

import Jv02API.String;

public class Oop07_PrivateStudentMain2 {

	public Oop07_PrivateStudentMain2() {
		
	}
	public static void main(String[] args) {
		// private 접근제한자는 클래스 외부에서 접근을 허용하지 않는다
		// 객체명.필드명,       객체명 new  메소드()를 허용하지 않는다.
		Oop07_PrivateStudent ps = new Oop07_PrivateStudent();
		// String n = ps.name;
		// System.out.println("name : "+n);
		ps.output();
		String name=ps.getName();
		System.out.println("name : "+name);
		
		//name이 private 접근제한자이기 때문에 객체명.필드를 사용할 수 없다.
		//ps.name = "이순신";
		
		ps.setName("sunshin");
		System.out.println("name : "+ps.getName());
	}

}
