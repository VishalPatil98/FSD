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
import javax.servlet.http.HttpSession;

@WebServlet("/teacherdetails")
public class TeacherServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("tname");
		String email=request.getParameter("temail");
		String subject=request.getParameter("tsubject");				
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=Dbconnect.getConnect(prop);
		if(con!=null)
		{
			try
			{
				PreparedStatement stmt=con.prepareStatement("insert into teacher(teacher_name,teacher_email,teacher_subject) values (?,?,?)");
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, subject);
				int rs=stmt.executeUpdate();
				if(rs>0)
				{
					response.sendRedirect("teacher.jsp");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}

	
	
	