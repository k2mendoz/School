
public class Question10 {

	/**
	 * COMP268 Assignment #1
	 * Question #10
	 * Differentiate between a while statement and a do-while statement.
	 * Explain with example programs
	 * 
	 * @author Kevin Mendoza, AU ID#: 3094417
	 * @version Ver. 1, Oct. 23, 2012
	 */

	public static void main(String[] args) {

		// Initializing an array to show a list of numbers from 1 to 5
		int[] anArray = new int[5];

		anArray[0] = 1;
		anArray[1] = 2;
		anArray[2] = 3;
		anArray[3] = 4;
		anArray[4] = 5;

		int i = 0;		// Used in Example #1
		int j = 0;		// Used in Example #2
		int k = 0;		// Used in Example #3
		int l = 0;		// Used in Example #4


		// Example #1
		// This while statement evaluates only the first value
		// of the variable i.
		// The first variable will not satisfy the requirement
		// and will therefore not evaluate the
		// the code inside the while statement
		while (anArray[i] < 1) {
			i++;
		}
		if (anArray[i] <= 1) {
			System.out.println("Example #1 - while statement " +
					"with iteration one\nWhile loop did not execute\n\n");
		}


		
		// Example #2
		// This do-while statement evaluates only the first value of the variable j.
		// The value will not be evaluated until the end of the do-while loop and therefore
		// will be evaluating the statements after the "do" portion of the loop
		do {
			System.out.println("Example #2 - do-while statement with one iteration only" +
					"\nThe number of iterations passed through this do-while " +
					"statement is: " + (anArray[j]) + "\n\n");
			j++;
		} while (anArray[j] < 1);

		

		// Example #3
		// This while statement will pass through twice and will output the array number
		// to show how many times it had gone through the while statement.
		System.out.println("Example #3 - while statement with two iterations");
		while (anArray[k] < 3) {
			System.out.println("This is iteration " + (anArray[k]) + " of Example #3");
			k++;
		}
		System.out.println("Example #3 had " + (anArray[k]-1) + " iterations through the 'while' " +
				"statement.\n\n");
		
		
		
		// Example #4
		// This do-while statement will pass through twice and will output the array number
		// to show how many times it had gone through the do-while statement
		System.out.println("Example #4 - do-while statement with two iterations");
		do {
			System.out.println("This is iteration " + (anArray[l]) + " of Example #4");
			l++;
		} while (anArray[l] < 3);
		System.out.println("Example #4 had " + (anArray[l]-1) + " iterations through the 'do-while'" +
				" statement");
		
		
		// Conclusion statement
		System.out.println("\nConclusion:\nExample #1 ('while' statement) did not allow the first iteration " +
				"to go into the loop.\nSince the 'do-while' loop of Example #2 does not evaluate " +
				"the condition until after\nit has passed through the loop, the statements after " +
				"the do commnad were performed.  The second \niterations through both the while (Example #3) " +
				"and do-while (Example #4) loops satisfied their conidtion and \nat that point " +
				"would have passed through the same number of times");
				
	}
}
