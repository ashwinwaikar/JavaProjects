package pack3;

/*
	5)create 2 threads
	one thread will display 1 to 50
	second thread will display 50 to 1
	both the threads should start simultaneously.
	(use implements method)
*/

class Display {
	public synchronized void disp() {
		if (Thread.currentThread().getName() == "first") {
			for (int i = 1; i <= 50; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = 50; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}
}

class Myclass2 implements Runnable {
	Display d1;

	public Myclass2(Display d) {
		this.d1 = d;
	}

	@Override
	public void run() {
		d1.disp();
	}

}

public class Test5 {

	public static void main(String[] args) {
		Display d = new Display();

		Myclass2 c = new Myclass2(d);

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

		t1.setName("first");
		t2.setName("second");

	}

}
