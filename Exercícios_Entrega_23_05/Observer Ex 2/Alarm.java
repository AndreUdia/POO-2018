package observer;

import java.util.ArrayList;

public class Alarm implements Subject {
	ArrayList<Observer> observer;
	
	public Alarm() {
		observer = new ArrayList<Observer>();
	}
	

	@Override
	public void NotifyObservers() {
		for(int i=0; i<observer.size(); i++) {
			observer.get(i).update();
		}
		
	}
	
	public void novoAlarm() {
		NotifyObservers();
	}
	
	@Override
	public void addObserver(Observer o) {
		observer.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		observer.remove(o);
		
	}


}
