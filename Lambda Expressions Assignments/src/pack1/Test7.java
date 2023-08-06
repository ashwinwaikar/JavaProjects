package pack1;

/*5)	define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
		create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.
		create 2 threads and pass above created "Runnable" implementation to these threads.
		make sure while one thread is executing other thread will not interfere.

*/
class Display {
	public synchronized void disp() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class Test7 {

	public static void main(String[] args) {
		Display d = new Display();

		Runnable r = () -> {
			d.disp();
		};

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}

}
