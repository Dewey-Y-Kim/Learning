package Jv06Interfaces;
/* 추상클래스
 * 일반메소드와 1개 이상의 추상메소드를 가진 클래스
 * 추상메소드 : 메소드명만 존재하고 실행부를 명시하지 않은 미완성 메소드를 말한다.
 * 추상메소드는 반환형 왼쪽에  abstract 키워드를 표기하여야 한다.
 * 추상클래스는 class키워드 왼쪽에 abstract 를 표기하여야 한다.
*/
public abstract class jv02_abstractTest {

	public jv02_abstractTest() {
		// TODO Auto-generated constructor stub
	}
	public void add(int a, int b) {
		int hap = a + b;
		System.out.println(a+"+"+b+"="+hap);
		
	}
	public abstract void minus(int a, int b); //추상메소드
	
	public void multiple(int x, int y) {
		int mul =x * y;
		System.out.println(x+" * "+y+" = "+mul);
	}
	
	public abstract void divide(int x, int y); //추상 클래
	
}
