package observerPattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}