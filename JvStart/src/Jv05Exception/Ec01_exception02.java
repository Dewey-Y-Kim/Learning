package Jv05Exception;
import java.util.Scanner;

public class Ec01_exception02 {
	Scanner sc = new Scanner(System.in);
	
	public Ec01_exception02() {
		// TODO Auto-generated constructor stub
	}
	
	public void start(){
		try {
			System.out.println("* start()");
			System.out.print("첫번째 수 : "); //<-- InputmisMatch
			int num1= sc.nextInt();
			System.out.print("두번째 수 : "); // <--예외 가능
			int num2 = sc.nextInt();
			
			int plus= num1+num2;
			int minus= num1-num2;
			int multi= num1*num2;
			int divi = num1/num2;  // <-- Arithmetic
			
			// 5 + 10 = 15
			// printf(String format, object... args)
			System.out.printf("합: %d + %d = %d", num1, num2, plus);
			System.out.printf("\n차: %d - %d = %d", num1, num2, minus);
			System.out.printf("\n곱: %d * %d = %d", num1, num2, multi);
			System.out.printf("\n근: %d / %d = %d\n", num1, num2, divi);
			int data[]= {10,20,30};
			System.out.println(data[data.length]); // <--- ArrayIndexOutOfBounds
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열의 index가 잘못 처리 되었습니다.");
		}catch(Exception e) { // 모든 예외클래스는 Exception을 상속받는다.
				   // 하위클래스는 상위클래에 대입가능하다.
			System.out.println("입력값은 정수를 입력하고, 두번째 값은 0을 제외하여야 합니다.");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ec01_exception02 et = new Ec01_exception02();
		et.start();
		System.out.println("* main end");
	}

}
