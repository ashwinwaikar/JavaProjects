package pack1;

/*4) 	define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
		define a class "CalcDemo" with main method.
		inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.
*/
interface Calculator {
	int multiply(int a, int b);
}

public class CalcDemo {

	public static void main(String[] args) {
		Calculator c = (int x, int y) -> {
			return x * y;
		};
		System.out.println("So the multiplication is-");
		System.out.println(c.multiply(5, 7));
	}

}
