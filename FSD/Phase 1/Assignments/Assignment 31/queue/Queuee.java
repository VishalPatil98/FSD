package queue;
import java.util.*;
public class Queuee 
{
	public static void main(String[] args)
	{
		Queue<String> locationsQueue = new LinkedList<>();
		
		locationsQueue.add("Mumbai");
		locationsQueue.add("Pune");
		locationsQueue.add("Nashik");
		locationsQueue.add("Delhi");
		locationsQueue.add("Banglore");
		locationsQueue.add("Ahemdabaad");
		locationsQueue.add("Thane");
		System.out.println("Size of Queue is:"+locationsQueue.size());
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
