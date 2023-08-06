package ShapePolymorphism;

/*
			 * Define a class “Shape” with “draw()” function . Now derive classes like
			 * “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()”
			 * function. Define a class “ShapeDemo” in which write main() function. In the
			 * main function create a reference to Shape class referring to any of the sub
			 * class. Using this reference, call “draw()” and check the result.
			 */

abstract class Shape {
	abstract public void draw();
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("CIRCLE");
	}

}

class Polygon extends Shape {

	@Override
	public void draw() {
		System.out.println("POLYGON");
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("RECTANGLE");
	}

}

public class ShapeDemo {

	public static void main(String[] args) {

		Shape s1 = new Circle();
		s1.draw();

		Shape s2 = new Polygon();
		s2.draw();

		Shape s3 = new Rectangle();
		s3.draw();
	}

}
