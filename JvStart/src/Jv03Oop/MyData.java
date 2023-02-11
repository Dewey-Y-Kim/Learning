package Jv03Oop;
import Jv02_api.String;

public class MyData {

	public MyData() {}
		// 생성자 메소드protected는 같은 패키지에서는 객체생성을 할 수 있지만, 다른 패키지에서는 반드시 상속받아야 객체 생성 가능. 
	protected String username = "세종대왕";
		
	public String getUserName() {
		return username;
	}
	protected void setUserName(String username) {
		this.username = username;
	}

}
