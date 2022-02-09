package classAndObjects;
import java.util.*;
public class ClassAndObjects 

{

	public void getdetails(int id,String name,String department)
	{
		System.out.println("Employee ID is :"+id);
		System.out.println("Employee name is :"+name);
		System.out.println("Department is :"+department);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Empolyee Id :");
		int id=sc.nextInt();
		System.out.println("Enter Empolyee Name :");
		String name= sc.next();
		System.out.println("Enter Empolyee Department :");
		String department=sc.next();
		ClassAndObjects obj=new ClassAndObjects();
		obj.getdetails(id, name, department);

	}

}
