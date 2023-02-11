package Jv02API;

public class Java05_WrapperTEst {

	public static void main(String[] args) {
		// Wapper : 기본데이터형을 객체로 생성해주는 클래스들을 말한다.
		
		int num=1234;
		//1.4이전
		Integer intObj = new Integer(num);
		//1.5 이후 AutoBoxing 기본데이터형을 객체로자동변환하여 대입해준
		Integer intOB = num;
		//
		int num2= intObj; //Auto-unboxing 객체형을 기본데이터형으로 변환하여 대입.
		System.out.println(intObj.MAX_VALUE);
		System.out.println(intObj.floatValue());
		System.out.println(intObj.hashCode());
		char ch='짜';
		System.out.println(intObj);
		
		int age = Integer.parseInt("26");
		System.out.println(age+2);
		double height = Double.parseDouble("2512411.124124");
		System.out.println(height-1);
		
		System.out.println(Integer.max(21421512, 1299292));
		int A =(int)Math.pow(5,3);
		System.out.println(A);
		
	}

}
