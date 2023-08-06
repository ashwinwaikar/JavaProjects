package mypack;


public class Soldier {
		
		private Weapon weapon;
		
		void perform()
		{
			weapon.attack();
		}

		public Weapon getWeapon() {
			return weapon;
		}

		public void setWeapon(Weapon weapon) {
			this.weapon = weapon;
		}
		
		
}
