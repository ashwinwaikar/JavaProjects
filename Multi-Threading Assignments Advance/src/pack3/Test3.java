package pack3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/*3) create a multi-threaded application by using Thread pool and ReentrantLock (explicit locking) .
 * create 2 threads. each thread should display characters from A to J. 
 * [ make sure while one thread executes , other thread should not interfere ]
*/

class Myclass3 implements Runnable {

	ReentrantLock rl=new ReentrantLock();
	
	@Override
	public void run() {
		rl.lock();
		for (char ch = 'A'; ch <= 'J'; ch++) {
			System.out.println(ch);
		}
		rl.unlock();
	}

}

public class Test3 {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);

		Myclass3 m = new Myclass3();

		for (int i = 1; i <= 2; i++) {
			exec.execute(m);
		}
	}

}
