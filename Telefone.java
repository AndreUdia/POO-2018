package state.exercicios;

public class Telefone {
	EstadoTelefone modo;

	public void mudaEstado(EstadoTelefone modo) {
		this.modo = modo;
	}
	
	public void teclaParaCima() {
		modo.acima();
	}
	
	public void teclaParaBaixo() {
		modo.abaixo();
	}
	
	public void chamada() {
		modo.chamada(this);
	}
	
	public void encerrar() {
		modo.encerrar(this);
	}
	
	public void iniciar() {
		modo.iniciarApp(this);
	}
	
}
