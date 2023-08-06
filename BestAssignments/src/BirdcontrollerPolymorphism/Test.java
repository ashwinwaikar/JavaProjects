package BirdcontrollerPolymorphism;

interface Bird {
	abstract public void move();
}

class Penguin implements Bird {

	@Override
	public void move() {
		System.out.println("Penguin Move");
	}

}

class Robin implements Bird {

	@Override
	public void move() {
		System.out.println("Robin Move");
	}

}

class Joy implements Bird {

	@Override
	public void move() {
		System.out.println("Joy Move");
	}

}

class BirdController {
	Bird ref;

	void canmove(Bird ref) {
		this.ref = ref;
		ref.move();
	}

}

public class Test {

	public static void main(String[] args) {
		BirdController b = new BirdController();
		b.canmove(new Penguin());
		b.canmove(new Robin());
		b.canmove(new Joy());
	}

}
