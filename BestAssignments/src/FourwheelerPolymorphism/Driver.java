package FourwheelerPolymorphism;

interface Fourwheeler {
	abstract public void start();
}

class Car implements Fourwheeler {

	@Override
	public void start() {
		System.out.println("Car Starts");
	}

}

class Bus implements Fourwheeler {

	@Override
	public void start() {
		System.out.println("Bus Starts");
	}

}

class Truck implements Fourwheeler {

	@Override
	public void start() {
		System.out.println("Truck Starts");
	}
}

public class Driver {
	Fourwheeler ref; // program to interface //just declaring as a variable

	public void ride(Fourwheeler ref) {
		this.ref = ref;
		ref.start(); // loose coupling // black box reuse
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		d.ride(new Bus());
		d.ride(new Car());
		d.ride(new Truck());

	}

}
