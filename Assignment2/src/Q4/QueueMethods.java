package Q4;

import java.util.Stack;

public interface QueueMethods 
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

    // Method as defined by the assignment Question to IMPLEMENT
    public void enterQueue(Stack<String> entQ, String qValue);

    // Method as defined by the assignment Question to IMPLEMENT
    public String leaveQueue(Stack<String> leaveQ);
}
