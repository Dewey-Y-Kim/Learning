package Jv03Oop;


import Java04_innerclass.MyData;

public class inherit2 {

	public inherit2() {
		// TODO Auto-generated constructor stub
	    Ex o = new Ex();
	    Test i = new Test(); 
	    int n = 10; 
	    i.setX( n ); 
	    o.setY( i ); 
	         System.out.println( o.getY().getX() );
	    MyData data=new MyData();
	    data.username = "이순신";
	    System.out.println(data.username);
	   
	}

}
class Test {
    int x;
    public void setX( int x ) { this.x = x;}
    public int getX(){ return x; }
}

class Ex{
    Test y;
    public void setY( Test y ) { this.y =y; }
    public Test getY() { return y; }
}
