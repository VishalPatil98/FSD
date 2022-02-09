package collectionn;
import java.util.TreeSet;
public class Tree 
{

	public static void main(String[] args)
	{
		TreeSet<Integer> list=new TreeSet<Integer>();
		list.add(25);
		list.add(55);
		list.add(100);
		list.add(444);
		
		System.out.println(list);
		System.out.println("Size: "+list.size());
		System.out.println("Contains  100 ?"+list.contains(100));

	}

}
