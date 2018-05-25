package chain.of.responsability;

public class Slot50 extends Slot{

	@Override
	public void capturar(int moeda) {
		if(moeda == 50) {
			valorCapturado += moeda;
		}
		else {
			getProximo().capturar(moeda);
		}
	}

}