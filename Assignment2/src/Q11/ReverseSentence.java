package Q11;

import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Scanner;

public class ReverseSentence {

    /**
     * COMP268 Assignment 2
     * Question #11
     * File(s):	ReverseSentence.java
     * 
     * Purpose:	Write a program to reverse words in a sentence using
     * 		a vector.
     * 
     * @author Kevin Mendoza, AU ID#: 3094417
     * @version Ver. 1, Jan 19, 2013
     */

    public static void main(String[] args) {	
	System.out.println("This program will reverse words in a sentence");
	System.out.println("Please enter a sentence");
	Scanner usrInput = new Scanner(System.in);
	String usrSentence = usrInput.nextLine();

	String usrToken;
	String reversedWord = "";
	StringTokenizer st = new StringTokenizer(usrSentence);
	Vector<String> vect = new Vector<String>();	

	// Disect the string using StringTokenizer and add to a vector array
	while (st.hasMoreTokens()) {
	    usrToken = st.nextToken();
	    vect.add(usrToken);
	}
	
	// Evaluate whether the input was a sentence (as defined by the
	// Oxford dictionary as a 'set of words'.
	if (vect.size() == 1) {
	    System.out.println("You have entered a single word. \nA sentence " +
	    		"is a set of words that is complete in itself");
	} else if (vect.size() == 0) {
	    System.out.println("Your entry was blank.");
	} else {
	    // Reverse the word
	    for (int i = vect.size() ; i >= 1 ; i--){
		reversedWord = reversedWord + vect.get(i-1) + " ";
	    }
	    System.out.println("\nYour results are:");
	    System.out.println(reversedWord);
	}
    }	
}	
