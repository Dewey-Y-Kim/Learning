package Jv01Basic;

public class Jv02_selfcall {

	public Jv02_selfcall() {
		// TODO Auto-generated constructor stub
	}
	static int i=1;
	public void facto(int num) {
		i*=num;
		num--;
		if(num==1) {
			return;
		} else {
			facto(num);
		}
	}
	
	public int whilefacto(int num){
		
		while(num>1) {
			num*=num;
			num--;
		}
		System.out.println(i);
		return num;

	}
	
	public int forfacto(int num) {
		int s=1;
		for(int i=1;i<=num;i++) {
			s*=i;
		}
		return s;
	}
	public int facto2(int num) {
		if (num==1) return num;
		return num*facto2(num-1);
	}
	public static void main(String[] args) {
		// 임의의 값까지 factorial 구하기.
		System.out.println(new Jv02_selfcall().facto2(5));
	}

}
