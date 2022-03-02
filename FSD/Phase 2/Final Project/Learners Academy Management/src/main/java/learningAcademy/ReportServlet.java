package learningAcademy;
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

import productSearch.Dbconnect;

@WebServlet("/report")
public class ReportServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.print(" <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">");
		response.setContentType("text/html");
		String pid=request.getParameter("subname");
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=Dbconnect.getConnect(prop);
		out.print("<ul>\r\n"
				+ " 	<li><a href=\"student.jsp\">Student</a></li>\r\n"
				+ " 	<li><a href=\"teacher.jsp\">Teachers</a></li>\r\n"
				+ " 	<li><a href=\"subject.jsp\">Subject</a></li>\r\n"
				+ " 	<li><a class=\"active\" href=\"classes.jsp\">Classes</a></li>\r\n"
				+ " 	<li><a href=\"logout.jsp\">Logout</a></li>\r\n"
				+ "</ul>");
		out.print("<div class='records'>");	
		if(con!=null)
		{
			try 		
			{
				String query="select sub.sub_name,sub.sub_time,t.teacher_name,stud.stud_name"
						+ "     from subject sub"
						+ "     inner join teacher t"
						+ "     on sub.sub_name=t.teacher_subject"
						+ "  	 inner join student stud"
						+ "     on sub.sub_name=stud.stud_subject"
						+ "     where sub.sub_name=?";
				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setString(1, pid);
				ResultSet rs= stmt.executeQuery();				
					out.print("<table><tr><th>Subject</th><th>Time</th><th>Teacher</th>");
					out.print("<th>Students</th></tr>");
					while(rs.next())
					{
					out.print("<tr>");
					out.print("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+
							"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4));;
					out.println("</tr>");
					
				}
					out.println("</table>");
					out.print("</div>");
			} 
			
			catch (Exception e) 
			{
				System.out.println("Error :"+e);
				e.printStackTrace();
			}
		}
		else
		{
			out.print("Error Occured While Connecting To Database");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
