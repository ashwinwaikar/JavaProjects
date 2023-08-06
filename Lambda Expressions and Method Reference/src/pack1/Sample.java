package pack1;

/*2)	define a functional interface "Third" with an abstract method "void show(int num)".
		define a class "Sample" with a method "void disp(int num)"
		inside main function create a method reference for "Third" and invoke "disp" of "Sample" by passing a value "500".

*/
interface Third {
	public abstract void show(int num);
}

public class Sample {
	void disp(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		/*
		 * using lambda expressions Third t = (int a) -> { s.disp(a); }; t.show(500);
		 */

		Third t = s::disp;
		t.show(1009);

	}
}
