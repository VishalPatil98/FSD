package servletinterfaces;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class ServletInterfaces implements Servlet
{
	private ServletConfig config=null;
	@Override
	public void destroy() 
	{
		config=null;
		System.out.println("destroy called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init called");
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		
		System.out.println("Service called");
		PrintWriter out=resp.getWriter();
		out.println("This is my servlet");
		out.println("Servlet Interfaces");
	}

	
}
