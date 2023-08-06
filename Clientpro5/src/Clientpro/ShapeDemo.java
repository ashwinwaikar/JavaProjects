package Clientpro;

import pack1.Circle;
import pack1.Rectangle;
import pack1.Shape;
import pack1.Triangle;

/*define "ShapeDemo" class with main function

create an array of "Shape" with 3 elements. store objects of Triangle,Rect and Circle in this array. 
now traverse the array and invoke "draw()" of each child.
*/
public class ShapeDemo {

	public static void main(String[] args) {
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Rectangle();
		arr[2] = new Circle();

		for (int i = 0; i < arr.length; i++) {
			arr[i].draw();
		}
	}

}
