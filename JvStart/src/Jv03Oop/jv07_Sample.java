package Jv03Oop;


public class jv07_Sample {

	public jv07_Sample() {
		// TODO Auto-generated constructor stub
	}
	public void getSum() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			
		}
		System.out.println("* getSum() 1");
		System.out.println(" sum = " + sum);
	}
	
	public void getOddSum() {
		int sum=0;
		for(int i=1 ; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println("getOddSum()");
		System.out.println(" OddSum = "+ sum);
	}

}
