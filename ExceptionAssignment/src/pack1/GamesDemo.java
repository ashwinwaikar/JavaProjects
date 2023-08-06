package pack1;
/*1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class) 
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
*/

abstract class Game {
	public abstract void play();
}

class Football extends Game {

	@Override
	public void play() {
		System.out.println("Football Play method");
	}

}

class Cricket extends Game {

	@Override
	public void play() {
		System.out.println("Cricket play method");
	}

}

class Tennis extends Game {

	@Override
	public void play() {
		System.out.println("Tennis play method");
	}

}

public class GamesDemo {

	public static void main(String[] args) {
		Game arr[] = new Game[3];

		arr[0] = new Football();
		arr[1] = new Cricket();
		arr[2] = new Tennis();

		for (int i = 0; i < arr.length; i++) {
			arr[i].play();
		}
	}

}
