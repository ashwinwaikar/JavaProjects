package pack1;
/*	3)define interface "Fourth" with "default void disp3()" method.
	define a class "Base1" with "public void disp3()" method,
	now derive a class Sub1 from "Base1" and "Fourth". Sub1 class should have only "public void myfun()" method.
	inside main create an object of "Sub1" and invoke "disp3".
	once you get the result, also try to invoke "disp3" of "Fourth"*/

interface Fourth {
	default void disp3() {
		System.out.println("Default Disp3");
	}
}

class Base1 {
	public void disp3() {
		System.out.println("Base1 class Disp3");
	}
}

class Sub1 extends Base1 implements Fourth {
	public void myfun() {

	}
}

public class Test3 {

	public static void main(String[] args) {
		Sub1 s = new Sub1();
		s.disp3();
		// invoking disp3 is not possible because of the CLASS WINS
	}

}
