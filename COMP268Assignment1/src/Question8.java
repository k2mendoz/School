import java.util.Random;
public class Question8 {

/**
 * COMP268 Assignment #1
 * Question #8
 * Explain about enum data types in Java with an example program.
 * Write a program to generate random numbers in the range of 1 to 10.
 * 
 * Other classes used
 * numberList.java - Contains the enum constants from 1 to 10 along
 * with their values.   
 * 
 * @author Kevin Mendoza, AU ID#: 3094417
 * @version Ver. 1, Oct. 23, 2012
 */
    public static void main(String[] args) {
    	
    	Random randomNum = new Random();
    	
    	System.out.println("Here is a list of randomly generated numbers from the enum list");
    	
    	for (int i = 1; i <= 10; i++) {
    		numberList rand = numberList.values()[randomNum.nextInt(numberList.values().length)];
    		
    		// Below the name of the enum constant is displayed to validate the number associated with it
    		System.out.printf("%s\t%s\n", rand.getNumberPick(), rand);
    	}    	
    }
}			// End of program
