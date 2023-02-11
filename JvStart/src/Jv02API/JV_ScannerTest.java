package Jv02API;
//사용할 클래스가 있는 위치와 클래스
import java.util.Scanner;
import java.lang.*; //안써도 됨. 컴파일시 자동으로 들어감.

public class JV_ScannerTest {

	public static void main(String[] args) {
		//Scannner :   실행중 콘솔에서 정수, 실수, 논리, 문자열데이터를 입력받는 기능을 가진다.
		
		//1. 객체 : 클래스를 사용하기 위해서는 ㄴ객체를 생성 - 클래스의 생성자 메소드로 new 키워드를 이용하여 만든다.
		
		Scanner sc1 = new Scanner(System.in), sc2 = new Scanner(System.in);
		//instance sc1 : instance 변수 reference 변수
		
		
		//정수 입력 받기
		//1. 정수
		// 객체명.메소드명
		System.out.print("숫자입력 = ");
		int num = sc1.nextInt(); // 정수 :nextByte(), nextShort(), nextInt(), nextLong()
								 //	실수 : nextFloat(), nextDouble();
								 //	논리 :  nextBoolean()
								 // 문자형 : nextLine();
		System.out.println("입력 받은 값="+ (num+10));
		Double num2= sc2.nextDouble();
		System.out.println("num2-> "+(num2+10.2));
	

	}

}
