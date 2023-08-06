package Dynamicpolymorphism;

abstract class Top1 {
	abstract public void disp1();
}

class Bottom1 extends Top1 {

	@Override
	public void disp1() {
		System.out.println("DISPLAY 1");
	}

}

class Bottom2 extends Top1 {

	@Override
	public void disp1() {
		System.out.println("DISPLAY 2");
	}

}

class Bottom3 extends Top1 {

	@Override
	public void disp1() {
		System.out.println("DISPLAY 3");
	}

}

public class Test6 {

	static void perform(Top1 ref) {
		ref.disp1();
	}

	public static void main(String[] args) {
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());

	}

}
