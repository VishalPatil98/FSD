package filehandle;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class FileCreateWrite 
{
	public static void createUsingFileClass() throws IOException
	{
		System.out.println("File Created Using File Class-");
		File myfile=new File
				("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text1.txt");
		if(myfile.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File Already Exist");
		}
		
		System.out.println("Writing To The File.......");
		// appending to existing file
		FileWriter mywrite=new FileWriter(myfile,true);
		mywrite.write(" How Are You..");
		mywrite.close();
		System.out.println("Written....!!");
	}
	
	//////////////////////////////////////////////////////////////////////////
	
	public static void createUsingFileOutput() throws IOException
	{
		System.out.println("Using File Output Stream..");
		FileOutputStream fout=new FileOutputStream
		("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text2.txt");
		
		String input="This is Second File";
		byte array[]=input.getBytes();
		fout.write(array);
		System.out.println("Data Written Successfully");
		fout.close();
		
	}
	////////////////////////////////////////////////////////////////////////////////
	
	public static void creaeusingNioClass() throws IOException
	{
		System.out.println("Created Using NIO Stream ");
		Path path=Paths.get("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text3.txt");
		// Writing to the file
		
		String input="  Created Using NIO Class  ";
		byte array[]=input.getBytes();
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		
		// Writting using list
	
		Path path1= Paths.get("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text4.txt");
		List<String> list=Arrays.asList("This is first line","This is second line","This is third line");
		Files.write(path1, list,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			//createUsingFileClass();
			createUsingFileOutput();
			//creaeusingNioClass();
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
