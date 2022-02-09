package exceptionHandling;

import javax.naming.spi.DirStateFactory.Result;

public class FinallyKeyword
{

	public static void main(String[] args) 
	{
		int num1=10;
		int num2=0;
		int result=0;
		try 
		{
			result=num1/num2;
		} 
		catch (Exception e)
		{
			System.out.println("Error Ocuured :"+e);
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Result is :"+result );
		}

	}

}
