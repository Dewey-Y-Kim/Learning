package Jv03Oop;
import Jv02_api.String;

public class Oop21_Car {

	String model;
	int speed;
	String color;
	int maxSpeed=200;
	
	public Oop21_Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car()의 생성자");
	}
	
	public Oop21_Car(String model, String color) {
		this();
		this.model = model;
		this.color = color;
		System.out.println("MaxSpeed : "+maxSpeed);
		System.out.println(this.model+"  "+this.color);
	}
	//break
	public int speedUp(){
		speed++;
		if(speed>maxSpeed) {
			speed = maxSpeed;
		}
		
		return speed;
	}
	// accelate
	public  void speedDown(){
		speed--;
		if (speed<0) {
			speed=0;
		}
	}


}
