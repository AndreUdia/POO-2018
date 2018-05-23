package state;

public class PortaFechando extends EstadoPorta{

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaAbrindo());
	}

	@Override
	void fimDeCiclo(Porta porta) {
		porta.setEstado(new PortaFechada());
	}

}