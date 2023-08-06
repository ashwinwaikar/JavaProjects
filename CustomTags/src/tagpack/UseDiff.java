package tagpack;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UseDiff extends SimpleTagSupport {
	private int first;
	private int second;

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int difference() {
		int a = this.getFirst();
		int b = this.getSecond();
		return a - b;

	}

	public void doTag() throws JspException, IOException {
		getJspContext().getOut().print(difference());

	}

}
