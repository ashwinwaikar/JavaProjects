package pack1;

/*
 6) create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it. ( Cricket, Chess and Football )
	Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
	In this class try to call the play() method of the class which is passed to it.
  */
interface Game {
	void play();
}

class Cricket implements Game {

	@Override
	public void play() {
		System.out.println("Play Cricket");
	}

}

class Chess implements Game {

	@Override
	public void play() {
		System.out.println("Play Chess");
	}

}

class Football implements Game {

	@Override
	public void play() {

		System.out.println("Play Football");
	}

}

class Genu<Asw extends Game> {
	Asw a;

	public Genu(Asw a) {
		this.a = a;
	}

	public void perform() {
		a.play();
	}
}

public class Test6 {

	public static void main(String[] args) {
		Genu<Cricket> g1 = new Genu<Cricket>(new Cricket());
		g1.perform();

		Genu<Chess> g2 = new Genu<Chess>(new Chess());
		g2.perform();

		Genu<Football> g3 = new Genu<Football>(new Football());
		g3.perform();
	}

}
