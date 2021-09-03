package observerPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class PSTObserver extends Observer{

	   public PSTObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     //PST Time
	     DateFormat cstFormat = new SimpleDateFormat();
	     TimeZone cstTime = TimeZone.getTimeZone("PST");
	     cstFormat.setTimeZone(cstTime);
	     System.out.println("PST Time: " + cstFormat.format(subject.getDate()));
	     
	   }
	}
