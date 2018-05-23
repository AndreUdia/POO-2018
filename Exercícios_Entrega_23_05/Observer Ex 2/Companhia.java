package observer;

public class Companhia implements Observer {

	@Override
	public void update() {
		System.out.println("Novo alarm acionado na companhia de seguros :) ");
	}

}
