package Q13;

import java.util.*;

public class StorePrimeNumbers 
{
    /**
     * COMP268 Assignment 2
     * Question #13
     * File(s):	StorePrimeNumbers.java
     * 
     * Purpose:	Write a program to reverse words in a sentence using
     * 		a vector.
     *
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 20, 2013
     */

    public static void main(String[] args) {

	Scanner usrInput = new Scanner(System.in);
	Vector<Integer> vectrList = new Vector<Integer>();
	Vector<Integer> vectrPrime = new Vector<Integer>();

	System.out.println("Please enter a series of positive numbers one at " +
			"a time. \nPress <enter> after each desired number");
	System.out.println("Enter 0 to stop adding numbers to the list");
	int a = -1; 	

	// Collect a series of positive numbers from the user and print
	// out the list.
	while (a != 0)  {
	    System.out.println("Add a positive number or 0 to stop adding " +
	    		"numbers to the list.");
	    a = usrInput.nextInt();	
	    if (a == 0) {
		System.out.println("You have decided to quit");
	    } else if (a < 0) {
		System.out.println("Only positive numbers are allowed");
	    } else {
		vectrList.add(a);
		System.out.println("\nYour list so far is:");
		for (int i1 = 0; i1 < vectrList.size() ; i1++) {
		    System.out.printf("%s," , vectrList.get(i1));
		}
		System.out.println();
	    }
	} 
	
	Collections.sort(vectrList);
	
	// This section does the analysis to determine if each item on the
	// list is a prime number.  If so, it will store the value in the
	// vectrPrime list
	for (int j = 1; j <= vectrList.size(); j++) {	// j represents the index of the for loop
	    int k = vectrList.get(j-1);			// k represents the number to be evaluated as a prime
	    for (int l=1; l<=k; l++) {
		// Evaluates when the value of l and k are equal to 1 as
		// one is a prime number.
		if ((l == 1) && (l == k)) {
		    //System.out.println(k + " is a non-prime number");
		}
		if (l == 1) {
		} else if ((k%l == 0) && (k == l)){				
		    vectrPrime.add(k);	
		} else if ((k%l == 0) && (k != l)) {
		    break;
		}
	    }
	}

	if (vectrPrime.isEmpty() == true) {
	    System.out.println("There are no prime number with the series of " +
	    		"numbers you had provided.");
	} else {
	    System.out.println("\nBelow are PRIME numbers in your list.");
	    // Print out the prime list
	    for (int i1 = 0; i1 < vectrPrime.size() ; i1++) {
		System.out.printf("%s " , vectrPrime.get(i1));
	    }
	}
    }
}
