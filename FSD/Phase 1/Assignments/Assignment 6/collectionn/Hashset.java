package collectionn;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args)
	{
		HashSet<String> list = new HashSet<String>();
		
		System.out.println("Size "+list.size());
		list.add("English");
		list.add("Math");
		list.add("Physics");
		list.add("CS");
		list.add(null);
		
		System.out.println("After adding elements "+list.size());
		System.out.println(list);
	
		
		System.out.println(list);
		System.out.println("List contains IT? "+list.contains("IT"));
		
		list.remove(0);
		
		System.out.println(list);
		
	
		
		//iterate using iterator	
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
