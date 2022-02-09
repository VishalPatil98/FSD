package filehandle;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{
	public static void ReadusingFileReader() throws IOException
	{
		
		FileReader reader= new FileReader("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text1.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
			
	}
	///////////////////////////////////////////////////////////////////////////////
	public static void UsingFileInputStream() throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text1.txt");
		int data;
		while((data=fin.read())!=-1)
		{
			System.out.print((char)data);
		}
	}
	////////////////////////////////////////////////////////////////////////////////
	public static void UsingNIO() throws IOException
	{
		List<String> list=Collections.emptyList();
		
		
		Path path=Paths.get("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text4.txt");
		// read using list
		
		list=Files.readAllLines(path);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) 
	{
		try 
		{
			//ReadusingFileReader();
			//UsingFileInputStream();
			UsingNIO();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}

	}

}
