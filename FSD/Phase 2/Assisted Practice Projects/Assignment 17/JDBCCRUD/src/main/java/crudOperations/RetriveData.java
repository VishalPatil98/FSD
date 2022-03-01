package crudOperations;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class RetriveData extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=DbCoonnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				Statement stmt=con.createStatement();
				out.print("<h1>STUDENT DETAILS</h1>");
				ResultSet rs= stmt.executeQuery("select * from stud_details");
				while(rs.next())
				{
					out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+" "
				+"<a href='updatepage?id="+rs.getInt(1)+"'>Update </a>"
				+"<a href='delete?id="+rs.getInt(1)+"'>Delete</a><br>");
					
				}
				
			} 
			catch (Exception e)
			{
				System.out.println("Error Occured "+e);
				e.printStackTrace();
			}
			
		}
		else
		{
			out.print("Connection Not Established");
		}
	}
 void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
 	{
		doGet(request, response);
	}

}
