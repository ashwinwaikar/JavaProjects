package pack1;

/*5)	define a functional interface "Emp" with an abstract method "void show()".
		define a class "MyClass" with default constructor with the message "inside default constructor of MyClass".
		inside main function instantiate "MyClass" using method reference to "Emp"
*/

interface Emp {
	public abstract void show();
}

class MyClass {
	MyClass() {
		System.out.println("Inside default constructor of MyClass");
	}
}

public class Test1 {

	public static void main(String[] args) {
		/*
		 * using lambda expressions Emp ref=()->{new MyClass();}; ref.show();
		 */
		/*
		 * using method reference Emp ref = MyClass::new; ref.show();
		 */
	}

}
