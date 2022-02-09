package exceptionHandling;
import java.util.*;
public class Trycatch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		try 
		{
			int result=a/b;
			System.out.println("Division is : "+result);
		} 
		catch (Exception e)
		{
			System.out.println("Error Ocuured :"+e);
		}
		

	}

}
