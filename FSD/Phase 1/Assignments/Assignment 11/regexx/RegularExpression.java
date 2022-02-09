package regexx;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpression 
{
	public static void main(String[] args) 
	{
		  String pattern ="[890]{1}[0-9]{8}[1-2]{1}";//start with [8,9,0] and ending with[1 or 2]
	      Pattern p=Pattern.compile(pattern);
	      Matcher match=p.matcher("9012365799");
	      if(match.matches()) 
	      {
	    	  System.out.println("MATCHED...");
	      }
	       else 
	       {
	       
	          System.out.println("NOT MATCHED...");
	       }

	}

}
