package crudOperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatepage")
public class UpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Properties prop=new Properties();
		String param=request.getParameter("id");
		int id=Integer.parseInt(param);
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=DbCoonnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				PreparedStatement stmt=con.prepareStatement("select * from stud_details where id=?");
				stmt.setString(1, param);
				ResultSet rs=stmt.executeQuery();
				if(rs.next())
				{
					out.println("<form action='update' method='post'>");
					out.println("<input type='hidden' name='id' value='"+rs.getString(1)+"'>");
					out.println("First Name:<input type='text' name='fname' value='"+rs.getString(2)+"'>");
					out.println("Last Name:<input type='text' name='lname' value='"+rs.getString(3)+"'>");
					out.println("Mobile Number:<input type='text' name='mob' value='"+rs.getString(4)+"'>");
					out.println("<input type='submit' value='Update Data'></form>");
					
					
				}
				else
				{
					out.print("No User available");
					response.sendRedirect("index.html");
				}
			} 
			catch (Exception e) 
			{;
				System.out.println("Error Occured"+e);
			}
		}
		else
		{
			out.print("Error while connecting");
		}
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
