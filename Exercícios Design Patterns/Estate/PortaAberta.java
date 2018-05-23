package state;

public class PortaAberta extends EstadoPorta {

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaPermanentementeAberta());
	}
	
}
