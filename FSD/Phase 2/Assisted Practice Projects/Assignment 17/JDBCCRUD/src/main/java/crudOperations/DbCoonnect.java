package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbCoonnect 
{
	public static Connection getConnect(Properties prop)
	{
		Connection connection=null;
		try 
		{
			String driver=prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			// Loading Driver
			Class.forName(driver);
			// passing parameters 
			connection=DriverManager.getConnection(url,username,password);
			
		}
		catch (Exception e)
		{
			System.out.println("Error Occured"+e);
		}
		
		return connection;
		
	}
}
