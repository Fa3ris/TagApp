package fr.cbox.poc.customtags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HeaderTag extends SimpleTagSupport {
	
	private String locale;
	
	private static final String FILE_PATH = "static/header/header_fr.html";

	
	@Override
	public void doTag() throws JspException, IOException {
			
			StringWriter sw = new StringWriter();
			
			InputStream is = this.getClass().getClassLoader().getResourceAsStream(FILE_PATH);
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			
			 while ((line = br.readLine()) != null) {
                 sw.write(line);
			 }
                 
			JspWriter out = getJspContext().getOut();
			
			out.println(sw.toString());
		
	}
}
