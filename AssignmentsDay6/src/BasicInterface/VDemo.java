/*
10)	Define an interface “Vechicle” with “start()” function . Now derive  classes like “TwoWheeler”, 
“ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function.
	Define a class “VDemo” in which  write  main()  function. 
	In the main function create a reference to Vehicle  class referring to any of the sub class. 
	Using this reference, call “start" method.*/
package BasicInterface;

interface Vehicle {
	abstract public void start();
}

class TwoWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("TWO WHEELER");
	}

}

class ThreeWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("THREE WHEELER");
	}

}

class FourWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("FOUR WHEELER");
	}

}

public class VDemo {

	public static void main(String[] args) {
		Vehicle v1 = new ThreeWheeler();
		v1.start();

		Vehicle v2 = new TwoWheeler();
		v2.start();
	}

}
