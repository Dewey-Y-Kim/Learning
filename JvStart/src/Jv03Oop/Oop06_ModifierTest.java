package Jv03Oop;

import Jv02API.String;

public class Oop06_ModifierTest {

	public Oop06_ModifierTest() {
		//접근제한자는 public > protected > default(생략) > private
		//public 공용
		// default 같은 패키지 내에세만 허용
		// 객체 생성
		//생성자 메소드가 public
		
		Student student=new Student();
		System.out.println("학생 이름은 : "+student.name);
		student.studentPrint();
	}

	public static void main(String[] args) {
		new Oop06_ModifierTest();

	}

}
