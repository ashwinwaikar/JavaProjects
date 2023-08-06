package tagpack;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UserDate extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		Date date = new Date();
		getJspContext().getOut().print(date);
	}
}
