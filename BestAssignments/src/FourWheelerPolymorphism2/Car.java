package FourWheelerPolymorphism2;

interface Engine {
	abstract public void on();
}

class MarutiEngine implements Engine {

	@Override
	public void on() {
		System.out.println("Maruti Engine ON");

	}

}

class HondaEngine implements Engine {

	@Override
	public void on() {
		System.out.println("Honda Engine ON");

	}

}

class BmwEngine implements Engine {

	@Override
	public void on() {
		System.out.println("BMW Engine ON");
	}

}

class Fourwheeler {
	Engine ref;

	void start() {
		System.out.println("Fouwheeler Starts");
	}
}

public class Car extends Fourwheeler {
	Car(Engine ref) {
		this.ref = ref;
		ref.on();
	}

	public void shuru() {
		super.start();
	}

	public static void main(String[] args) {
		Car c = new Car(new BmwEngine());
		c.shuru();

		Car c2 = new Car(new MarutiEngine());
		Car c3 = new Car(new HondaEngine());

	}

}
