package filehandle;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileHandliing
{
	public static Boolean createFile()
	{
		//Creating File
		try
		{
			File f = new File("C:\\Users\\Vishal\\Desktop\\filee\\FileByCode.txt");
			if(f.createNewFile())
			{
				System.out.println("File Created Successfully");
			}
			else
			{
				System.out.println("File Already Exists...Opening the File");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception occured "+e);
			return false;
		}
		//Writing in file
		try
		{
			File f = new File("C:\\Users\\Vishal\\Desktop\\filee\\FileByCode.txt");
			FileWriter writer= new FileWriter(f);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the message you want to add to file: ");
			String msg = sc.nextLine();
			writer.write(msg);
			writer.close();
			if(f.canWrite())
				System.out.println("This content is write to file : "+msg);
		}
		catch(IOException e)
		{
			System.out.println("Exception occured "+e);
			return false;
		}
		return true;
	}
	
	public static List<String> readFile(String fileName)
	{
		
		List<String> list= Collections.emptyList();
		try {
			list= Files.readAllLines(Paths.get(fileName));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		return list;
	}
	
	public static void appendFile(String fileName, String str) throws IOException
	{
		try {
		   BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Vishal\\Desktop\\filee\\FileByCode.txt", true));
		   out.write(str);
		   out.close();
	   }
	   catch (IOException e) {
		   System.out.println("exception occurred" + e);
	   }
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Below are some File Operations choose one of them: ");
			System.out.println("1. Create and Write File");
			System.out.println("2. Read File");
			System.out.println("3. Append File");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice :");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				createFile();
			}
			
			else if(choice == 2)
			{
				List<String> result= readFile("C:\\Users\\Vishal\\Desktop\\filee\\FileByCode.txt");
				Iterator<String> it= result.iterator();
				System.out.println();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
			}
			
			else if(choice == 3)
			{
				Scanner scan= new Scanner(System.in);
				System.out.println("Enter string to append : ");
				String data1= scan.nextLine();
				appendFile("C:\\Users\\Vishal\\Desktop\\filee\\FileByCode.txt", data1);
			}
			
			else if(choice == 4)
			{
				break;
			}
			
			else
			{
				System.out.println("Invalid Choice");
			}
		}
	}
}
