package loginAndLogout;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DashboardServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			String userWithSession= (String) session.getAttribute("key");
			if(userWithSession!=null)
			{
				out.print("<h2>Hello You Are Existing User :"+userWithSession+"</h2>");
				out.print("<a href='logout'><h3>Logout</h3></a>");
			}
		}
		else
		{
			out.print("<h2>Kindly Login First</h2>");
			out.print("<br>");
			out.print("<a href='index.html'><h3>Go To Login</h3></a>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
