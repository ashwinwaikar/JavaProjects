/*
 2)	Create a class with static and non-static member variables. Define static and non-static member functions. 
	Create instance of this class and call both static and non-static member functions.
  */
package pack2;

class MyClass{
	private int x;
	private static int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		MyClass.y = y;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
	MyClass c1=new MyClass();
	c1.setX(1009);
	MyClass.setY(1999);
	
	System.out.println(c1.getX());
	System.out.println(MyClass.getY());
	
	}

}
