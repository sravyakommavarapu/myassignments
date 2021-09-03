package observerPattern;

import java.util.Date;

class Main {
	public static void main(String[] args) {
		// Current Date and Time
		Date date = new Date();

		Subject subject = new Subject();
		
		new GMTObserver(subject);
		new CSTObserver(subject);
		new ESTObserver(subject);
		new PSTObserver(subject);

		subject.setDate(date);
		System.out.println("Current time provided in all timezones ");
	}
}