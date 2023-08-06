package pack9;

/*
 Define a class “Shape” with “draw()” function.Now derive classes like “Circle”, “Polygon”,”Rectangle” etc. 
 from “Shape” and override “draw()” function.
 Define a class “ShapeDemo” in which write  main() function. 
 In the main function create a reference to Shape class referring to any of the sub class. 
Using this reference, call “draw()” and check the result.
 */

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Polygon extends Shape {
	public void draw() {
		System.out.println("Polygon");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle");
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
