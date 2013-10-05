package Q4;

import java.util.Stack;
import java.util.Scanner;

public class TestQueue 
{
    /**
     * COMP268 Assignment 2
     * Question #4
     * File(s):	TestQueue.java (main)
     * 		QueueMethods.java (interface)
     * 		MyQueue.java
     * 
     * Purpose:	Write program MyQueue.java and IMPLEMENT some of the Queue
     * 		methods using only a Stack to store and retrieve elements
     * 
     * @author: Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 16, 2013
     */

    public static void main(String[] args) {

	// Implement some of the key Queue methods using a stack to store
	// and retrieve elements
	Stack<String> s1 = new Stack();		// Creates the stack s
	Stack<String> s2 = new Stack();		// Used to swap stack into a queue

	Scanner usrInput1 = new Scanner(System.in);	
	Scanner usrInput2 = new Scanner(System.in);
	System.out.println("This program will simulate a Queue (FIFO) by using a Stack");
	System.out.println("Would you like to Add (1), Remove (2), Quit (3)");
	int usrDecision = usrInput1.nextInt();		
	String usrAddItem;

	QueueMethods toSwap = new MyQueue();
	String itemTemp;

	// Simulates the First-In-First-Out principle of the Queues.
	do {
	    switch (usrDecision) {
	    case 1: // Add to the list. Similar to the "add" functionality of Queues
		System.out.println("Please type in something to add to the list");
		usrAddItem = usrInput2.nextLine();
		toSwap.enterQueue(s1, usrAddItem);
		break;		
	    case 2:			// Remove from the list in a FIFO way.
		while (s1.isEmpty() == false) {
		    itemTemp = toSwap.leaveQueue(s1);
		    toSwap.enterQueue(s2, itemTemp);
		}
		toSwap.leaveQueue(s2);
		while (s2.isEmpty() == false) {
		    itemTemp = toSwap.leaveQueue(s2);
		    toSwap.enterQueue(s1, itemTemp);
		}
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

	    // If empty, finish program
	    if (s1.isEmpty() == true) {
		usrDecision = 3;
		System.out.println("Your list is now empty and the program has finished");
	    } else {
		usrDecision = 0;
	    }

	    // Test to see if there is no more items int the list to manipulate
	    if (s1.isEmpty() == false) {
		System.out.println("\nWould you like to Add (1), Remove (2), Quit (3)");
		usrDecision = usrInput1.nextInt();
	    }
	} 	while (usrDecision != 3);
    }  
}	
