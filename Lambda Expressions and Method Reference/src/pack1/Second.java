package pack1;

/*1)	define a functional interface "First" with an abstract method "void disp1()".
		define a class "Second" with a method "void fun1()"
		inside main function create a method reference for "First" and invoke "fun1" of "Second"
*/
interface First {
	public abstract void disp1();
}

public class Second {
	public void fun1() {
		System.out.println("Fun1 method");
	}

	public static void main(String[] args) {
		Second s = new Second();
		/*
		 * using lambda exp First f = () -> { s.fun1(); }; f.disp1();
		 */

		/*
		 * using method reference First f = s::fun1; f.disp1();
		 */
	}

}
