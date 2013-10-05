package Q4;

import java.util.Stack;

public class MyQueue implements QueueMethods 
{

    /**
     * COMP268 Assignment 2
     * Question #4
     * File(s):	TestQueue.java (main)
     * 		QueueMethods.java (interface)
     * 		MyQueue.java
     * 
     * Purpose:	Write program MyQueue.java and IMPLEMENT some of the Queue
     * 		methods using only a Stack to store and retreieve elements
     * 
     * @author: Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 16, 2013
     */

	// This uses stack's push to add to a list
	public void enterQueue(Stack<String> entQ, String qValue) {
		entQ.push(qValue);
		return;
	}
	
	// This uses stack's pop to remove from the list
	public String leaveQueue(Stack<String> leaveQ) {
		return	leaveQ.pop();
	}

	// Constructor
	public MyQueue() {   
		// Not needed but added in to get into the habit of adding the constructor
	}
}
