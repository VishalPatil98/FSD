package loginAndLogout;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public UserLogin() 
    {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		 PrintWriter out = response.getWriter();  
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 String id = "vishal@gmail.com";
		 String pass = "admin";
		 if(email.equals(id) && password.equals(pass))
		 {
			 HttpSession session=request.getSession();
			 session.setAttribute("key", email);
			 response.sendRedirect("dashboard");
		 }
		else 
		{
				response.sendRedirect("error");
		}
	}
}
