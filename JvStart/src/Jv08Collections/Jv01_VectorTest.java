package Jv08Collections;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class Jv01_VectorTest {

	public Jv01_VectorTest() {
		// TODO Auto-generated constructor stub
	}
	public Vector getData() {
		/*
		 * 컬렉션은 객체를 저장하고 보관하는 기능을 가진 자료구조처리를 해주는 말한다.
		 * 컬렉션은 기본적으로 다양한 타입의 객체를 저장할 수도 있고, 한 종류로 하나의 타입만 저장-제너릭-할 수 있도록 설정할 수도 있다.
		 *  
		 * 순서를 유지, index 가짐, 중복객체 저장됨.
		 */
		 Vector vector = new Vector();
		 
		 String name = "홍길동";
		 int age = 24;
		 Calendar now = Calendar.getInstance();
		 now.set(2020, 10,25);
		 Random random = new Random();
		 MemberDTO dto = new MemberDTO("id","wjd","gkd","sl","sg");
		 
		 vector.add(name); //0
		 vector.add(age); //1 autoboxing ---->2 --deleted
		 vector.addElement(now); // 2 ------> 3
		 vector.add(1, random);
		 vector.add(dto);
		 
		 //index 위치의 객체를 치환.
		 vector.set(2, 43); // index 2 
		 vector.setElementAt("세종대왕",0); //index 0
		 
		 
		 System.out.println("capacity of vector = "+ vector.capacity()); //확보된 크
		 return vector;
	}
	

}
