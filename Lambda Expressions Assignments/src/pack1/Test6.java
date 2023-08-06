package pack1;

/*1) 	define a functional interface "First" with an abstract method "void disp1()",default method "void disp2()" 
 		and a static method "void disp3()"
		inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
		also invoke "disp3()" method inside main.
*/

interface First {
	void disp1();

	default void disp2() {
		System.out.println("Disp 2");
	}

	static void disp3() {
		System.out.println("Disp 3");
	}
}

public class Test6 {

	public static void main(String[] args) {
		First f1 = () -> {
			System.out.println("Disp 1");
		};

		f1.disp1();

		f1.disp2();

		First.disp3();
	}

}
