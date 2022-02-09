package multithreading;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class RunnableThread implements Runnable
{
	
	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(i +" "+Thread.currentThread().getName());
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
		RunnableThread obj=new RunnableThread();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t1.start();
		t2.start();
	}

}
