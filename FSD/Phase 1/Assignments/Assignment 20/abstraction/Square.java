package abstraction;

public class Square extends Shape
{
	private double side;
	
	public Square(String color,double side)
	{
		super(color);
		this.side=side;
	}
	
	double area()
	{
		return side * side;
	}

	
	public String toString() {
		return "Square color is :"+ getColor() +" and area is :"+area();
	}
	
}
