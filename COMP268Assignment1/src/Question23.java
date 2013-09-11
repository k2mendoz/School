import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Question23 {

	private static Scanner usrIn;

	/**
	 * COMP268 Assignment #1
	 * Question #23
	 * Write a program that prompts the user to enter 
	 * the number of days (e.g. 100) and displays the 
	 * resultant number of hours and minutes.
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 26, 2012
	 */
	
	public static void main(String[] args) {
		
		
		// This program will use the TimeUnit enum to convert a user entered
		// number of days into hours and minutes.
		
		
		usrIn = new Scanner(System.in);			
		
		System.out.println("This program will convert the specified" +
				"number of days into hours.\nPlease enter a number of " +
				"days");
		
		int usrDays = usrIn.nextInt();							// Collects the user input

		long usrHours = TimeUnit.DAYS.toHours(usrDays);			// convert input to hours
		long usrMinutes = TimeUnit.DAYS.toMinutes(usrDays);		// convert input to days
		
		// Output
		System.out.println("There are " + usrHours + " hours or " + usrMinutes +
				" minutes in " + usrDays + " days.");
	}
}
