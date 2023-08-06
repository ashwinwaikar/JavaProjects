/*create a hierarchy

				Animal

					void makeSound()
					
override "makeSound()" in all the child classes.

		Dog		Cat		Tiger
							void hunting()



write a class "AnimalDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.

	also make sure if "Tiger" is passed , its "hunting()" method also should be called.*/


package InstanceofAssignment2;

abstract class Animal {

	abstract public void makesound();

	public void run() {
		System.out.println("RUN TUBUK TUBUK");
	}

}

class Dog extends Animal {

	@Override
	public void makesound() {
		System.out.println("BHOO BHOOO....");
	}

}

class Cat extends Animal {

	@Override
	public void makesound() {
		System.out.println("MEOW MEOWW....");

	}

}

class Tiger extends Animal {

	@Override
	public void makesound() {
		System.out.println("ROARRRRR...");

	}

	public void hunting() {
		System.out.println("TIGER HUNTS");

	}

}

public class AnimalDemo {

	public static void perform(Animal ref) {
		ref.makesound();

		if (ref instanceof Tiger) {
			Tiger t = (Tiger) ref;
			t.hunting();
		}
	}

	public static void main(String[] args) {
		perform(new Dog());
		perform(new Tiger());
		perform(new Cat());

		Animal a = new Cat();
		a.run();
	}

}
