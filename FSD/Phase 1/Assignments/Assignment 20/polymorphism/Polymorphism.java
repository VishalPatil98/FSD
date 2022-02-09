package polymorphism;

public class Polymorphism {
	
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	public int add(int num1, int num2,int num3)
	{
		return num1+num2+num3;
	}
    public double add(double num1, double num2) 
    { 
        return num1+num2; 
    } 


	public static void main(String[] args) 
	{
		Polymorphism obj=new Polymorphism();
		System.out.println("Sum of two numbers is :"+obj.add(10, 20));
		System.out.println("Sum of three numbers is :"+obj.add(10, 20,30));
		System.out.println("Sum of two numbers is :"+obj.add(10,20.5));
		

	}

}
