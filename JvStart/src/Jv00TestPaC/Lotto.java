package Jv00TestPaC;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lotto {

	public Lotto(){}
	
	public int inNum()  {
		System.out.println("================== 수 입력 =================");
		System.out.print("게임을 몇회 실시할까요? (0 : 종료 )");
		Scanner sc= new Scanner(System.in);
		int repeat;
		try{repeat = sc.nextInt();}
		catch(InputMismatchException e) { repeat=0; }
		return repeat;
	}
	
	public void process(int repeat){
		for (int i=1; i<=repeat; i++) {
			LottoMaker lotto = new LottoMaker();
			lotto.Run();

		}
	}
	
	public void start() {
		Scanner sc= new Scanner(System.in);
		boolean regame=true;
		do {
			int repeat = inNum();
			if (repeat ==0) break;
			process(repeat);
			System.out.print("\n\n 다시 하시겠습니까?( 1: 예  , 2 : 아니요)");
			try {
			int i= sc.nextInt();
			if (i==2) regame=false;
			} catch(InputMismatchException E) {}
		}while(regame);	
		System.out.println("이용해 주셔서 감사합니다.");
	}
	
	
	public static void main(String[] agrs) {
		Lotto s= new Lotto();
		s.start();
	}
}
