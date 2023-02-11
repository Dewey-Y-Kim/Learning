package Jv02API;

// 사용할 클래스가 있는 위치와 클래스명
import java.lang.String;// 기본 팩키지 -> 컴파일할때 자동으로 표기된다.
import java.util.Scanner;//   자동으로 안들어감

public class ScannerTest {

	public static void main(String[] args) {
		// Scanner : 실행중 콘솔에서 정수, 실수, 논리, 문자열데이터를 입력받는 기능을 가진다.
		
		//1. 객체 : 클래스를 사용하기 위해서는 객체를 생성 -> 클래스의 생성자 매소드로 new 키워드를 이용하여 만든다.
		//   int a= 10;
		String name;
		
		// instance변수, reference변수		
		Scanner scan = new Scanner(System.in);
		
		//프로그램실행중 값을 입력받기
		//1. 정수
		// 객체명.메소드명
		System.out.print("숫자입력=");
		int num = scan.nextInt(); //정수: nextByte(), nextShort(), nextInt(), nextLong()
		                          //실수 : nextFloat(), nextDouble()
								  //논리 : nextBoolan()
								  //문자열 : nextLine();
		System.out.println("입력받은 값="+ (num+10));
		double num2 = scan.nextDouble();
		System.out.println("num2->"+ (num2+10.2));	
		
		
	}
}
