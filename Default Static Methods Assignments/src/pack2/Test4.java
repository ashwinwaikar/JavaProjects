package pack2;

/*4)define interface "Base1" with "default void fun1()".
	derive an interface "Sub1" from "Base1" with "default void fun2()"
	derive a class "Sub2" from "Sub1". It should have only "public void fun3()" method.
	inside main function, create an object of "Sub2" and make sure when u invoke "fun3",
	it should call "Sub1's fun2" which should call "Base1's fun1" method.

	*/

interface Base1 {
	default void fun1() {
		System.out.println("Base1");
	}
}

interface Sub1 extends Base1 {
	default void fun2() {
		System.out.println("Sub1");
		Base1.super.fun1();
	}
}

class Sub2 implements Sub1 {
	public void fun3() {
		System.out.println("Sub2");
		Sub1.super.fun2();
	}
}

public class Test4 {

	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.fun3();
	}

}
