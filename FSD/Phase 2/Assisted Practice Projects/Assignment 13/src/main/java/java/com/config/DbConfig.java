package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConfig
{
	public static Connection getConnect(Properties props)
	{
		Connection connection=null;
		try 
		{
			//load driver
			Class.forName(props.getProperty("driver"));
			connection=DriverManager.getConnection(props.getProperty("url"),
					props.getProperty("username"),props.getProperty("password"));
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
