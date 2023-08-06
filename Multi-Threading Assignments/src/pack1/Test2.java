package pack1;

/*  1)create a multi-threaded application by using  "extends Thread " method.
    create 2 threads. they should display characters from A to J.
 	2) above program  using "implements Runnable" method.
*/
public class Test2 implements Runnable {

	public void run() {
		for (char c = 'A'; c <= 'J'; c++) {
			System.out.print(c + " ");
		}
	}

	public static void main(String[] args) {
		Test2 t1 = new Test2();
		Test2 t2 = new Test2();

		Thread td1 = new Thread(t1);
		Thread td2 = new Thread(t2);

		td1.start();
		td2.start();
	}

}
