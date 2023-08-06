package mypack;

import org.springframework.stereotype.Component;

@Component(value = "triangle")
public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle");

	}

}
