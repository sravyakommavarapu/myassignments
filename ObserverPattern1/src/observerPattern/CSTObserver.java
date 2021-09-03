package observerPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class CSTObserver extends Observer{

	   public CSTObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	       //CST Time
	     DateFormat cstFormat = new SimpleDateFormat();
	     TimeZone cstTime = TimeZone.getTimeZone("CST");
	     cstFormat.setTimeZone(cstTime);
	     System.out.println("CST Time: " + cstFormat.format(subject.getDate()));
	     
	   }
	}