package Jv03Oop;

import Jv02API.String;

public class inherit02 {

	public inherit02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  new Y(5);
	}

}
class Y extends X{
	Y(){
		super(6);System.out.print("3");
	}
	Y(int y){
		this();System.out.print("4");
	}
}

class X{
	X(){
		System.out.print("1");
	}
	X(int x){
		this(); System.out.print("2");
	}
}
