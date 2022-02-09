package practiceProject;
import java.util.*;
public class EmailValidation 
{
	
	public static void main(String[] args) 
	{
		EmailValidation obj=new EmailValidation();
		Scanner sc=new Scanner(System.in);
		ArrayList<String> emailids= new ArrayList<String>();
		emailids.add("varad@gmail.com");
		emailids.add("rohan@gmail.com");
		emailids.add("sachin@gmail.com");
		System.out.println("Enter You Email-id :");
		String mail=sc.next();
		if(emailids.contains(mail))
		{
			System.out.println("Email id Authenticated");
		}
		else
		{
			System.out.println("Email id Not Authenticated");
		}
		
	}

}
