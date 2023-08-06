package mypack;

import org.springframework.stereotype.Component;

@Component(value = "circle")
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
