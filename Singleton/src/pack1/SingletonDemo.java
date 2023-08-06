package pack1;

//Developer part
class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	static Singleton getSingleton() {
		return singleton;
	}

	public void disp1() {
		System.out.println("This is Desp 1");

	}

	public void disp2() {

		System.out.println("This is Desp 2");

	}

}

// Client Part
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton ref = Singleton.getSingleton();
		ref.disp1();
		ref.disp2();

	}
}
