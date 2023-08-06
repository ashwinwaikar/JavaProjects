package pack5;
/*
 5)	Show the example of multi-level inheritance with constructor invocation. 
 */

class Parent {
	private int num1;

	public Parent(int num1) {
		this.num1 = num1;
		System.out.println("Parent class parameterized constructor");
	}

	int getNum1() {
		return num1;
	}
}

class Child extends Parent {
	private int num2;

	public Child(int num2) {
		super(1009);
		this.num2 = num2;
		System.out.println("Child class Parameterized Constructor");
	}

	int getNum2() {
		return num2;
	}
}

public class Test {

	public static void main(String[] args) {
		Child c1 = new Child(20);
		System.out.println(c1.getNum1());
		System.out.println(c1.getNum2());
	}

}
