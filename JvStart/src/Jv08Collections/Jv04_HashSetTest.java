package Jv08Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Jv04_HashSetTest {
	double data[] = {12.1, 22.4, 11.1, 87.2, 572.2, 11.1, 87.2, 572.2};
	public Jv04_HashSetTest() {
		// TODO Auto-generated constructor stub
	}

	public void start(){
		/*
		 * HashSet
		 * set 인터페이스를 상속 받는다
		 * 저장순서를 유지하지 않는다
		 * 중복데이터를 허용하지 않는다.
		 */
		HashSet<Double> hs = new HashSet<Double>();
		
		for(double d: data) {
			hs.add(d);//hashSet에 객체 추
		}
		
		//HashSet 객체 꺼내기
		Iterator<Double> iter=hs.iterator();
		while(iter.hasNext()) { //.hasNext() 데이터 있으면 true, 없으면 false가 리턴
			double Num=iter.next();
			System.out.print(Num+"\t");
			int i=0;
			i++;
			if (i%5==0) System.out.println();
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv04_HashSetTest hst = new Jv04_HashSetTest();
		hst.start();
		
	}

}
