package observer;

public class Delegacia implements Observer{

	@Override
	public void update() {
		System.out.println("Novo alarm acionado na delegacia de polícia :) ");
	}

}
