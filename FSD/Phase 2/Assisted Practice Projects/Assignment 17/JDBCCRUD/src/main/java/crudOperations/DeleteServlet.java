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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String param=request.getParameter("id");
		int id=Integer.parseInt(param);
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con = DbCoonnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				PreparedStatement stmt=con.prepareStatement("delete from stud_details where id=?");
				stmt.setInt(1, id);
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					out.print(rs+"Deleted Successflly");
				}
				else
				{
					out.print("Not Deleted");
				}
				
			} 
			catch (Exception e) 
			{
				out.print("Error Occured"+e);
			}
		}
		else
		{
			out.print("ERROR OCCURED");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
