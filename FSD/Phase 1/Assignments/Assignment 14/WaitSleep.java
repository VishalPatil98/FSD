package multithreading;

public class WaitSleep 
{
	private static Object LOCK = new Object();
	public static void main(String[] args)
	{
		try 
		{
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is woke up after"
					+ "2 second of sleep");
			
			synchronized (LOCK)
			{
				LOCK.wait(4000);
				System.out.println("Object is woke up after wait of 4 seconds");
			}
		} catch (InterruptedException e) 
		{
			System.out.println("Error occured "+e);
		}

	}

}
