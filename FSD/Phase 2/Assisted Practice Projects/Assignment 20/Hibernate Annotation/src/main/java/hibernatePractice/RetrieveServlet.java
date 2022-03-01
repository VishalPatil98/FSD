package hibernatePractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class RetrieveServlet
 */
@WebServlet("/fetch")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		List<Customer> list=session.createQuery("from Customer").list();
		
		for (Cusomer customer : list) 
		{
			out.println(customer.getId()+"  "+customer.getName()+"  "+customer.getEmail()+"  "+customer.getPassword());
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
