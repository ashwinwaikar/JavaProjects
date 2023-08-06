/*1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
 * Also show, if needed how will u invoke parent class constructor from child class ?
*/

package multilevelinheritance;

class A {
	public A() {
		System.out.println("'A' NO ARG");

	}
}

class B extends A {
	public B() {
		System.out.println("'B' NO ARG");

	}

	public B(String s) {
		System.out.println("'B' Parameterized");

	}
}

class C extends B {
	public C(int x) {
		System.out.println("'C' Parameterized");
	}
}

class D extends C {

	public D(String string) {
		super(10);
		System.out.println("'D' Parameterized");
	}

	public D() {
		super(290);
		System.out.println("'D' NO ARG");
	}

}

public class Test2 {

	public static void main(String[] args) {
		D d1 = new D();
		System.out.println("NOW FOR PARAMETERIZED D.......");
		D d2 = new D("ASHWIN");
	}

}
