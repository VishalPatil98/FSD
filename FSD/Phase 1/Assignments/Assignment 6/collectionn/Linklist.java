package collectionn;
import java.util.LinkedList;
public class Linklist {

	public static void main(String[] args) 
	
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(25);
		list.add(55);
		list.add(100);
		list.add(444);
		
		System.out.println("Items Of Linkedlist Are :"+list);
		list.add(1, 00);
		System.out.println("After Inserting Element to first position :"+list);
		System.out.println("First Element is :"+list.getFirst());
		System.out.println("Last Element is :"+list.getLast());
		
		System.out.println("Byusing Foreach Loop :");
		for (Integer a : list)
		{
			System.out.println(a);
		}
	}

}
