package Jv04Inner;

public class MyData {
	protected String username = "세종대왕";
	
	// 생성자 메소드 protected는 있으면
	// 같은 팩키지에서는 객체를 생성할수 있고
	// 다른 팩키지에서는 반드시 상속받아 사용가능하다.
	protected MyData(){}
	
	protected String getUsername() {
		return username;
	}
	
	protected void setUsername(String username) {
		this.username = username;
	}
}
