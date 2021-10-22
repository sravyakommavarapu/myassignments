package singleton;

public class Validation {
	protected static Validation uniqueInstance;
	public static final String userID = "user";
	public static final String pass = "pass";
	 
	// other useful instance variables here
 
	public Validation() {}
 
	public static synchronized Validation getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Validation();
		}
		return uniqueInstance;
	}
}
