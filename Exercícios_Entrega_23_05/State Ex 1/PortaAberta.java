package state;

public class PortaAberta extends EstadoPorta {

	@Override
	void timeOut(Porta porta) {
		porta.setEstado(new PortaFechando());
	}

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaPermanentementeAberta());
	}
	
}