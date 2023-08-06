package pack1;

/*2) 	define a functional interface "Second" with an abstract method "void disp4()".
		define a class Demo with main function.
		inside main function create two implementations of "Second" using lambda expression and display their names.

*/

interface Second {
	void disp4();
}

public class Demo {

	public static void main(String[] args) {
		Second s1 = () -> {
			System.out.println("First implementation of disp4");
		};

		Second s2 = () -> {
			System.out.println("Second implementation of disp4");
		};

		s1.disp4();
		s2.disp4();

		System.out.println(s1.getClass().getName());
		System.out.println(s2.getClass().getName());
	}

}
