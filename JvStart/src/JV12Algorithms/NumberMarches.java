package JV12Algorithms;

import java.util.Scanner;

/*
[처리조건]
두 자리수(10~99)의 난수를 생성하여 맞추는 게임을 작성하라.

[처리결과]
숫자입력=56
컴퓨터의 수가 더 작습니다.
숫자입력=24
컴퓨터의 수가 더 큽니다.
숫자입력=25
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까(Y/y)?y

숫자입력=65
컴퓨터의 수가 더 작습니다.
숫자입력=45
컴퓨터의 수가 더 큽니다.
숫자입력=34
축하합니다. 3번만에 맞추셨습니다.
계속하시겠습니까(Y/y)?n

*/
public class NumberMarches {

	public NumberMarches() {
		
	}

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String sign;
		do {
			int compute = (int)(Math.random()*(99-10+1)) + 10 ;// 난수를 생성 10~99
			int cnt = 1;
			do {
				System.out.print("숫자입력=");
				int userin = Integer.parseInt(scan.nextLine());
				//cnt++;   초기값이 0인경우
				if(compute > userin) {
					System.out.println("컴퓨터의 수가 더 큽니다.");					
				}else if(compute < userin){
					System.out.println("컴퓨터의 수가 더 작습니다.");					
				}else {
					System.out.println("축하합니다. "+ cnt+"번째에 맞추셨습니다.");
					break;
				}
				cnt++;
			}while(true); 
			System.out.print("계속하시겠습니까(Y/y)?");// compute변수의 값을 맞출때까지 반복
			sign = scan.nextLine();
		//}while(sign.equals("Y") || sign.equals("y"));
		  }while(sign.equalsIgnoreCase("Y"));
	}
}
