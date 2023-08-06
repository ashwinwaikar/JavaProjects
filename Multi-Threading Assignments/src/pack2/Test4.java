package pack2;

/*
	4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
	[hint:- use "implements Runnable" and synchronized block]
*/
class Display {
	public void disp() {
		synchronized (Display.class) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}

		}
	}
}

class MyClass1 implements Runnable {
	Display d1;

	MyClass1(Display d) {
		this.d1 = d;
	}

	@Override
	public void run() {
		d1.disp();
	}

}

public class Test4 {

	public static void main(String[] args) {
		Display d = new Display();

		MyClass1 c = new MyClass1(d);

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();
	}

}
