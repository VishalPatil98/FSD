package constructor;
import java.util.*;
public class Student 
{
	int roll;
	String name;
	Student()
	{
		System.out.println("This is Default Constructor ");
	}
	Student(int roll,String name)
	{
		System.out.println("Parameterised Constructor is created :");
		this.roll=roll;
		this.name=name;
		System.out.println("Roll Number is :"+roll);
		System.out.println("Name is :"+name);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter Roll Number :");
		int roll=sc.nextInt();
		System.out.println("Enter Name :");
		String name=sc.next();
		Student s2=new Student(roll,name);
		
		

	}

}
