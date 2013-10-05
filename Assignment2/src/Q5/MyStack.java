package Q5;

import java.util.ArrayList;

public class MyStack implements StackMethods 
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

    @Override
    public void push(ArrayList<String> itemPush, String addIn) {
	itemPush.add(addIn);
	return;
    }

    @Override
    public void pop(ArrayList<String> itemPop, int atIndex) {
	itemPop.remove(atIndex);
	return;	
    }
}
