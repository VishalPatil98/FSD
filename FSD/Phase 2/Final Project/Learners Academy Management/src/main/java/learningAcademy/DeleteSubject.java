package learningAcademy;
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
@WebServlet("/deletesub")
public class DeleteSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		int id= Integer.parseInt(request.getParameter("sub_id"));
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con = Dbconnect.getConnect(prop);
		if(con!=null)
		{
			try 
			{
				PreparedStatement stmt=con.prepareStatement("delete from subject where sub_id=?");
				stmt.setInt(1, id);
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					response.sendRedirect("subject.jsp");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
