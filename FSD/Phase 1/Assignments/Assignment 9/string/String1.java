package string;
public class String1 {

	public static void main(String[] args) 
	
	{
		String str=new String("Full Stack Developer");
		System.out.println(str);
		System.out.println("charcter at 6 is :"+str.charAt(6));
		
		System.out.println("String in lower case : "+ str.toLowerCase());
		System.out.println("String in upper case :"+str.toUpperCase());
		System.out.println("Original String :"+str);
		System.out.println("Length of string is :"+str.length());
		System.out.println("String Ending wirh r ?"+str.endsWith("r"));
		System.out.println("String Ending wirh p ?"+str.endsWith("p"));
		
		
		String s1= "Full Stack Developer";
		
		if(s1.equals(str))
		{
			System.out.println("String Matched..");
		}
		else
		{
			System.out.println("Not Matched...");
		}
		System.out.println("Ignore Case sensitivity ");
		
		String s2= str.toLowerCase();
		System.out.println(s2);
		if(s2.equalsIgnoreCase(str))
		{
			System.out.println("String Matched..");
		}
		else
		{
			System.out.println("Not Matched...");
		}
		
		
	}

}
