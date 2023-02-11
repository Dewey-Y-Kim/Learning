package Jv03Oop;


public class inherit {
	public inherit(){}
	
	class SuperTest{
		int a;
		SuperTest(int a){
			this.a = a;
		}
	}
	
	class SubTest extends SuperTest{
		
	}
	public inherit() {
		SubTest st=new SubTest();
		
		
	}

}
