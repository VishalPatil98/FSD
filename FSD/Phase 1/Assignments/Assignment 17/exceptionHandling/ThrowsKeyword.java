package exceptionHandling;

public class ThrowsKeyword 
{
	public static void division() throws Exception
	{
		int num1=10;
		int num2=0;
		int result = num1/num2;
		System.out.println("Division is :"+result);
	}
	public static void main(String[] args) 
	{
		System.out.println("Using Throws Keyword");
		try 
		{
			division();
		} 
		catch (Exception e) 
		{
			System.out.println("Error Occured"+e);
			//e.printStackTrace();
		}

	}

}
