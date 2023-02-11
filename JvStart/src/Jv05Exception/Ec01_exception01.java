package Jv05Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ec01_exception01 {

	public Ec01_exception01() {}
	public void start() {
		// TODO Auto-generated constructor stub
		java.util.Scanner sc= new Scanner(System.in);
		
		try { //예외 발생 가능한 코드 또는 발생가능성이 없는 코드를 함께 기술할 수 있다
		System.out.println("* start()");
		System.out.print("첫번째 수 : "); //<--예외 가능
		int num1= sc.nextInt();
		System.out.print("두번째 수 : "); // <--예외 가능
		int num2 = sc.nextInt();
		
		int plus= num1+num2;
		int minus= num1-num2;
		int multi= num1*num2;
		int divi = num1/num2;  // <--예외 가능
		
		// 5 + 10 = 15
		// printf(String format, object... args)
		System.out.printf("합: %d + %d = %d", num1, num2, plus);
		System.out.printf("\n차: %d - %d = %d", num1, num2, minus);
		System.out.printf("\n곱: %d * %d = %d", num1, num2, multi);
		System.out.printf("\n근: %d / %d = %d\n", num1, num2, divi);
		int data[]= {10,20,30};
		System.out.println(data[data.length-1]);
		}catch(ArithmeticException ae) {
			System.out.println("두번째 값은 0이외의 수를 입력해 주세요.");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}catch(InputMismatchException ie) {
			System.out.println("숫자를 입력해주세요.");
		ie.printStackTrace();
		System.out.println(ie.getMessage());
		}catch(ArrayIndexOutOfBoundsException aioe) {
			System.out.println(aioe.getMessage());
		}finally{
			System.out.println("무조건 실행된다.");
		}
		
		
		
		/* System.out.printf("\n2: %10d + %10d = %10d", num1, num2, plus);
		System.out.printf("\n3: %-10d + %-10d = %-10d", num1, num2, plus);
		System.out.printf("\n4: %-10d + %-10d = %7.2f", num1, num2, (double)plus); */
	}

	public static void main(String[] args) {
		// 두수를 입력받아 합,차,곲,몫을 구하는 프로그램을 작성하라.
		new Ec01_exception01().start();
		System.out.println("* main() 끝");
		
	}

}
