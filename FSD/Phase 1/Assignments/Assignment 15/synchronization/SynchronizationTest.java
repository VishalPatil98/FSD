package synchronization;

public class SynchronizationTest 
{

	public static void main(String[] args) 
	{
		Sender sender=new Sender();
		
		User t1= new User("Vishal", "Hello Everyone...!", sender);
		
		User t2= new User("Ravikant", "Hii...!", sender);
		
		t1.start();
		t2.start();
	}

}
