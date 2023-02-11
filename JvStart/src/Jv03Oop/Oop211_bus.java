package Jv03Oop;
import Jv02_api.String;

public class Oop211_bus extends Oop21_Car {
	//Oop21_Car클래스를 상속받는다. 상속은 1개만 받을 수 있다.
	//car , Object
	// 상속관계에서 생성자 메소드는 상위클래스의 생성자를 먼저 실행하고 하위클래스의 생성자를 실행한다.
	int maxSpeed=150;
	public Oop211_bus() {
		// 하위 클래스의 생성자 메소드에서 상위클래스의 원하는 생성자메소드를 호출하기
		// 첫번째 실행문이어야 한다.
		// this() : 현재클래스
		// super() : 상위클래스의 생성
		// Oop21_Car // : error
		super("f22-Raptor", "Dark gray"); //첫번째 실행문이어야 한다.
		System.out.println("bus()의 생성자");
		System.out.println("maxSpeed :"+maxSpeed);
	}
	public void output() {
		System.out.println("model : "+model);
		System.out.println("Color : "+color);
		System.out.println("maxSpeed :"+maxSpeed);
		// 상위클래스의 maxSpeed
		System.out.println(super.maxSpeed); //첫번째 실행문이 아니어도 된다.
		
	}
	// 상위클래스의 메소드를 재정의 : 오버라이딩
	// 메소드명, 매개변수 및 데이터형 은 같아야..
	// 접근 제어자는 상위 클래스의 접근 제어자보다 넓은 의미의 제어자여야 한다.
	// public > protected > default > private
	public int speedUp() {
		super.speedUp();
		speed+=10;
		if(speed>maxSpeed) {
			speed=maxSpeed;
		}
		short i=1;
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oop211_bus bus = new Oop211_bus();
		System.out.println(bus.maxSpeed);
		
	
		bus.output();
		bus.speedUp();
		System.out.println("Bus speed : "+bus.speed);
	}

}
