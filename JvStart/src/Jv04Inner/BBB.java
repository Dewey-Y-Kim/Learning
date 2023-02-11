package Jv04Inner;

// 클래스에 final을 사용하면 상속불가
//public final class BBB extends AAA{
public class BBB extends AAA{
	int b=20;
	private int c=12;
	public BBB() {}
	//오버라이딩
	//하위 클래스에서 getData()메소드를 오버라이딩 할 수 없다.
	//public final int getData() {
	public int getData() {
		System.out.println("c="+c);
		return b;
	}
	private String getWelcome() {
		return "안녕";
	}
}
