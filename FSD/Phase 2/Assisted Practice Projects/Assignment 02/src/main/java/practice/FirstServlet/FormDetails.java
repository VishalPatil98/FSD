package practice.FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		String Firstname=req.getParameter("uname");
		String Lastname=req.getParameter("lname");
		
		out.println("First Name is :"+Firstname);
		out.println("Last Name is :"+Lastname);
		
	}
}
