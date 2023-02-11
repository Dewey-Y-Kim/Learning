package Jv05Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
// import ec02_userException.java;

public class userExceptiontest {
	Scanner scan= new Scanner(System.in);
	
	public userExceptiontest() {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		// 임의의 정수 입력, 1~그수까지 합을 구하기
		System.out.print("MaxInt=?");
		try {
			int max=scan.nextInt();
			if(max>=1 && max<=100) {
				int total = sum(max);
				System.out.println("1-"+max+"까지 합 : "+max);
			} else { //강제로 예외발생시키기
					 //throw
				// throw new Ec02_userException;
				throw new Ec02_userException("1~100 x");
			}
		} catch(InputMismatchException ime) {
			System.out.println("Please input integer.");
		} catch(Ec02_userException me){
			System.out.println(me.getMessage());
		}
	}
	// 합구하기
	public int sum(int max) {
		int sum=0;
		for(int i=1; i<=max; i++) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new userExceptiontest().start();
		
	}
	
}
