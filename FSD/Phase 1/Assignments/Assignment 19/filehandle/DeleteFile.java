package filehandle;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile 
{
	
	public static void main(String[] args) 
	{
		try
		{
			Path path= Paths.get("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text2.txt");
			if(Files.deleteIfExists(path))
			{
				System.out.println("File Deleted Successfully");
			}
			else
			{
				System.out.println("File Not Deleted");
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Error Occured :"+e);
		}

	}

}
