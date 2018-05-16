package state.exercicios;

public class ModoAplicacao extends EstadoTelefone{

	@Override
	public void acima() {
		System.out.println("Barra de rolagem subiu");
	}

	@Override
	public void abaixo() {
		System.out.println("Barra de rolagem desceu");
	}

	@Override
	public void encerrar(Telefone t) {
		System.out.println("A aplicação foi encerrada!");
		t.mudaEstado(new ModoPadrao());
	}
	
}
