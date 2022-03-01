package crudOperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class InsertData extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		int mob=Integer.parseInt(request.getParameter("mob"));
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=DbCoonnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				PreparedStatement stmt=con.prepareStatement("insert into stud_details(fname,lname,mob) values (?,?,?)");
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setInt(3, mob);
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					out.print("<h1> Data Inserted </h1>");
					//response.sendRedirect("fetch");
					
				}
				else
				{
					out.print("<h1> Data Not Inserted </h1>");
				}
			} 
			catch (Exception e) 
			{
				System.out.println("Error Occured :"+e);
			}
		}
		else
		{
			out.print("Connection Not Established");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
