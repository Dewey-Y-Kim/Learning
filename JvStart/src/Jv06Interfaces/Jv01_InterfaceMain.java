package Jv06Interfaces;

public class Jv01_InterfaceMain implements Jv01_InterfaceA, Jv01_InterfaceC {
	/* 클래스에서 추상메소드들이 있는 인터페이스를 사용하기 위해서는
	 * implements 키워드를 이용하여 상속을 받은 후 모든 추상메소드들을 오버라이딩 하여야 한다. 
	 * interface는 여러개 상속받을 수 있다.
	 */
	
	public Jv01_InterfaceMain() {
		// TODO Auto-generated constructor stub
	}
	
	// @ : annotatiton 주석. 
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public void divide(int a, int b) {
		
	}

	@Override
	public void multiple(int a, int b) {
		
	}

	@Override
	public void minus2(int a, int b) {
		
	}
	

	@Override
	public String getDouble() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDouble(Double n) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Max : "+MAX);
		System.out.println("Max_DOUBLE : "+MAX_DOUBLE);
		
		System.out.println("STATUS : "+STATUS);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Jv01_InterfaceA.MAX);
		Jv01_InterfaceMain intf = new Jv01_InterfaceMain();
		intf.output();
		// new InterfaceA();
		// > Iterface므로 객체화 불가.
		Jv01_InterfaceA a= new Jv01_InterfaceMain();
		
		System.out.println(a.add(100,25));
		/* a.output();
		 * InterfaceC의 output() 은 숨겨져 있다. - 사용불가
		 */
		
		Jv01_InterfaceMain itm = (Jv01_InterfaceMain)a;
		itm.output(); // <==숨겨져 있다는 증거.
		
	}
}
