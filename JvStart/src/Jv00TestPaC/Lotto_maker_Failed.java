package Jv00TestPaC;
import java.util.ArrayList;

public class Lotto_maker_Failed {

	public Lotto_maker_Failed() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<Integer> lotto = new ArrayList();
//  로또 번호 생성기 1~45 , 6+1 게임수 입력받기 반복확인
	// 생성
	public int Num() {
		int i = (int) (Math.random()*44+1);
		return i;
	}
	// 확인통
		//
	public boolean Numadder(int i){
		int num;
		num= Num();
		if(NumCompare(num)) {adding(num); return true;}
		else { return false; }		
	}
	
	public boolean NumCompare(int lo) {
		for (Integer m: lotto) {
			if(m.equals(lo)) return false;
		}
		return true;
	}
	
	void adding(int num){
		if(lotto.size() != 6) {
			for(Integer m: lotto) {
				if(num<m) {lotto.add(num);}
			}
		}else {
			lotto.add(num);
		}
	}
	public ArrayList<Integer> Run() {
		do {
			int i=Num();
			Numadder(i);
		}while(lotto.size()==7);
		return lotto;
	}
	public void printout(){
		for(int i=0; i<6; i++) {
			int num = lotto.get(i);
			System.out.printf("[%d]  ",num);
			}
		System.out.println("bonus Number : "+lotto.get(7));
	}
}
