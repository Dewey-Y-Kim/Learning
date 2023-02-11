package Jv03Oop;
import Jv02_api.String;

public class inherit3  {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		cc c = new cc();
				
		System.out.println(c.getData());
		
		// 하위클래스를 객체로 만들어 상위클래스에 대입하더라도
		// 하위클래스를 오버라이딩 한 기능은 그대로 적용된다.
		// 단, 메소드에 final 속성부여하면 overriding 사용 불가.
		// bb b = new bb();
		// System.out.println(b.getData());
		
		Object obj = new cc();
		// System.out.println(obj.getData()); // error
		
		//상속관계에서 하위클래스 객체를 상위클래스 객체에 대입후
		// 다시 하위클래스로 대입할 수 있다.
		cc c2 = (cc)obj;
		System.out.println(c2.getData());
		String a="123";
		// 클래스에 final 속성부여하면 상속 불가
		
	}

}
