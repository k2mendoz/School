package Q3;
import java.io.File;
import java.util.Scanner;

public class FileSearch 
{

    /**
     * COMP268 Assignment 2
     * Question #3
     * File:	FileSearch.java
     * Purpose:	Search for a file in a particular directory
     * 
     * @author: Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 16, 2013
     */
       
    public static void main(String[] args) {
	Scanner usrInput = new Scanner(System.in);

	System.out.println("This application will search for a file within a " +
			"specified directory.");
	System.out.println("Please enter a directory to look into. ex. 'c:\\java\\'");
	String usrDir = usrInput.nextLine();
	System.out.println("Please enter a filename with extension. The search " +
			"is not case sensitive");
	String usrFile = usrInput.nextLine();
	
	// Validate the user inputed directory
	if (usrDir.endsWith("\\") == false)
	{
	    usrDir = usrDir + "\\";
	}
	
	String dirFile = usrDir + usrFile;
	System.out.println("You entered: " + dirFile);
	File fullFilenameWithDirectory = new File(usrDir + usrFile);
		
	// Locate file and report to the user
	if (fullFilenameWithDirectory.exists())
	{	
	    System.out.println("\n" + fullFilenameWithDirectory.getName() + 
		    " exists in the specified directory.");
	} else {
	    System.out.println("Sorry, " + dirFile + " does not exist in this" +
	    		" directory.");
	}
    }
}
