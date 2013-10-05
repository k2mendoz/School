
public class Question20 {

	/**
	 * COMP268 Assignment #1
	 * Question #20
	 * Differentiate between String and StringBuffer classes
	 * with an example program
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 26, 2012
	 */
	
	public static void main(String[] args) {

		/** String
		 * String is used to manipulate character strings that
		 * cannot be changed (read-only and immutable).
		 * 
		 * StringBuffer
		 * Stringbuffer is used to represent characters that
		 * can be modified
		 * 
		 * Concatenating a string is a common function of both 
		 * String and StringBuffer classes. The main difference 
		 * between the two is that StringBuffer objects can be modified while
		 * String objects cannot. Furthermore, StringBuffer produces code 
		 * faster than String class.  Since string objects are read-only,
		 * it invokes the StringBuffer class temporarily to append the 
		 * string thus producing additional code.
		 * 
		 * Submitted with this program is a file named:
		 * COMP268 Assignment 1 Question 20 Bytecode.txt which shows the
		 * bytecode output of running this Question20 class.
		 * In summary, it shows that the String class generated for this program
		 * has 35 lines of code vs the String class that generated 27 lines
		 * of code.
		 *  
		 */	
		// Below is an example of the 'String' method
		String str1 = new String("What a wonderful ");
		str1 = str1 + ("day");
		System.out.println(str1);
		
		// The following is an example of String Buffer
		StringBuffer str2 = new StringBuffer("What a wonderful ");
		str2.append("day.");
		System.out.println(str2);
		
		
		// See the attached file: COMP268 Assignment 1 Question 20 Bytecode.txt
		// which shows the bytecode output as described in the text above.
	}
}
