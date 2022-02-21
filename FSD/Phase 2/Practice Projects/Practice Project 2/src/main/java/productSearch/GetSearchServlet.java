package productSearch;

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

@WebServlet("/detail")
public class GetSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("pname");
		Properties prop=new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		Connection con=Dbconnect.getconnect(prop);
		if(con!=null)
		{
			try 
			{
	
				 PreparedStatement stmt=con.prepareStatement("select * from product where product_name=?");
				 stmt.setString(1, name);
				 ResultSet rs= stmt.executeQuery();
				 out.print("<table border=1 cellspacing=0 cellpadding=10><tr><th>ID</th><th>Name</th><th>Price</th>");
					out.print("<th>Quantity</th></tr>");
				 while(rs.next())
				 {
					 out.print("<tr>");
						out.print("<td>"+rs.getInt(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+
					"<td>"+rs.getBigDecimal(3)+"</td>"+"<td>"+rs.getInt(4)+"</td>");
						out.println("</tr>");
				 }
				 out.println("</table>");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
