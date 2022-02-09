package map;
import java.util.HashMap;
public class Hashmap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"Java");
		map.put(2, "Python");
		map.put(3, "C");
		map.put(4, "C++");
		
		System.out.println(map);
		System.out.println("Get Element 3"+map.get(3));
		System.out.println("Size is:"+map.size());
		map.remove(3);
		System.out.println("After Removal :"+map);
		
	}
	

}
