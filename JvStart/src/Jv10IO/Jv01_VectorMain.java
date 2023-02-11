package Jv10IO;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class Jv01_VectorMain {

	public Jv01_VectorMain() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		Jv01_VectorTest jv = new Jv01_VectorTest();
		Vector vec = jv.getData();
		
		//벡터 데이터 꺼내기
		String name=(String)vec.get(0);
		Random ran = (Random)vec.get(1);
		int age= (int)vec.get(2);
		Calendar now=(Calendar)vec.get(3);
		int y= now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH);
		int d = now.get(Calendar.DAY_OF_MONTH);
		MemberDTO mem = (MemberDTO)vec.get(4);
		
		System.out.println("name : "+name);
		System.out.println("난수 : "+ran.nextInt(100));
		System.out.println("나이 : "+age);
		System.out.printf("%d년 %d월 %d일", y,m,d);
		System.out.println(mem.toString());
		System.out.println(vec.isEmpty());
		
		vec.remove(3);
		System.out.println(vec.isEmpty());
		System.out.println(vec.size());
		vec.remove("세종대왕");
		System.out.println(vec.size());
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jv01_VectorMain().start();
	}

}
