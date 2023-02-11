package Jv08Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Jv04_TreeSetTest {

	public Jv04_TreeSetTest() {
		// TODO Auto-generated constructor stub
	}
	
	void start() {
		String data[] = {"kimdoo", "도","레","미","가","songi", "putter", "Song", "Sung", "sung", "sung", "242", "123", "321", "s.jpg", "kimdoo", "songi","도","레","미"};
		System.out.println("배열 수 : "+data.length);
		/* 
		 * TreeSet collection
		 * 정렬되어 저장되어 저장순서를 유지하지 않는다.
		 * 중복허용 되지 않는다.
		 */
		TreeSet<String> ts = new TreeSet<String>();
		for( int i=0; i<data.length ; i++) {
			ts.add(data[i]);
		}
		
		System.out.println("객체 수 : "+ts.size());
		Iterator<String> ii=ts.iterator();
		while(ii.hasNext()) {
			System.out.print(ii.next()+"\t");
			
		}
		System.out.println();
		Iterator<String> iii = ts.descendingIterator();
		while(iii.hasNext()) {
			System.out.print(iii.next()+"\t");
			
		}
		System.out.println();
		String first = ts.first();
		System.out.println("first : "+ first);
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jv04_TreeSetTest tst = new Jv04_TreeSetTest();
		tst.start();
		
	}

}
