package collectionn;
import java.util.Vector;
import java.util.Iterator;
public class Vectors 
{

	public static void main(String[] args)
	{
		Vector<String> list = new Vector<String>();
		
		System.out.println("Size "+list.size());
		list.add("English");
		list.add("Math");
		list.add("Physics");
		list.add("CS");
		list.add(null);
		
		System.out.println("After adding elements "+list.size());
		System.out.println(list);
		System.out.println("elemnt at Index 4: "+list.get(4));
		list.add(4, "IT");
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
