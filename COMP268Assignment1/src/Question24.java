import java.util.Scanner;
public class Question24 {

	private static Scanner exchRate;
	private static Scanner exchCurr;
	private static Scanner exchAmt;

	/**
	 * COMP268 Assignment #1
	 * Question #24
	 * Write a program that prompts the user to enter
	 * the exchange rate from Canadian Dollars (CAD) 
	 * to indian rupees (INR). Prompt the user to enter 
	 * 0 to convert from Canadian dollars to Indian 
	 * rupees, and 1 to convert from Indian rupees to 
	 * Canadian dollars.  Prompt the user to enter the 
	 * amount in Canadian Dollars or Indian rupees to 
	 * convert it to Indian rupees or Canaidan dollars, 
	 * respectively.
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 26, 2012
	 */
	public static void main(String[] args) {
		
		exchRate = new Scanner(System.in);
		exchCurr = new Scanner(System.in);
		exchAmt = new Scanner(System.in);
		String eCurCode1 = null;						// Currency Code. Used for the output message
		String eCurCode2 = null;						// Currency Code. Used for the output message
		
		
		// First collect the exchange rate from the user
		System.out.println("This program will convert " +
				"between Canadian Dollars and Indian Rupees.");
		System.out.println("Enter '0' to convert from Canadian " +
				"Dollars (CDN) to Indian Rupees (INR) or\npress '1'" +
				"to convert from Indian Rupees (INR) to Canadian" +
				"Dollars (CDN)");
		
		
		int eCurr = exchCurr.nextInt();
		
		// Switch statement to determine the conversion path
		switch (eCurr) {
		
		case 0:											// Convert form CDN to INR
			System.out.println("You have selected to convert from CDN to INR");
			eCurCode1 = "INR";
			eCurCode2 = "CDN";
			break;
		
		case 1:											// Convert from INR to CDN
			System.out.println("You have selected to convert from INR to CDN");
			eCurCode1 = "CDN";
			eCurCode2 = "INR";
			break;
		default:										// Used for an invalid entry
			System.out.println("You have entered an invalid entry.");
			System.exit(0);
		}
		
				
		System.out.println("Please enter the exchange rate. i.e. # of " +
				"rupees per 1 CDN dollar");
		float eRate = exchRate.nextFloat();	
		
		// Prompt the user to input the amount in the identified currency
		System.out.println("Please enter the amount in the starting currency");
		float eAmnt = exchAmt.nextFloat();
		float eConverted = eAmnt * eRate;
		
		
		// Output of conversion
		System.out.println("The amount of " + eAmnt + " in " + eCurCode2 + 
				" currency converts to " + eConverted + " "+ eCurCode1 + ".");
		
	}
}		// End of program
