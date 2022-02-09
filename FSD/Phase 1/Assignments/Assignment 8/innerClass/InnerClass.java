package innerClass;

public class InnerClass 
{
	int a=10;
	int b=30;
	class inner
	{
		void get()
		{
			System.out.println("A is :"+a);
			System.out.println("B is :"+b);
		}
	}

	public static void main(String[] args)
	{
		InnerClass in=new InnerClass();
		InnerClass.inner obj= in.new inner();
		obj.get();

	}

}
