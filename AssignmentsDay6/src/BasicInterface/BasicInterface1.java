package BasicInterface;
/*
6) Define interface "A" with "disp1()" method.
Derive interface "B" from "A" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
*/

interface A {
	abstract public void disp1();
}

interface B extends A {
	abstract public void disp2();
}

class C implements B {

	@Override
	public void disp1() {
		System.out.println("DISPLAY OF A");
	}

	@Override
	public void disp2() {
		System.out.println("DISPLAY OF B");
	}

	public void disp3() {
		System.out.println("DISPLAY OF C");
	}
}

public class BasicInterface1 {

	public static void main(String[] args) {
		C c = new C();
		c.disp1();
		c.disp2();
		c.disp3();
	}

}
