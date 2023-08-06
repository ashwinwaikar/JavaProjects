package pack6;
/*6)	Show the example of hierarchical inheritance with constructor invocation.*/
class A {
	private int i;
	public A(int i) {
		this.i=i;
		System.out.println("A");
	}

}

class B extends A {
	public B() {
		super(50);
		System.out.println("B");
	}

}

class C extends A {
	private int c;
	
	public C(int c) {
		super(50);
		this.c=c;
		System.out.println("C");
	}
}

public class Test {
	public static void main(String args[]) {
		C c = new C(500);
		
		B b=new B();
	}
}
