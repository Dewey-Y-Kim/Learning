package Jv02API;
import java.util.Random;

public class Java07_RandomClass {

	public static void main(String[] args) {
		// Random클래스 :난수를 구한다.
		Random ran = new Random();
		
		//nextInt() : int범위의 수중 하나를 무작위로 얻어온다. 
		//Math.abs() :절대값구하기
		// 10~20
		for (int i=1;i<=1000;i++) {
			int num = Math.abs(ran.nextInt(11));
			System.out.print(num+10+"\t");
			if(i%10==0) {System.out.println();}
		}
		System.out.println("\n\n");
		
		for (int i=1; i<=100;i++) {
			boolean boo=ran.nextBoolean();
			if (boo) System.out.print("1\t");
			else System.out.print("0\t");
			if(i%10==0) System.out.println();
			
		}
	}
	
}
