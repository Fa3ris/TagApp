package fr.cbox.poc.customtags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MessageTag extends SimpleTagSupport {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public void doTag() throws JspException, IOException {
		try {
			
			JspWriter out = getJspContext().getOut();
			
			StringWriter sw = new StringWriter();
			JspFragment body = getJspBody();
			sw.append("<h1>");
			body.invoke(sw);
			sw.append(message);	
			sw.append("</h1>");
			
			out.println(sw.toString());
		} catch (JspException e) {
			
		}
		
	}

	
}
