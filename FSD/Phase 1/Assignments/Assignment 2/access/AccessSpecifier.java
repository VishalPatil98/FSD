/*Write a program to demonstrate how and when access modifiers are used.
*/
package access;

public class AccessSpecifier
{

	void DefaultMethod()
	{
		System.out.println("This is Default Method");
	}
	
	public void PublicMethod()
	{
		System.out.println("This is Public Method");
	}
	protected void ProtectedMethod()
	{
		System.out.println("This is Protected Method");
	}
	
	private void PrivateMethod()
	{
		System.out.println("This is Private Method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("...............Same Class Same Package............");
		AccessSpecifier obj=new AccessSpecifier();
		obj.DefaultMethod();
		obj.PublicMethod();
		obj.PrivateMethod();
		obj.ProtectedMethod();
	}

}
