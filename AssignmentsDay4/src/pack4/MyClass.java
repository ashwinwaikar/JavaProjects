//4)	Show the example of single level inheritance with constructor invocation.
package pack4;
class Test {
	private int x;
	
	public Test(int x) {
		this.x=x;
		System.out.println("Test Parent Parameterized Constructor");
	}
	
	int getX() {
		return x;
	}
}
public class MyClass extends Test{
	
	public MyClass() {
		super(1009);
		System.out.println("MyClass no-arg constructor");
	}

	public static void main(String[] args) {
		MyClass m1=new MyClass();
		Test t1=new Test(10);
	}

}
