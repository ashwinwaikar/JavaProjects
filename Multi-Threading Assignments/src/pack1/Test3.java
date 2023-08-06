package pack1;

/*
 3) create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
 	they should display output "Exec  0" to "Exec 5".
  */

class Display {
	public synchronized void disp() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Exec " + i);
		}
	}
}

class MyClass implements Runnable {
	Display d1;

	public MyClass(Display d) {
		this.d1 = d;
	}

	@Override
	public void run() {
		d1.disp();
	}

}

public class Test3 {

	public static void main(String[] args) {
		Display d = new Display();

		MyClass c = new MyClass(d);

		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);

		t1.start();
		t2.start();
		t3.start();
	}

}
