package mypack;

public class Soldier {

	private Weapon weapon;

	public Soldier(Weapon weapon) {
		super();
		this.weapon = weapon;
		System.out.println("The attack is");
		perform();
	}

	void perform() {
		weapon.attack();
	}
}
