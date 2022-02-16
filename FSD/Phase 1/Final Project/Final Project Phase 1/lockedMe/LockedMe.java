package lockedMe;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class LockedMe
{
	static String DIRECTORY;
    File folder_name;
	public LockedMe()
	{
		DIRECTORY = System.getProperty("user.dir");
	    folder_name = new File(DIRECTORY+"/files");
	    if (!folder_name.exists())
	    {
	    	folder_name.mkdirs();
	    }        
	    System.out.println("Currently Working Directory : "+ folder_name.getAbsolutePath());
	}
	void MainMenu()
	{
		System.out.println("----------------------Main Menu----------------------");
    	System.out.println("Enter 1 For List Of files");
		System.out.println("Enter 2 For Business Operations");
		System.out.println("Enter 3 For Exit");
		System.out.println("Enter Your Choice:");
		try
        {
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option)
            {
                case 1 : 
                {
                    showFiles();
                    MainMenu();
                }
                case 2 : 
                {
                    SecondaryMenu();
                }
                case 3 : 
                {
                	System.out.println("************************");
                	System.out.println("Application Closed");
                    System.out.println("Thank You");
                    System.out.println("************************");
                    System.exit(0);
                }
                default: MainMenu();
            }
        }
        catch (Exception e)
        {
            System.out.println("Please enter 1, 2 or 3");
            MainMenu();
        }
	}
	void SecondaryMenu()
	{
		try
        {	System.out.println("----------------------Secondary Menu----------------------");
        	System.out.println("Enter 1 To Create File");
			System.out.println("Enter 2 To Delete File");
			System.out.println("Enter 3 To Search File");
			System.out.println("Enter 4 To Back");
			System.out.println("Enter Your Choice :");
		    Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option)
            {
                case 1 : 
                {
                    System.out.print(" Adding a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim().toLowerCase();
                    addFile(filename);
                    break;
                }
                case 2 : 
                {
                    System.out.print(" Deleting a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    deleteFile(filename);
                    break;
                }
                case 3 : 
                {
                    System.out.print(" Searching a file...Please Enter a File Name : ");
                    String filename = scanner.next().trim();
                    searchFile(filename);
                    break;
                }
                case 4 : 
                {
                    System.out.println("Going Back to MAIN menu");
                    MainMenu();
                    break;
                }
                default : System.out.println("Please enter 1, 2, 3 or 4");
            }
            SecondaryMenu();
        }
        catch (Exception e){
            System.out.println("Please enter 1, 2, 3 or 4");
            SecondaryMenu();
        }
	}
	void showFiles() 
    {
        if (folder_name.list().length==0)
            System.out.println("The folder is empty");
        else 
        {
            String[] list = folder_name.list();
            System.out.println("The files in "+ folder_name +" are :");
            Arrays.sort(list);
            for (String str:list) 
            {
                System.out.println(str);
            }
        }
    }
    void addFile(String filename) throws IOException
    {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) 
        {
            if (filename.equalsIgnoreCase(file)) 
            {
                System.out.println("File " + filename + " already exists at " + folder_name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ folder_name);
    }
    void deleteFile(String filename) 
    {
        File filepath = new File(folder_name +"/"+filename);
        String[] list = folder_name.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) 
            {
                System.out.println("File " + filename + " deleted from " + folder_name);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    void searchFile(String filename) 
    {
        String[] list = folder_name.list();
        for (String file: list) 
        {
            if (filename.equals(file))
            {
                System.out.println("FILE FOUND : File " + filename + " exists at " + folder_name);
                return;
            }
        }
        System.out.println("File NOT found");
    }
    public static void main(String[] args)
    {
    	System.out.println("**************************************************");
		System.out.println("Hello Welcome To Lockme.com..........");
		System.out.println("This Project is developed by Vishal Patil ");
		System.out.println("**************************************************");
		LockedMe obj=new LockedMe();
		obj.MainMenu();
    }
}
