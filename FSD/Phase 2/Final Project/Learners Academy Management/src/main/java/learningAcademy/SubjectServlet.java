package learningAcademy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

@WebServlet("/sub_details")
public class SubjectServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			String userWithSession= (String) session.getAttribute("key");
			if(userWithSession!=null)
			{
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				String name=request.getParameter("subname");
				String stime=request.getParameter("stime");		
				Properties prop=new Properties();
				prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
				Connection con=Dbconnect.getConnect(prop);
				if(con!=null)
				{
					try 
					{
						PreparedStatement stmt=con.prepareStatement("insert into subject(sub_name,sub_time) values (?,?)");
						stmt.setString(1, name);
						stmt.setString(2, stime);
						
						int rs=stmt.executeUpdate();
						if(rs>0)
						{
							response.sendRedirect("subject.jsp");
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
		}
				
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}