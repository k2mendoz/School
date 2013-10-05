import java.util.Scanner;
public class Question11A {

	private static Scanner usrInptObject;

	/**
	 * COMP268 Assignment #1
	 * Question #11
	 * Write a recursive program that calculates the greatest common divisor (GCD)
	 * of three input numbers.
	 * 
	 * Other classes used
	 * gcdTemp.java - contains the recursive method
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 23, 2012
	 */
	
	public static void main(String[] args) {
		
		usrInptObject = new Scanner(System.in);
		int usr1;		// First user inputed variable
		int usr2;		// Second user inputed variable
		int usr3;		// Third user inputed variable
		
		// Collect the user input of the numbers they would like to have calculated
		System.out.println("This program will find the greatest common divisor between 3 numbers");
		System.out.println("Enter your first number ");
		usr1 = usrInptObject.nextInt();
		
		System.out.println("Enter your second number ");
		usr2 = usrInptObject.nextInt();
		
		System.out.println("Enter your third number ");
		usr3 = usrInptObject.nextInt();

		
		// Use the getGcd method to determine the greatest common divisor
		gcdTemp good = new gcdTemp(usr1, usr2, usr3);
		System.out.println("The greatest common divisor of " + usr1 + ", " + usr2 + " and " + usr3 + " is " +
					(good.getGcd(usr1, good.getGcd(usr2, usr3))) + " .");
	}
}