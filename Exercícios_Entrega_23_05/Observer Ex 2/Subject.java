package observer;

public interface Subject {
	void NotifyObservers();
	void addObserver(Observer o);
	void removeObserver(Observer o);
}
