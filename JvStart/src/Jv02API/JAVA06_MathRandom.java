package Jv02API;

public class JAVA06_MathRandom {

	public static void main(String[] args) {
		// 난수는 0보다 크고 1.0보다 작은 실수를 1개 만들어준다.
		for(int i=1;i<=100;i++) {
			double random = Math.random();
			if (i%4==1) {System.out.print(i/4+1+"\t"+random);}
			else {System.out.print("\t"+random);}
			if(i%5==0) System.out.println();
		}
		for(int i=1; i<=100; i++) {
			//0~99 (난수*큰값-작은값+1)
			double ran = Math.random();
			// int ranInt = (int)(ran*(15-0+1));
			//20~40 난수
			int ranInt = (int)(ran*(50)+1);
			System.out.print((ranInt+"\t"));
			if(i%10==0) System.out.println();
			}
	}
	

}
