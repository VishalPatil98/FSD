package map;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) 
	{
		Hashtable<Integer,Integer> map=new Hashtable<Integer,Integer>();
		
		map.put(1,10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		System.out.println(map);
		System.out.println("get element 3 "+map.get(3));
		//iterate using for loop
				for(Map.Entry m :map.entrySet())
				{
					System.out.println(m.getKey()+" "+m.getValue());
				}
	}

}
