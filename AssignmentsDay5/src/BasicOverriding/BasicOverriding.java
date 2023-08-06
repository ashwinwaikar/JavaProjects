package BasicOverriding;
//Define a parent and a child class . Now explain function overriding with Example.

/*
 here the parent class display() method is overridden method and child class display() 
 method is overriding method
 both having same name but diff defination and we can call them as per our need 
 */
class Parent {
	public void display() {
		System.out.println("THIS IS BASE CLASS DISPLAY METHOD");
	}
}

class Child extends Parent {
	public void display() {
		System.out.println("THIS IS DERIVED CLASS DISPLAY METHOD");
	}
}

public class BasicOverriding {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c1 = new Child();

		p1.display();
		p2.display();
		c1.display();
	}

}
