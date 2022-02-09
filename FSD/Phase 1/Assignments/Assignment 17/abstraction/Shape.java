package abstraction;

public abstract class Shape 
{
	private String color;
	private double area();
	
	public Shape(String color)       // constructor
	{
		this.color=color;
	}

	public String getColor()
	{
		return color;
	}
	
}
