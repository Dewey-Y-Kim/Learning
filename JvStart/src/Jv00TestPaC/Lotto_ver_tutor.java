package Jv00TestPaC;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Lotto_ver_tutor {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	public Lotto_ver_tutor() {
		// Lotto 6/45 treeSet 중복x 정렬 o
		/*
		 * 한게임 하나에 한줄
		 * 마지막 생성 - 중복 x
		 * 게임수 입력
		 * 계속할지 여부 확인
		 * 로또번호 생성
		 * 
		 */
	}
	
	
	public void gameStart() {
		do {
			int cnt = gameCount();
			for (int i=1; i<=cnt; i++) {
				System.out.print( i+"게임 : ");
				createLotto();
				
			}
			if(!endQuestion()) {System.out.println(" 프로그램이 종료되었습니다."); break;}
		}while(true);
	}
	public int gameCount() {
		do {
			try {
				System.out.println("게임 수 : ");
				// int cnt = scan.nextInt();
				String cntstr = scan.nextLine();
				int cnt = Integer.parseInt(cntstr); // 1~10, 38.2, -58, mn
				
				if(cnt>=1 && cnt <=10) { //정상게임수}
					return cnt;
				} else { //범위 벗어남
					System.out.println("게임수는 1~10까지만 가능합니다.");
				}
				
				//게임 수의 최대 최소 범위 확인
			}catch(NumberFormatException nnf) { System.out.println("게임 수는 숫자이어야 합니다.");}
		}while(true);
	}
	
	public void createLotto() {
		// 번호 6개와 마지막 생성된 보너스 번호 1개를 생성
		// 정렬, 중복 검사
		TreeSet<Integer> ts = new TreeSet<>();
		int ran = 0;
		while(true) {
			ran = random.nextInt(45)+1;
			ts.add(ran);
			if(ts.size() == 7)	{
				break; //7개 난수 생성 중지
			}
		}
		ts.remove(ran);
		System.out.print(ts.toString());
		System.out.println(", Bonus = "+ran);
			
		
	}
	public boolean endQuestion() {
		// y, Y :  예
		// n, N : 아니오
		// 그외 다시 질문
		do {
			System.out.println("계속하시겠습니까?(Y or y : 예, n or N: 아니오)?");
			String yn=scan.nextLine();
			if(yn.equalsIgnoreCase("Y")) {//계속
				return true;}else if(yn.equalsIgnoreCase("N")) { return false; }
			} while(true); 
		}

	public static void main(String[] args) {
		Lotto_ver_tutor lotto = new Lotto_ver_tutor();
		lotto.gameStart();
	}
	
}
