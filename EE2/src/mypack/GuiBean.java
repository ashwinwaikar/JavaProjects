package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "guibean")
public class GuiBean {
	@Autowired
	@Qualifier("circle")
	private Shape shape;

	public void execute() {
		shape.draw();
	}
}
