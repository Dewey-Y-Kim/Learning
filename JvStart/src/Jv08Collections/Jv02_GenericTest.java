package Jv08Collections;
/*
 * V : value 
 * K : Key
 * E : Element
 */

public class Jv02_GenericTest<V,E> {
	
	private V num;
	private E name;
	
	public Jv02_GenericTest()  {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "num=" + num + ", name=" + name;
	}

	public V getNum() {
		return num;
	}
	public void setNum(V num) {
		this.num = num;
	}
	public E getName() {
		return name;
	}
	public void setName(E name) {
		this.name = name;
	}
	
	
}
