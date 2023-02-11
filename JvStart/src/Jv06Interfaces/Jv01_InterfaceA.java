package Jv06Interfaces;

/* 인터페이스에는 
 * static final 상수, 추상 메소드 등을 기술한다. 
 */
public interface Jv01_InterfaceA extends Jv01_InterfaceB{
	// static Final
	public static final int MAX=100;
	public static final String FIRST_NAME = "Lee";
	
	// 추상메소드
	public int add(int a, int b);
	public void divide(int a, int b);
	public void multiple(int a,int b);
	public void minus2(int a, int b);
	
	/*
	 public int run(int x){
	 	System.out.println x;
	 	return x;
	 }
	 */
}
