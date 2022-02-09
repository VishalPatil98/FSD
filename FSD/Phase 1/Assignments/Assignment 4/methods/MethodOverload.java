package methods;

public class MethodOverload {

	public int addition(int a,int b)
	{
		System.out.println("Method with Two Parameres ");
		return a+b;
	}
	public int addition(int a,int b,int c)
	{
		System.out.println("Method Overloaded Three Parameters");
		return a+b+c;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverload obj=new MethodOverload();
		System.out.println(obj.addition(20, 50));
		System.out.println(obj.addition(20, 10, 60));
		
		
	}

}
