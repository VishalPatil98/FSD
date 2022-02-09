package filehandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile 
{

	public static void updateFile(String file,String olddata,String newdata)
	{
		File fileToBeModified= new File(file);
		String fileData="";
		BufferedReader reader=null;
		FileWriter writer=null;
		//read content of file
		try {
			reader=new BufferedReader(new FileReader(fileToBeModified));
			String line=reader.readLine();
			while(line!=null)
			{
				fileData=fileData+line+System.lineSeparator();
				line=reader.readLine();
			}
			//update the data 
			String newFileData=fileData.replaceAll(olddata, newdata);
			//write modified data to that file
			writer=new FileWriter(fileToBeModified);
			writer.write(newFileData);
			System.out.println("Data Updated Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		
		updateFile
		("C:\\Users\\Vishal\\eclipse-workspace\\FSD Phase 1\\Session 3\\filehandle\\text1.txt"
				,"hi","Hello");
	}

}
