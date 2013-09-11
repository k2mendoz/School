import java.math.BigInteger;
public class Question7 {

	private static long binary;

	/**
	 * COMP268 Assignment #1
	 * Question #7
	 * What is the range of basic data types in Java?
	 * Explain with an example.
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 26, 2012
	 */
	
	public static void main(String[] args) {
		boolean falseB = false;						// Used for the boolean data type explanation
		boolean trueB  = true;						// Used for the boolean data type explanation
		
		System.out.println("Below is a summary of the range of values for basic data types\n");
		
		// Value range for the byte data type
		System.out.println("Byte maximum value:  " + Byte.MAX_VALUE);
		System.out.println("Byte minimum value:  " + Byte.MIN_VALUE+ "\n");
		
		
		// Value range for the short data type
		System.out.println("Short maximum value:  " + Short.MAX_VALUE);
		System.out.println("Short minimum value:  " + Short.MIN_VALUE + "\n");
		
		
		// Value range for the int data type
		System.out.println("int maximum value:  " + Integer.MAX_VALUE);
		System.out.println("int minimum value:  " + Integer.MIN_VALUE + "\n");
		
		
		// Value range for the long data type
		System.out.println("long maximum value:  " + Long.MAX_VALUE);
		System.out.println("long minimum value:  " + Long.MIN_VALUE + "\n");
		
		
		// float & double size
		// As floating point literals do not represent whole numbers, below
		// will report the number of bits a float represents.
		System.out.println("A float represents "  + Float.SIZE  + " of bits.");
		System.out.println("A double represents " + Double.SIZE + " of bits.\n");
		
		
		// boolean data type
		System.out.println("A boolean can only have the value of " + falseB + 
				" and " + trueB + "\n");

		// char data type
		// Characters are represented by a unique code value.  This example
		// will use the internal value code of 48 and report the character
		// value in which it represents
		int i = 0;
		int[] charArray = new int[5];				// Initializing a set of 5 
		charArray[0] = 38;
		charArray[1] = 51;
		charArray[2] = 71;
		charArray[3] = 89;
		charArray[4] = 107;
		char rCharValue;
		
		System.out.println("For the char type, below is a list of 5 internal " +
				"codes along with their respective character value");
		System.out.println("Value Code\tChar Value");
		
		while (i <= 4) {
			rCharValue = (char) charArray[i];
			System.out.println(charArray[i] + "\t\t" + rCharValue);
			i++;
		}
	}
}			// End of program
