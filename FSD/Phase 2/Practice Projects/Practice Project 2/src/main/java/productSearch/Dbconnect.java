package productSearch;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class Dbconnect 
{
	public static Connection getconnect(Properties prop)
	{
		Connection connection=null;
		try 
		{
			String driver=prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			
			// load driver
			Class.forName(driver);
			connection=DriverManager.getConnection(url, username, password);
			
		}
		catch (Exception e)
		{
			System.out.println("Error Occured :"+e);
			e.printStackTrace();
		}
		return connection;
	}
}
