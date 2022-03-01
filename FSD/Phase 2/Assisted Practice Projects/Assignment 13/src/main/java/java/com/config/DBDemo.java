package com.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBDemo
 */
@WebServlet("/fetch")
public class DBDemo extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out=response.getWriter();
        
        Properties props= new Properties();
        InputStream in= getServletContext().getResourceAsStream("/WEB-INF/config.properties");
        props.load(in);
        Connection conn= DbConfig.getConnect(props);
        
        if(conn!=null)
        {
        	  try 
              	{
      				Statement stmt=conn.createStatement();
      				ResultSet rs= stmt.executeQuery("select * from  eproduct");
      			} 
              catch (Exception e) 
              	{
      			
              	}
      		
        }
        	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
