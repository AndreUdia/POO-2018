package state;

public class Porta {
	private EstadoPorta estado;
	
	public Porta() {
		estado = new PortaFechada();
	}
	
	public void setEstado(EstadoPorta estado) {
		this.estado = estado;
	}
	
	public EstadoPorta getEstado() {
		return estado;
	}
	
	public void clicar() {
		estado.clicar(this);
	}
	
	public static void main (String [] args) {
		Porta p = new Porta();
		
		p.clicar();
		p.clicar();
		p.clicar();
		p.clicar();
		p.clicar();
	}
	
}