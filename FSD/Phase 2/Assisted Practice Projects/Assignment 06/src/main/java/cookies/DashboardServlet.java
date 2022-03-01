package cookies;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		boolean found=false;
		if(c!=null)
		{
			for (int i = 0; i < c.length; i++)
			{
				Cookie ck=c[i];
				if(ck.getName().contentEquals("registered") && ck.getValue()!=null)
				{
					out.print("User found "+ck.getName()+"<br>");
					found=true;
				}
				
			}
		}
		if(!found)
		{
			out.print("Please Go and register");
			response.sendRedirect("login");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
