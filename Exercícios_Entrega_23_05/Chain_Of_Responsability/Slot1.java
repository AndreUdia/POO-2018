package chain.of.responsability;

public class Slot1 extends Slot{

	@Override
	public void capturar(int moeda) {
		if(moeda == 1) {
			valorCapturado += moeda;
		}
		else {
			getProximo().capturar(moeda);
		}
	}

}
