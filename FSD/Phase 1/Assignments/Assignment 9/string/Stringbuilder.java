package string;

public class Stringbuilder 
{

	public static void main(String[] args) 
	{
		System.out.println("Conversion Of String To String Builder :");
		String str=new String("Hello Everyone..!");
		
		StringBuilder s1=new StringBuilder(str);
		
		System.out.println("Length is :"+s1.length());
		s1.append(" How Are You");
		System.out.println("After Appending :"+s1);
		
		s1.replace(14, 17,"");
		System.out.println("After Removing (..!):"+s1);
		s1.reverse();
		System.out.println("Reversal :"+s1);
		
		
	}

}
