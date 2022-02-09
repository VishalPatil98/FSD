package collectionn;
import java.util.ArrayList;
public class Arraylistt {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Size Before Adding Elements :"+list.size());
		list.add("Maths");
		list.add("Physics");
		list.add("Chemistry");
		list.add("English");
		System.out.println(list);
		System.out.println("Size After Adding Elements :"+list.size());
		list.remove(1);
		System.out.println("After Removing Second Element :");
		System.out.println(list);
		list.add(0,"Cs");
		System.out.println("After Inserting Element to first position :");
		System.out.println(list);
		list.add("IT");
		System.out.println(list);
		System.out.println("Retriving Using foreach loop :");
		for (String s : list)
		{
			System.out.println(s);
		}

	}

}
