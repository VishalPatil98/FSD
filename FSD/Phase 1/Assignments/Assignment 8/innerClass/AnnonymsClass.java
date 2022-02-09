package innerClass;

public class AnnonymsClass 
{

	public static void main(String[] args) 
	{
		System.out.println("Annonyms Inner Class..");
		Car c1= new Car()
		{
			public void start() 
			{
				System.out.println("Car Started...");
			}
			public void stop() 
			{
				System.out.println("Car Stopped..");				
			}
			
			public void carcolor()
			{
				System.out.println("Color of car is white");				
			}
		};
		
		c1.carcolor();
		c1.start();
		c1.stop();

	}

}
