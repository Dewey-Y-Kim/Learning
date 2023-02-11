package Jv00TestPaC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testpack01_if {
	int i, resultI,resultI2; String resultS;int[] vary= new int[2]; double resultD,resultD2;boolean rutine= true;
	Scanner sc = new Scanner(System.in);
	public testpack01_if() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void Select() throws InputMismatchException {
		
		System.out.println("원하시는 연산은 무엇이십니까? \n 1. 사각형의 넓이\n 2.원의 넓이 \n 3.홀짝 판별 \n 4.큰수구하기 \n 5. 윤년/평년 확인 \n 0. 종료 \n************************** \n 어떤 연산을 할까요? ");
		
		i= sc.nextInt();
	}
	
	public void Switch(int i) {
		switch(i){
			case 1: inputMeth("가로", "세로");square(vary[0],vary[1]);break;
			case 2: inputMeth("반지름");circle(vary[0]);break;
			case 3: inputMeth("임의의 수");oddeven(vary[0]);break;
			case 4: inputMeth("첫번째 수", "두번째 수");resultI=large(vary[0],vary[1]); break;
			case 5: inputMeth("년도");year(vary[0]);break;
			case 0: rutine=false; break;
		}
	}
	public void inputMeth(String what) throws InputMismatchException {
		System.out.print(what+" = ");
		vary[0]=sc.nextInt();
	}
	
	public void inputMeth(String what1, String what2) throws InputMismatchException {
		System.out.print(what1+" = ");
		vary[0]=sc.nextInt();
		System.out.print(what2+" = ");
		vary[1]=sc.nextInt();
	}
	// 각각의 연산
	public void square(int i, int j) {
		resultI = i * j;
		resultI2 = ( i + j ) * 2;
	}
	
	
	public void circle(int r) {
		resultD=r*r*Math.PI;
		resultD2=2*r*Math.PI;
	}
	
	public void oddeven(int n) {
		if(n%2==0) resultS ="짝수입니다.";  else resultS="홀수입니다.";
		
	}
	
	public int large(int m, int n) {
		if (m>=n) {return m;}
		return n;
	}
	
	public void year(int n) {
		if(((n % 4) ==0 && ((n%100) !=0 ))||(n%400==0)) { resultS="윤년입니다.";}
		else { resultS="윤년이 아닙니다.";}
	}
		
	public void print(int i){
		switch(i) {
			case 1: System.out.printf("사각형의 넓이 = %d\n사각형의 둘레%d\n",resultI,resultI2);break;
			case 2: System.out.printf("원의 넓이= %f\n 원의 둘레=%f\n",resultD,resultD2 );break;
			case 3: System.out.printf("%d은/는 %s\n", vary[0],resultS);break;
			case 4: System.out.printf("큰수는 %d입니다.\n", resultI);break;
			case 5: System.out.printf("%d년도는 %s\n",vary[0],resultS);break;
			case 0: return;
			}
		i=0; resultI=0;resultI2=0;resultS=null;vary[0]= 0;vary[1]=0;resultD=0.0;resultD2=0.0;
	}
		
	public boolean start(){
		try{
		Select();
		Switch(i);
		print(i); 
		}catch(InputMismatchException im){
			return rutine;}
		return rutine;
	}
	
	
	public static void main(String[] args) {
		boolean rutine=true;
		do {
		testpack01_if s= new testpack01_if();
		
		
		rutine=s.start();
		} while(rutine);
		System.out.println("이용해주셔서 감사합니다.");
	}

}
