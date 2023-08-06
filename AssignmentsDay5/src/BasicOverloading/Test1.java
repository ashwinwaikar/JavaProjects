package BasicOverloading;
/*	Define a parent class with one function.
 *  Define child class with the function having same name as of parent class function, 
 *  but having different argument.
	Create an instance of child class and call the functions. 
	Make sure u have followed the concept of “function overloading “ in inheritance.
*/

class Parent {
	public void display(String x) {
		System.out.println(x+" "+"Parent display method");
	}
}

class Child extends Parent {
	public void display(String x,String y) {
		System.out.println(x+" "+y+" "+"Child display method");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Child p=new Child();
		p.display("ASHWIN");
		p.display("ASHWIN","WAIKAR");
	}

}
