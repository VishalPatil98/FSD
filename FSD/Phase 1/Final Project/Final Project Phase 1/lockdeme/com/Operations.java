package lockdeme.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Operations
{
	public static void retriveFiles() throws Exception
	{
		File filedir =new File("C:\\Users\\Vishal\\Desktop\\filee");
		if(filedir.isDirectory())
		{
			List<String> listFile = Arrays.asList(filedir.list());
			System.out.println("List Of Files :");
			Collections.sort(listFile);
			if(listFile.isEmpty())
			{
				System.out.println("No Data Available");
			}
			else
			{
				for(String s:listFile)
				{
					System.out.println(s);
				}				
			}
		}
		else
		{
			System.out.println("No Data Available");
		}
	}
	public static void createfile() throws Exception
	{
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to create: ");
	     String fileName = sc.nextLine();
	     
	     fileName = fileName + ".txt";
	     
	     Path path=Paths.get("C:\\Users\\Vishal\\Desktop\\filee\\"+fileName);
	     
	     try 
	     {
	    	 if(Files.exists(path))
	    	 {
	    		 System.out.println("File Already Exist");
	    	 }
	    	 else
	    	 {
	         Path p = Files.createFile(path); //creates file at specified location  
	         System.out.println("File Created..");
	    	 }
	    }
	       catch(IOException e) 
	     {
	         System.out.println("Exception Occurred:");
	         e.printStackTrace();
	     }
	}
	
	public static void deletefile() throws IOException
	{
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to delete: ");
	     String fileName = sc.nextLine();
	     fileName = fileName + ".txt";
	     fileName.toLowerCase();	 
	     Path path=Paths.get("C:\\Users\\Vishal\\Desktop\\filee\\"+fileName);
	     if(Files.deleteIfExists(path))
	    {
	    	System.out.println("File Deleted");
	    }
	    else
	    	 {
	    		 System.out.println("File Not Deleted");
	    	 }
	}
	
	public static void searchfile() throws IOException
	{
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter file name to search: ");
	     String fileName = sc.nextLine();
	    fileName = fileName + ".txt"; 
	     fileName.toLowerCase();
	     Path path=Paths.get("C:\\Users\\Vishal\\Desktop\\filee\\"+fileName);
	     if(Files.exists(path))
		 {
	    	 System.out.println("File Found");
		 }
		 else
		 {
			 System.out.println("File Not Found");
		 }
	}
	
	
}
