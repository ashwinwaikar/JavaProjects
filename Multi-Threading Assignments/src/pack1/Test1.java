package pack1;

/*
 1) create a multi-threaded application by using  "extends Thread " method.
    create 2 threads. they should display characters from A to J.

  */
public class Test1 extends Thread {

	@Override
	public void run() {
		super.run();

		for (char c = 'A'; c <= 'J'; c++) {
			System.out.print(c + " ");
		}

	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		t1.start();
		t2.start();

	}

}
