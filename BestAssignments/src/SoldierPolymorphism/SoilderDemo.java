package SoldierPolymorphism;

interface Weapon {
	abstract public void attack();
}

class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("Gun attack");
	}

}

class Sord implements Weapon {

	@Override
	public void attack() {
		System.out.println("Sord attack");
	}

}

class Bomb implements Weapon {

	@Override
	public void attack() {
		System.out.println("Bomb attack");
	}

}

class Soldier {
	Weapon ref;// program to interface //just declaring as a variable

	public void fight(Weapon ref) {
		this.ref = ref;
		ref.attack(); // loose coupling // black box reuse
	}
}

public class SoilderDemo {

	public static void main(String[] args) {
		Soldier s = new Soldier();
		s.fight(new Gun());
		s.fight(new Sord());
		s.fight(new Bomb());

	}

}
