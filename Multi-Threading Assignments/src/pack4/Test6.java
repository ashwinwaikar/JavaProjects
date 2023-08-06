package pack4;

/*	create 2 threads
	one thread will display odd numbers between “1 to 30”. second thread 
	will display even numbers between 1 to 30. both the threads should start 
	simultaneously.
	(use implements Runnable method*/

class Display {
	public synchronized void disp() {
		if (Thread.currentThread().getName() == "first") {
			for (int i = 1; i <= 30; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = 30; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}
}

class MyClass implements Runnable {
	Display d1;

	@Override
	public void run() {
		d1.disp();
	}

	public MyClass(Display d) {
		this.d1 = d;
	}

}

public class Test6 {

	public static void main(String[] args) {
		Display d = new Display();

		MyClass c = new MyClass(d);

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

		t1.setName("first");
		t2.setName("second");
	}

}
