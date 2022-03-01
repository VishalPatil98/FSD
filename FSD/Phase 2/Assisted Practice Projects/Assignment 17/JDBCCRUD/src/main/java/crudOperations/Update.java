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

@WebServlet("/update")
public class Update extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String mob=request.getParameter("mob");
		String param=request.getParameter("id");
		int id=Integer.parseInt(param);
		
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con = DbCoonnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				PreparedStatement stmt=con.prepareStatement("update stud_details set fname=?,lname=?,mob=?  where id=?");
				
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, mob);
				stmt.setInt(4, id);
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					out.print("Data Updated");
					out.print("<br>");
					out.println();
					
				}
				else
				{
					out.print("No Data Updated");
				}
				
			} 
			catch (Exception e)
			{
			out.print("Error :"+e);
			e.printStackTrace();
			}
		}
		else
		{
			out.print("Error While Connecting");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
