package Jv05Exception;
import java.util.Scanner;

public class Ec01_exception03 {

	public Ec01_exception03() {
		// TODO Auto-generated constructor stub
	}
	
	//문자열 입력받기
	public void inData() throws Exception { //NumberFormatException, ArithmeticException{
		Scanner scan = new Scanner(System.in);
		System.out.println("* inDATA");
		System.out.print("첫번째 수 : ");
		String n1 = scan.nextLine(); //콘솔에서 한줄씩 입력 enter 포함. string으로 return
		System.out.print("두번째 수 : ");
		String n2 = scan.nextLine();
		int  n1Int = Integer.parseInt(n1); //문자열을 정수형으로 변환해주는 메소드 //<======NumberFormatException
		int n2Int = Integer.parseInt(n2);
		divide(n1Int, n2Int);
	}
	
	public void divide(int n1, int n2) throws Exception { //ArithmeticException {
		int result = n1/n2; // <====== ArithmeticException
		System.out.println("* divide()");
		System.out.printf("%d / %d = %d\n", n1, n2, result);
		array();
	}
	
	public void array() throws Exception { //ArrayIndexOutOfBoundsException {
		int[] data = {1,4,2,5,10};
		System.out.println("* array()");
		System.out.println(data[5]);
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ec01_exception03 et3 = new Ec01_exception03();
			et3.inData();
		} catch(Exception ec) {
			System.out.println("입력값이 잘못 되었습니다.");			
		} /* catch(NumberFormatException nfe) {
			System.out.println("입력값은 숫자여야 합니다.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println(aioobe.getMessage()); 
		} */
			
		System.out.println("fin..");
	}

}
