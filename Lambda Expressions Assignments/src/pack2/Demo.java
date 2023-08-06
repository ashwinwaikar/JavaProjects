package pack2;

/*3)	define a functional interface "MyInterface" with an abstract method "void fun()"
		define a class Demo with two functions "static void perform" and main.
		from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.
*/
interface MyInterface {
	void fun();
}

public class Demo {
	static void perform(MyInterface m2) {
		m2.fun();
	}

	public static void main(String[] args) {
		MyInterface m1 = () -> {
			System.out.println("This is Fun Method Implementation");
		};

		Demo.perform(m1);
	}
}
