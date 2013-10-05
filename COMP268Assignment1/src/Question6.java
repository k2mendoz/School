import java.io.IOException;
import java.math.BigInteger;
public class Question6 {

	/**
	 * COMP268 Assignment #1
	 * Question #6
	 * How many bits are used to represent Unicode, 
	 * ASCII, UTF-16 and UTF-8 characters? Explain with an 
	 * example program
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 26, 2012 
	 */
	
	public static void main(String[] args) throws IOException {
		
		// Answer to question #6
		// Unicode requires 16bits
		// ASCII requires 7 bits but is usually represented in 8 bits
		// UTF-8 represents characters using 8, 16, and 18 bit patterns
		// UTF-16 uses 16-bit and larger bit patterns

		String text = "w";								// Selected a random character to evaluate
		
		
		System.out.println("The following is " + text + "in it's binary code and the number of bits it represents");
		

		// Demonstration of ASCII
		String codeASCII = new BigInteger(text.getBytes("ASCII")).toString(2);
		System.out.println("As binary in ASCII: \t" + codeASCII + "\nThe Number of Bits: \t" + codeASCII.length() + "\n\n");


		// Demonstration of UTF-8
		String codeUTF8 = new BigInteger(text.getBytes("UTF-8")).toString(2);
		String bitLengthUTF8 = codeUTF8;
		if (bitLengthUTF8.length() < 8) {
			bitLengthUTF8 = "0" + bitLengthUTF8;
		}
		System.out.println("As binary in UTF-8: \t" + bitLengthUTF8 + "\nNumber of Bits: \t" + bitLengthUTF8.length() + "\n\n");


		// Demonstration of UTF-16
		String codeUTF16 = new BigInteger(text.getBytes("UTF-16")).toString(2);
		System.out.println("As binary in UTF-16: \t" + codeUTF16 + "\nThe Number of Bits: \t" + codeUTF16.length());

	}

}
