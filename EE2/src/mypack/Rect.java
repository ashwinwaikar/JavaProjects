package mypack;

import org.springframework.stereotype.Component;

@Component(value = "rect")
public class Rect implements Shape {

	@Override
	public void draw() {
		System.out.println("Rect");

	}

}
