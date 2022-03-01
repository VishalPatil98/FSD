package loginandlogout;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{ 
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		String uname="vishal";
		String upass="admin";
		if(name.equals(uname) && pass.equals(upass))
		{
			
	
		HttpSession session=request.getSession();
		session.setAttribute("registerd", name);
		
		response.sendRedirect("dashboard");
		
		}
		else
		{
			System.out.println("Invalid Details");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
