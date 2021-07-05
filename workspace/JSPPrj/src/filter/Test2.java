package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Test2 implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, 
			ServletResponse arg1, 
			FilterChain arg2)
			throws IOException, ServletException {
		
		
		arg2.doFilter(arg0, arg1);
		
	}

}
