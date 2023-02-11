package Jv02API;
import Jv02_api.String;

public class jv06MethodInnerClass {
	String email = "asdf@asdfg.sas";
	
	public jv06MethodInnerClass() {
		System.out.println("* MethodInnerClass() 생성자메소드");
	}
	
	public void emailOutput() {
		System.out.println("* emailOutput()");
		System.out.println("E-mail : "+email+"\n===============");
	}
	
	public void createInner() {
		int num=100;
		System.out.println("* createInner");
		// 메소드에 생성하는 내부클래스
		// 외부클래스의 정보와 메소드 내에서 정의한 정보를 사용 가능하다. 
		class InnerClass{
			String name = "킹세종";
			InnerClass(){
				System.out.println("* InnerClass()");
				System.out.println("num : "+num);
				System.out.println("name : "+name);
				// System.out.println("Tel :"+tel); 클래스 정의 이전에 선언한 정보만 사용 가능.
				System.out.println("address : "+addr);
			}
			void getInformation() {
				System.out.println("* getInformation()"); //외부클래스의 메소드 호출
				emailOutput();
				System.out.println("email :"+email);
			}
		}
		String tel = "010-1231-1231";
		//메소드에서 정의한 내부클래스 객체 만들기
		InnerClass ic = new InnerClass();
		ic.getInformation();
	}
	//외부의 맴버영역(클래스 영
	String addr = "서울시 성동구";
	
	
	
	
	public static void main(String[] args) {
		jv06MethodInnerClass mic = new jv06MethodInnerClass();
		mic.createInner();

	}

}
