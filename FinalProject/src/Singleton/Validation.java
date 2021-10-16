package Singleton;

public class Validation {
	protected static Validation uniqueInstance;
	public static final int userID = 12345;
	public static final String pass = "abc";
	 
	// other useful instance variables here
 
	public Validation() {}
 
	public static synchronized Validation getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Validation();
		}
		return uniqueInstance;
	}
}
