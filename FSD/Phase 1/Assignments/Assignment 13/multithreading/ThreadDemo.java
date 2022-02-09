package multithreading;

public class ThreadDemo extends Thread
{
	 public void run() 
	 {
		for (int i = 0; i <=5; i++)
		{
			System.out.println(i +" "+currentThread().getName());
			try 
			{
			Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		
		}
	 }
	
	public static void main(String[] args) 
	{
		System.out.println("Using Thread Class ");
		ThreadDemo t1 =new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
