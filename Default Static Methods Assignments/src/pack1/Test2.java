package pack1;

/*2) define interface "Third" with "default void disp1()" and "static void disp2()" methods.
	 derive a class "Sub" from "Third" ( do not override "disp1")
	 inside main function invoke "disp1" and "disp2" methods.*/

interface Third {
	default void disp1() {
		System.out.println("Def Disp1");
	}

	static void disp2() {
		System.out.println("Static Disp2");
	}
}

class Sub implements Third {

}

public class Test2 {

	public static void main(String[] args) {
		Sub s = new Sub();
		s.disp1();
		Third.disp2();
	}

}
