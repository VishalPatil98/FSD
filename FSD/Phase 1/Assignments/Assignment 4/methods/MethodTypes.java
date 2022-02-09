package methods;

public class MethodTypes 
{
	public static void addition(double num1,double num2)
	{
		System.out.println("Addition Of "+num1+" and "+num2+" is :"+(num1+num2));
		
	}
   public static int subtraction(int num1,int num2)
	{
	   System.out.println("Method With Return type ");
	   int result= num1 - num2;
		
		return result;
		
	}
  public static double multiplication(double num1,double num2)
  	{
  	   System.out.println("Method With Return type  Double");
  	   double result= num1 * num2;
  		
  		return result;
  		
  	}
   static float division(float num1,float num2)
 	{
 	   System.out.println("Method With Return type  Float");
 	   float result= num1 / num2;
 		
 		return result;
 		
 	}
	
	
public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int x=10;
		int y=50;
		
		addition(x, y);
		System.out.println("Subtraction is :"+subtraction(x, y));
		System.out.println("Multiplication is : "+multiplication(x, y));
		System.out.println("Division  is : "+division(x, y));
		

	}
	
	
}
