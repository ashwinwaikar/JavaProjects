package constructorinvocation;

class Base {
	public Base(int x) {
		System.out.println("BASE PARA CONST");
		System.out.println(x);
	}
}

class Sub1 extends Base {
	Sub1() {
		super(100);
	}

	Sub1(int x) {
		super(20);
	}

	Sub1(int x, int y) {
		super(10);
		System.out.println(x + " " + y);
	}
}

public class Test5 {

	public static void main(String[] args) {
		Sub1 s = new Sub1(10, 20);
	}

}
