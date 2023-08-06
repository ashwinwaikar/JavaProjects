package BasicInterface;

/*
 7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
 
  */

class Parent1 {
	public void disp1() {
		System.out.println("THIS METHOD IS OF PARENT1 CLASS");
	}

}

interface Parent2 {
	public abstract void disp2();
}

class Child extends Parent1 implements Parent2 {

	@Override
	public void disp2() {
		System.out.println("THIS IS INTERFACE ABSTRACT METHOD WHICH IS OVERRIDE IN CHILD CLASS");
	}

}

public class BasicInterface2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.disp1();
		c.disp2();
	}

}
