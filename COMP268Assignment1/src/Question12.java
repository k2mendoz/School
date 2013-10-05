import java.util.Scanner;
public class Question12 {

/**
 * COMP268 Assignment #1
 * Question #12
 * Write a program to determine if an input string is a palindrome
 * 
 * @author Kevin Mendoza, AU ID#: 3094417
 * @version Ver. 1, Oct. 26, 2012
 */

	public static void main (String [] args)	{
		
		// This program will evaluate whether the user input is a palindrome
		// by comparing the characters starting on each end of the input.
		
		Scanner usrInput = new Scanner(System.in);	// Used for the user input
	
		System.out.println("Please enter a word that will be evaluated as a palindrome or not");
		String usrInput2 = usrInput.nextLine();		// User input variable

		
		String usrInput3 = usrInput2.toLowerCase();	// variable to convert userinput to lowercase
	
		boolean isPalin = false;					// Intialize the palindrom input as false
		int start = 0;								// Variable to compare characters from the LEFT side of the input
		int end = usrInput3.length()-1;				// Variable to compare characters from the RIGHT side of the input

		// This is where the input will be evaluated
		while(start < end && start != end) {
			if (usrInput3.charAt(start) != usrInput3.charAt(end)) {
				isPalin = true;
				break;
			} else { 
				isPalin = false;
				start++;
				end--;
			}
		}											// End of the evaluation of the input

		// Output to identify if the input is a palindrome
		if(isPalin == true)  {
			System.out.println(usrInput2 + " " + "is not a palindrome ");
		} else {
			System.out.println(usrInput2 + " " + "is a palindrome");
		}
	}
}													// End of program
