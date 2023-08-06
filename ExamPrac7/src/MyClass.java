/*create 2 threads
one thread will display odd numbers between “1 to 30”. second thread 
will display even numbers between 1 to 30. both the threads should start 
simultaneously.
(use implements Runnable method*/

class Display {
	public synchronized void display() {
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

class ThreadProcess implements Runnable {
	Display d1;

	public ThreadProcess(Display d) {
		this.d1 = d;
	}

	@Override
	public void run() {
		d1.display();
	}

}

public class MyClass {

	public static void main(String[] args) {
		Display d = new Display();

		ThreadProcess tp = new ThreadProcess(d);

		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tp);

		t1.start();
		t2.start();

		t1.setName("first");
		t2.setName("second");
	}

}
