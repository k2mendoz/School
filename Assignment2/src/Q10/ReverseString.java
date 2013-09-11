package Q10;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString 
{
    /**
     * COMP268 Assignment 2
     * Question #10
     * File(s):	ReverseString.java
     * 
     * Purpose:	Write a program to reverse characters in a string using a
     * 		stack.
     * 
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 19, 2013
     */

    public static void main(String[] args) {
	System.out.println("This program will reverse the characters of a string");
	System.out.println("Please enter a string of text");
	Scanner usrInput = new Scanner(System.in);
	String usrString = usrInput.nextLine();

	char extractedChar;
	String extractedCharAsString;
	String removedCharFromUserStack;
	String reversedChar;
	String reconstructedInReverse = "";
	int sizeOfNewString;
	Stack<String> userStack = new Stack<String>();
	Stack<String> reversedStack = new Stack<String>();

	// Each character of the string is added to 'userStack' 
	for ( int i=0 ; i<usrString.length() ; i++) {
	    extractedChar = usrString.charAt(i);
	    extractedCharAsString = Character.toString(extractedChar);
	    userStack.push(extractedCharAsString);
	}

	sizeOfNewString = userStack.size();
	System.out.println();

	// Removes each character from the 'userStack' and using Stack's 
	// First-In-Last-Out process to reverse the users' string.
	for (int k=0 ; k < sizeOfNewString ; k++) {
	    removedCharFromUserStack = userStack.pop();
	    reversedChar = reversedStack.push(removedCharFromUserStack);
	    reconstructedInReverse = reconstructedInReverse + reversedChar;
	}
	
	System.out.println("Your reversed string is: \n" + reconstructedInReverse);
	usrInput.close();
    }
}
