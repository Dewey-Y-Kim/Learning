package Jv08Collections;
import java.util.Calendar;

public class Jv02_GenericMain {

	public Jv02_GenericMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		String name1 = "Sleeping";
		Jv02_GenericTest gt1 = new Jv02_GenericTest();
		gt1.setName(name1);
		gt1.setNum(n1);
		System.out.print(gt1.toString());
		System.out.println("\n====================================");
		Calendar now = Calendar.getInstance();
		double n2 = 12.5;
		Jv02_GenericTest<Double,Calendar> gt2 = new Jv02_GenericTest<Double,Calendar>();
		gt2.setNum(n2);
		gt2.setName(now);
		System.out.println(gt2.getNum());
		System.out.println(gt2.getName());
		
	}

}
