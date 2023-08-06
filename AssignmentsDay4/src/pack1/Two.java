/*
Define 2 classes “First” and “Second” with member variables,member functions and constructors of  your choice. 
	Now define a class “Two” in which define main function.
	 In main function create various instances of First and Second  and call their individual member functions.
 */
package pack1;

class First {
	private int x;

	public First(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

}

class Second {
	private int y;

	public Second(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}
	
}

public class Two {

	public static void main(String[] args) {

		First f1=new First(1009);
		System.out.println(f1.getX());
		
		Second s1=new Second(1999);
		System.out.println(s1.getY());	
	}

}
