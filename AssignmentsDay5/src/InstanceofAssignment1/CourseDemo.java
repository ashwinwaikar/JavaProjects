/*create a hierarchy

				Course

					void start()
					void end()

override "start()" and "end()" in all the child classes.

		MsCit		Basic		Dbda
							void orientation()



write a class "CourseDemo" with main and perform functions

	perform function should be defined in such a way that it can accept any course and invoke "start()" and "end()" functions.

	also make sure if "Dbda" is passed , its "orientation()" method also should be called.*/

package InstanceofAssignment1;

abstract class Course {
	abstract public void start();

	abstract public void end();
}

class MsCit extends Course {

	@Override
	public void start() {
		System.out.println("Start Method of MsCit");
	}

	@Override
	public void end() {
		System.out.println("End Method of MsCit");
	}

}

class Basic extends Course {

	@Override
	public void start() {
		System.out.println("Start Method of Basic");
	}

	@Override
	public void end() {
		System.out.println("End Method of Basic");
	}

}

class Dbda extends Course {

	@Override
	public void start() {
		System.out.println("Start Method of Dbda");
	}

	@Override
	public void end() {
		System.out.println("End Method of Dbda");
	}

	public void orientation() {
		System.out.println("ORIENTATION OF DBDA");
	}

}

public class CourseDemo {

	public static void perform(Course ref) {
		ref.start();
		ref.end();

		if (ref instanceof Dbda) {
			Dbda d = (Dbda) ref;
			d.orientation();
		}
	}

	public static void main(String[] args) {
		perform(new MsCit());
		perform(new Basic());
		//we can do this also since method is static
		CourseDemo.perform(new Dbda());
	}

}
