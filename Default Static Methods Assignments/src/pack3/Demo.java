package pack3;

/*5)define interface "First" with "static void disp1()" method.
	class "Base" with "static void disp2()" method.
	derive a class "Sub" from "Base" and "First"
	now define a class Demo in which define "main" method.
	inside main show how many ways you can invoke "disp1" and "disp2" methods.*/

interface First {
	static void disp1() {
		System.out.println("First");
	}
}

class Base {
	static void disp2() {
		System.out.println("Base");
	}
}

class Sub extends Base implements First {

}

public class Demo {

	public static void main(String[] args) {
		// we can invoke it using interface name.methodname() only because the method is
		// static
		First.disp1();
		Base.disp2();
	}

}
