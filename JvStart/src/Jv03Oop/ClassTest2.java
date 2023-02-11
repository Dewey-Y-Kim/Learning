package Jv03Oop;

import Jv02API.String;

public class ClassTest2 {
	String model;	//모델
	String color;   //색상
	int maxSpeed;   //최고속도
	public ClassTest2(){
		print();
	}
	public ClassTest2(int maxSpeed, String model, String color) {
		this.maxSpeed = maxSpeed;
		this.model = model;
		this.color = color;
		print();
	}
	
	public ClassTest2(String model, String color, int maxSpeed) {
		//ClassTest2; 
		// 생성자 메소드는 같은 클래스에 있더라도 메소드명으로호출할 수 없다.
		// this() : 같은 클래스의 다른 생성자 호출하기
		//this(); 
		// 반드시 첫번째 실행문으로 명시해야 한다.
		//System.out.println();
		this(maxSpeed, model, color);
		//System.out.println();
/*
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		print(); */
	}
	
	public void print() {
		System.out.println("모델 -> "+ model);
		System.out.println("색상 -> "+ color);
		System.out.println("최고속도 -> "+ maxSpeed);
	}
	public static void main(String a[]) {
		ClassTest2 ct1= new ClassTest2();
		ClassTest2 ct2= new ClassTest2("소나타", "white", 200);
		ClassTest2 ct3= new ClassTest2(250, "그랜져", "black");
	}
}
