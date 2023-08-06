/*define "ShapeDemo" class with main and perform functions

define perform function in such a way that given any shape it can invoke "draw()" of it.*/
package Clientpro;

import pack1.Circle;
import pack1.Rectangle;
import pack1.Shape;
import pack1.Triangle;

public class ShapeDemo {
	Shape ref;

	public static void perform(Shape ref) {
		ref.draw();
	}

	public static void main(String[] args) {
		perform(new Triangle());
		perform(new Rectangle());
		perform(new Circle());
	}

}
