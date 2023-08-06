/**
 * 
 */

/**
 * @author Ashwin Waikar
 *
 */

abstract class Account {
	public abstract void calcInt();
}

class Saving extends Account {

	@Override
	public void calcInt() {
		System.out.println("Savings");
	}

}

class Current extends Account {

	@Override
	public void calcInt() {
		System.out.println("Current");

	}

}

class RD extends Account {

	@Override
	public void calcInt() {
		System.out.println("RD");

	}

}

public class AcDemo {
	public static void perform(Account ref) {
		ref.calcInt();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AcDemo.perform(new Saving());
		AcDemo.perform(new Current());
		AcDemo.perform(new RD());
	}

}
