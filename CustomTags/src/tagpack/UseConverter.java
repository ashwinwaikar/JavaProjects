package tagpack;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UseConverter extends SimpleTagSupport {
	public String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	static void toggle(char str[]) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'A' && str[i] <= 'Z')
				str[i] = (char) (str[i] + 'a' - 'A');
			else if (str[i] >= 'a' && str[i] <= 'z')
				str[i] = (char) (str[i] + 'A' - 'a');
		}
	}

	public void doTag() throws JspException, IOException {
		char str[] = this.getVal().toCharArray();
		toggle(str);
		getJspContext().getOut().print(String.valueOf(str));

	}
}
