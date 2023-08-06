package pack1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*1) create a multi-threaded application by using Thread pool.create 2 threads. each thread should display characters from A to J. 
 * [ make sure while one thread executes , other thread should not interfere ]
*/

class Myclass1 implements Runnable {

	@Override
	public synchronized void run() {
		perform();
	}

	private void perform() {
		for (char ch = 'A'; ch <= 'J'; ch++) {
			System.out.println(ch);
		}

		System.out.println("*************************");
	}

}

public class Test1 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		Myclass1 m = new Myclass1();

		for (int i = 1; i <= 2; i++) {
			exec.execute(m);
		}
		exec.shutdown();
	}

}
