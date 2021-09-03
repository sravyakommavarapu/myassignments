package observerPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class GMTObserver extends Observer{

	   public GMTObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }
	   
	   @Override
	   public void update() {
	      //GMT Format
	      DateFormat gmtFormat = new SimpleDateFormat();
	      TimeZone gmtTime = TimeZone.getTimeZone("GMT");
	      gmtFormat.setTimeZone(gmtTime);
	      System.out.println("GMT Time: " + gmtFormat.format( subject.getDate() ));
	 
	      
	   }
}