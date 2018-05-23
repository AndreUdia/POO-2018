package state;

public class PortaAbrindo extends EstadoPorta{

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaFechando());
	}

	@Override
	void fimDeCiclo(Porta porta) {
		porta.setEstado(new PortaAberta());
	}

}
