package encapsulation;

public class Employee

{
	private int id;
	private String name;
	private double salary;
	
	
	public int getId() 
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary()
	{
		return salary;
	}


	public void setSalary(double salary)
	{
		this.salary = salary;
	}


	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.setId(20);
		emp.setName("varad");
		emp.setSalary(50000);
		
		System.out.println("Employee ID is :"+emp.getId());
		System.out.println("Employee Name is :"+emp.getName());
		System.out.println("Employee Salary is:"+emp.getSalary());
	}

}
