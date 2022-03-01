package dbOperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbop")
public class DatabaseOperations extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=Dbconnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				out.println("<h1>Database Operations in JDBC</h1>");
				Statement stmt=con.createStatement();
				stmt.execute("create database sample");
				out.println("Database Created");
			
				stmt.execute("use sample");
				out.println("Database is in use");
				
				stmt.execute("drop database sample");
				out.println("Database is dropped");
				
			}
			catch (Exception e) 
			{
				out.print("Error Occured :"+e);
				e.printStackTrace();
			}
			
			
		}
		else
		{
			System.out.println("Error While Connecting");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
