package BasicInterface;

/*
 9) create interface "Game" , have an abstract method "play()". 
 from this interface implements classes  like "Cricket" , "FootBall" and "Tennis".
Now Define one more class public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter inside "perform()"
see to it that any child object passed ,its "play()" method should be invoked. 
Call "perform()" method from main function.

 */

interface Game {
	abstract public void play();
}

class Cricket implements Game {

	@Override
	public void play() {
		System.out.println("PLAY CRICKET");

	}

}

class Football implements Game {

	@Override
	public void play() {
		System.out.println("PLAY FOOTBALL");
	}

}

class Tennis implements Game {

	@Override
	public void play() {
		System.out.println("PLAY TENNIS");
	}

}

public class Demo {

	public static void perform(Game ref) {
		ref.play();
	}

	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
		System.out.println("MAIN ENDS");
	}

}
