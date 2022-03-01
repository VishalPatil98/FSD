package genricServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.catalina.connector.Response;

public class Genric extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter out=res.getWriter();
		out.print("This is Genric Servlet..");
		
	}
	
}
