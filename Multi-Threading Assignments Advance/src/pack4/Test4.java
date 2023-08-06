package pack4;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*4) 	create a multi-threaded application by using Thread pool and ReentrantLock.
  		create 2 threads. each thread should display numbers from 1 to 10. 
  		[ make sure while one thread executes , other thread should not interfere ]
		Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. from 1 to 5 
		and then previous thread will display nos. from 6 to 10 and so on.

*/

class Myclass4 implements Runnable {
	ReentrantLock rl = new ReentrantLock();
	Condition c = rl.newCondition();

	@Override
	public void run() {
		rl.lock();
		perform();
		rl.unlock();
	}

	private void perform() {

		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				try {
					c.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
			c.signalAll();
		}

	}

}

public class Test4 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		Myclass4 m = new Myclass4();

		for (int i = 1; i <= 2; i++) {
			exec.execute(m);
		}
		exec.shutdown();

	}

}
