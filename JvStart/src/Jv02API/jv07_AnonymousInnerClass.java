package Jv02API;
import Jv02_api.String;

public class jv07_AnonymousInnerClass {
	String myName="user";
	public jv07_AnonymousInnerClass() {
		// TODO Auto-generated constructor stub
		System.out.println("*jv07_AnoymousInnerClass()");
	}
	public void start() { //익명의 내부클래스 시작
		//3. 익명(anonymous)의 내부클래스
		// 클래스명이 존재하지 않는 클래스
		// 한번만 사용하거나 자주 사용하지 않을 때 익명의 내부클래스를 만든다.
		
		jv07_Sample sample = new jv07_Sample() {
			//내부클래스 sample()의 기능 포함+ 메소드생성가능+변수생성/변경 가능 + sample overriding가
			int tot = 120;
			void totOutput() {
				System.out.println("* totOutput");
				System.out.println("tot = "+tot);
				System.out.println("myName :"+ myName);
			}
			//Sample의 메소드 오버라이딩
			public void getSum() {
				int evenSum=0;
				for (int i=0; i<=100; i+=2) {
					evenSum+=i;
				}
				System.out.println("* getSum() 2");
				System.out.println("evenSum = "+ evenSum);
				
			}
		};
		sample.getSum();		
			//.getSum();//overriding 된 결과값 => 클래스로 인식//.getOddSum();//sample의 메소//.totOutput();// 익명의 내부클래스 끝
			
			 //익명이 내부 클래스에서 새로 생성된 메소드는 상위의 Sample클래스에 대입하면 사용할 수 없다.
			//오버라이딩은 상위클래스 형변환 하더라도 오버라이딩 된 기능은 유지한다.
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jv07_AnonymousInnerClass aic = new jv07_AnonymousInnerClass();
		aic.start();
	}

}
