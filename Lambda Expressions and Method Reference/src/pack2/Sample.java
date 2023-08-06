package pack2;

/*4)define a functional interface "Sixth" with an abstract method "void disp5()".
	define a class "Sample" with a static method "void fun1()"
	inside main function create a method reference for "Sixth" and invoke "fun1" of "Sample"
*/

interface Sixth {
	public abstract void disp5();
}

public class Sample {
	public static void fun1() {
		System.out.println("Inside fun1");
	}

	public static void main(String[] args) {

		/*
		 * using lambda expression Sixth ref=()->{Sample.fun1();}; ref.disp5();
		 */

		/*
		 * using method reference Sixth ref = Sample::fun1; ref.disp5();
		 */
	}

}
