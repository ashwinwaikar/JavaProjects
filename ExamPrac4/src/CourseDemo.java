
interface Course {
	public abstract void start();
}

class Dac implements Course {

	@Override
	public void start() {
		System.out.println("Dac");
	}

}

class PgDbda implements Course {

	@Override
	public void start() {
		System.out.println("pgDbda");
	}

}

class MSCIT implements Course {

	@Override
	public void start() {
		System.out.println("MSCIT");

	}

}

public class CourseDemo {

	public static void main(String[] args) {
		Course[] arr = new Course[3];
		arr[0] = new Dac();
		arr[1] = new MSCIT();
		arr[2] = new PgDbda();

		for (int i = 0; i < arr.length; i++) {
			arr[i].start();
		}
	}

}
