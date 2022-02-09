package inheritance;

import classAndObjects.Inheritance1;

public class MyCalculator extends Calculator
{
	public void multiplication(int num1, int num2) 
	   {
		   result = num1 * num2;
	      System.out.println("The multiplication of given numbers:"+result);
	   }
	 public void division(int num1, int num2) 
	   {
		   result = num1 / num2;
	      System.out.println("The division of given numbers:"+result);
	   }
	
	public static void main(String[] args)
	{
		MyCalculator obj =new MyCalculator();
		obj.addition(10, 20);
		obj.Subtraction(100, 30);
		obj.multiplication(5, 2);
		obj.division(50, 5);
	}

}
