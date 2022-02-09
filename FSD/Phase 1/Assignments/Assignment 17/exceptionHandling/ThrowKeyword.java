package exceptionHandling;

import java.util.Scanner;

public class ThrowKeyword
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
            if(b==0)        
                throw(new ArithmeticException("Divide By Zero Not Possible"));
            else
            {
                int result  = a / b;
                System.out.println("Ihe Division is :"+result);
            }

			
		} 
		catch (Exception e)
		{
			System.out.println("Error Ocuured :"+e);
		}
	}

}
