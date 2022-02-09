package collectionn;
import java.util.LinkedHashSet;
public class Linkedhashset
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add(null);
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		set.remove(null);
		
		System.out.println(set);
		
		System.out.println("Using Foreach Loop :");
		for (String s : set) 
		{
			System.out.println(s);
		}

	}

}
