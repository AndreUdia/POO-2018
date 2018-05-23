package state;

public class PortaPermanentementeAberta extends EstadoPorta{

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaFechando());
	}

}