package Q5;

import java.util.ArrayList;
import java.util.Scanner;

import Q4.MyQueue;
import Q4.QueueMethods;

public class TestStack 
{
    /**
     * COMP268 Assignment 2
     * Question #5
     * File(s):	TestStack.java (main)
     * 		StackMethods.java (interface)
     * 		MyStack.java
     * 
     * Purpose:	Write program MyStack.java and IMPLEMENT some of the Stack
     * 		methods using only an ArrayList class to store and retrieve elements
     * 
     * @author: Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 16, 2013
     */

    public static void main(String[] args) {
	// Implement some of the key Stack methods using a ArrayList class to
	// store and retrieve elements
	ArrayList<String> s1 = new ArrayList<String>();
	Scanner usrInput1 = new Scanner(System.in);	
	Scanner usrInput2 = new Scanner(System.in);
	StackMethods toAddRem = new MyStack();
	
	System.out.println("This program will simulate a Stack (FILO) by " +
			"using an ArrayList class");
	System.out.println("Would you like to Add (1), Remove (2), Quit (3)");
	
	int usrDecision = usrInput1.nextInt();		
	int listSize = 0;
	String usrAddItem;
	
	// This is the portion of the program that simulates the First-In-Last-Out
	// principle of Stacks using only ArrayList to add or remove instead of push and pop.
	do {
	    switch (usrDecision) {
	    case 1: 	// Add to the list. Similar to the "push" functionality of Stack
		System.out.println("Please type in something to add to the list");
		usrAddItem = usrInput2.nextLine();
		toAddRem.push(s1, usrAddItem);
		break;

	    case 2:				// Remove from the list in a FILO
		listSize = s1.size() - 1;	
		toAddRem.pop(s1, listSize);
		break;

	    case 3:
		System.out.println("Program is finished.");
		break;

	    default:		// User enter anything other than 0, 1, 2
		usrDecision = 3;
		break;
	    }

	    // Print out results
	    System.out.println("Here is your new list.");
	    for(int i = 0; i<s1.size(); i++) {
		System.out.printf("%s ", s1.get(i));
	    }	
	    System.out.println("\n****************************");
	    // Test for an empty list to finish the program
	    if (s1.isEmpty() == true) {
		usrDecision = 3;
		System.out.println("Your list is now empty and the program has" +
				" finished");
	    } else {
		usrDecision = 0;
	    }

	    // Test to see if there is no more items int the list to manipulate
	    if (s1.isEmpty() == false) {
		System.out.println("\nWould you like to Add (1), Remove (2), " +
				"Quit (3)");
		usrDecision = usrInput1.nextInt();
	    }
	} while (usrDecision != 3);
    }
}
