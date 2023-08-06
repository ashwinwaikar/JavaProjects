/*
2) create a class "Vehicle", define a method "public void start()" in it. 
From this class derive a class FourWheeler. How will u override "start()" method of parent class ?
*/
package Basicoverriding2;

class Vehicle {
	public void start() {
		System.out.println("Vehicle Start method");
	}
}

class FourWheeler extends Vehicle {
	@Override
	public void start() {
		super.start();
		System.out.println("FourWheeler Start method");

	}

}

public class Test3 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		FourWheeler f = new FourWheeler();
		Vehicle v2 = new FourWheeler();

		v1.start();
		f.start();
		v2.start();
	}

}
