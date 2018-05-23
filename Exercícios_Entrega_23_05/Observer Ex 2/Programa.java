package observer;

public class Programa {
	public static void main(String[] args) {
		Delegacia d = new Delegacia();
		Companhia c = new Companhia();
		Delegacia d2 = new Delegacia();
		Alarm a = new Alarm();
		
		a.addObserver(d);
		a.addObserver(c);
		a.addObserver(d2);
		
		a.novoAlarme();
		
		a.removeObserver(d2);
		
		a.novoAlarme();
	}
}
