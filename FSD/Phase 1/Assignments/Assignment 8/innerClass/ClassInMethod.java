package innerClass;
import java.util.*;
public class ClassInMethod 
{
	public void detail(int age)
	{
		if(age>=18)
		{
			class inner
			{
				void validate()
				{
				System.out.println("Eligible To Vote");	
				}
			}
			inner in=new inner();
			in.validate();
		}
		else
		{
			class newinner
			{
				void validatee()
				{
					System.out.println("Not Eligible To Vote ");
				}
			}
			newinner newin=new newinner();
			newin.validatee();
			
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassInMethod obj=new ClassInMethod();
		System.out.println("Enter Age to Validate :");
		int age=sc.nextInt();
		obj.detail(age);

	}

}
