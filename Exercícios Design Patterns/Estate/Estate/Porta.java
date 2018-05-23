package state;

public class Porta {
	private EstadoPorta estado;
	
	public Porta() {
		estado = new PortaFechada();
	}
	
	public void setEstado(EstadoPorta estado) {
		
	}
	
	public EstadoPorta getEstado() {
		return estado;
	}
	
	public void clicar() {
		estado.clicar(this);
	}
	
}
