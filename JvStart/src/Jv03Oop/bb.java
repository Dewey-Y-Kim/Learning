package Jv03Oop;
import Jv02_api.String;

//public final class bb extends aa{
public class bb extends aa{
	int b=20;
	private int c=12;
	private bb() {}
	// bb생성자메소드가 private 접근제한자이므로 객체를 생성할 수 없다.
	public  int getData() {
		// bb b1= new bb;
		System.out.println(c);
		return b;
	}
private String getWelcome() {
	return "hello?";
}

}
