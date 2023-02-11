package Jv00TestPaC;

import java.util.Iterator;
import java.util.TreeSet;

public class LottoMaker {

		TreeSet<Integer> lotto = new TreeSet<>();
		public LottoMaker() {
			
		}
	//  로또 번호 생성기 1~45 , 6+1 게임수 입력받기 반복확인
		// 생성
		public int Num() {
			int i = (int) (Math.random()*44+1);
			return i;
		}
		
		public void NumAdder(int i) {
			do {
				int j = Num();
				if(j != i) lotto.add((Integer)j);
				
			}while(lotto.size()<=6);
		}
		
		public void Run() {
			int numBonus = Num();
			NumAdder(numBonus);
			printOut(numBonus);
		}
		public void printOut(int bonus){
			Iterator<Integer> inter = lotto.iterator();
			for(int i=0; i<6; i++) {
				System.out.printf("[%2d]",inter.next());
			}
			System.out.printf("\tbonus Number : [%2d]\n",bonus);
		}
}
