/* As a developer, write a program to create an arithmetic calculator.*/
package practiceProject;
import java.util.*;

public class ArithmaticCalculator {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		double x=sc.nextDouble();
		System.out.println("Enter Second Number :");
		double y=sc.nextDouble();
		System.out.println("Which Operation You Have To Perform  (+,-,*,/ ):");
		char op=sc.next().charAt(0);
		if(op=='+')
		{
			addition(x,y);
			
		}
		else if (op=='-')
		{
			subtraction(x, y);
			
		}
		else if (op=='*')
		{
			multiplcation(x, y);
		}
		else if (op=='/')
		{
			divison(x, y);
		}
		else
		{
			System.out.println("Invalid Operator..please select (+,-,*,/)");
		}
		
		
		
	}
	public static void addition(double num1,double num2)
	{
		System.out.println("Addition Of "+num1+" and "+num2+" is :"+(num1+num2));
		
	}
	public static void subtraction(double num1,double num2)
	{
		System.out.println("Subtraction Of "+num1+" and "+num2+" is :"+(num1-num2));
		
	}
	public static void multiplcation(double num1,double num2)
	{
		System.out.println("Multiplication Of "+num1+" and "+num2+" is :"+(num1*num2));
		
	}
	public static void divison(double num1,double num2)
	{
		System.out.println("Division Of "+num1+" and "+num2+" is :"+(num1/num2));
		
	}

}
