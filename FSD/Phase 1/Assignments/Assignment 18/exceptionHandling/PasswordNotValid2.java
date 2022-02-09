package exceptionHandling;

public class PasswordNotValid2 
{

	static void check(String passwordd) throws PasswordNotValid
	{
		if(passwordd.length()<7)
			throw (new PasswordNotValid("Enter Strong Password"));
		else
			System.out.println("Strong Password");
	}
	
	public static void main(String[] args) {
		
		try {
			check("Datasciencee");
			
		} catch (PasswordNotValid e) {
			
			System.out.println(e);
		}
	}
}
