package Hierarchical;

/*

3) Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.
*/
class Parent {
	public Parent() {
		System.out.println("Parent def const ");

	}

	public Parent(String string) {
		System.out.println("Parent para const ");
	}

}

class Child1 extends Parent {
	Child1(String A) {
		super("ASW");
		System.out.println("Child1 para const");
	}
}

class Child2 extends Parent {
	public Child2() {
		super("Ashwin");
		System.out.println("Child2 def const");

	}
}

class Child3 extends Parent {

	public Child3(int i) {
		System.out.println("Child3 def const");
	}

}

public class Test4 {

	public static void main(String[] args) {
		Child3 c3 = new Child3(50);
	}

}
