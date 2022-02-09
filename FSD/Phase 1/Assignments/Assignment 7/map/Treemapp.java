package map;
import java.util.Map;
import java.util.TreeMap;
public class Treemapp {

	public static void main(String[] args) 
	{
TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(9, "c");
		map.put(44, "c++");
		map.put(5, "java");
		map.put(1, null);
		
		System.out.println(map);
		System.out.println("get element 44 "+map.get(44));
		map.remove(1);
		System.out.println(map);
		
		System.out.println("Using For loop :");
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
