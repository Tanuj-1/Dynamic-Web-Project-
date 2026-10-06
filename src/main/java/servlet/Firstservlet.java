package servlet;

import java.io.IOException;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class Firstservlet implements Servlet{

	private ServletConfig servletconfig;

// life cycle method 	
	@Override
	public void init(ServletConfig args0) throws ServletException {
		this.servletconfig=args0;
		System.out.println("Initializing Servlet");
		
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service Request");
			
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying Servlet");
		
	}
// non life cycle methods 
	@Override
	public ServletConfig getServletConfig() {		
		return null;
	}
	
	@Override
	public String getServletInfo() {
		return "This Servlet is return by the author : Tanuj Sharma ";
	}

}
