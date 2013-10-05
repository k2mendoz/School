
public class gcdTemp {
	
	/**
	 * This public class is used for Question 11
	 * of Assignment 1
	 */
	
	private int a;
	private int b;
	private int c;

	
	//public gcdTemp() {
	//	this(1,1);
	//}
	//public gcdTemp(int a1) {
	//	a = a1;
	//}
	//public gcdTemp(int a1, int b1) {
	//	a = a1;
	//	b = b1;
	//}
	public gcdTemp(int a1, int b1, int c1) {
		a = a1;
		b = b1;
		c = c1;		
	}
	
	// The following is a recursive method that calculates the 
	// greatest common divisor
	public int getGcd(int a2, int b2) {
		if (b2 == 0) 
			return a2;
		else 
			return getGcd(b2, a2 % b2);
	}				
}
