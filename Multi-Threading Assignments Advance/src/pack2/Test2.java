package pack2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*		2)create a multi-threaded application by using Thread pool.create 2 threads. each thread should display numbers from 1 to 10. 
 * 		[ make sure while one thread executes , other thread should not interfere ]
		Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. from 1 to 5 
		and then previous thread will display nos. from 6 to 10 and so on.
*/

class Myclass2 implements Runnable {

	@Override
	public synchronized void run() {
		perform();

	}

	private void perform() {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
			notifyAll();
		}
	}

}

public class Test2 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		Myclass2 m = new Myclass2();

		for (int i = 1; i <= 2; i++) {
			exec.execute(m);
		}
		exec.shutdown();
	}

}
