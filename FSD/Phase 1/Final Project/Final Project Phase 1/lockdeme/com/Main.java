package lockdeme.com;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Operations
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("**************************************************");
		System.out.println("Hello Welcome To Lockme.com..........");
		System.out.println("This Project is developed by Vishal Patil ");
		System.out.println("**************************************************");
		while(true)
		{
			System.out.println("Enter 1 For List Of files");
			System.out.println("Enter 2 For Business Operations");
			System.out.println("Enter 3 For Exit");
			System.out.println("Enter Your Choice:");
			int ch=sc.nextInt();
			if(ch==1)
			{
				try 
				{
					retriveFiles();
					System.out.println("**************************************************");
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			else if(ch==2)
			{
				while(true)
				{
					System.out.println("Enter 1 To Create File");
					System.out.println("Enter 2 To Delete File");
					System.out.println("Enter 3 To Search File");
					System.out.println("Enter 4 To Back");
					System.out.println("Enter Your Choice :");
					int op=sc.nextInt();
					if(op==1)
					{
						try 
						{
							createfile();
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==2)
					{
						try 
						{
							deletefile();
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==3)
					{
						try 
						{
							searchfile();
						} 
						catch (IOException e) 
						{
							e.printStackTrace();
						}
					}
					else if(op==4)
					{
						break;

					}
					else 
					{
						System.out.println("Choose Correct Option");
					}
				}
				System.out.println("**************************************************");
			}
			else if(ch==3)
			{
				System.out.println("**************************************************");
				System.out.println("Exit Done....");
				System.out.println("Thank You");
				System.out.println("**************************************************");
				break;	
			}
			else
			{
				System.out.println("Invalid Selection");
			}
		}

	}


		
}
