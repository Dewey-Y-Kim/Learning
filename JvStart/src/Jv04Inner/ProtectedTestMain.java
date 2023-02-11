package Jv04Inner;


public class ProtectedTestMain extends MyData {

	public ProtectedTestMain() {
		
	}
	public void start() {
		//다른팩키지의 protected접근제한자 생성자이므로 
		//객체를 생성할 수 없다.
		//MyData md = new MyData();
		
		username = "안중근";
		System.out.println(getUsername());
		setUsername("윤봉길");
		System.out.println(username);
	}
	public static void main(String[] args) {
		new ProtectedTestMain().start();
	}
}
