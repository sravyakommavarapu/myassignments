package observerPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ESTObserver extends Observer {

	public ESTObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// EST Time
		DateFormat estFormat = new SimpleDateFormat();
		TimeZone estTime = TimeZone.getTimeZone("EST");
		estFormat.setTimeZone(estTime);
		System.out.println("EST Time: " + estFormat.format( subject.getDate() ));

	}
}
