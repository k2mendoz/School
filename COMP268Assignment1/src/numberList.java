
public enum numberList {

	/**
	 *  Used in Question #8
	 *  Below is a list of enum constants
	 *  and value associated with it's constant
	 */
	// List of Enum constants and their values
	ONE		(1),
	TWO		(2),
	THREE	(3),
	FOUR	(4),
	FIVE	(5),
	SIX		(6),
	SEVEN	(7),
	EIGHT	(8),
	NINE	(9),
	TEN		(10);
	
	// rnum will hold the value of the enum constant;
	private final int rnum;
	
	numberList(int numberPick) {
		rnum = numberPick;
	}
	
	public int getNumberPick() {
		return rnum;
	}
}

