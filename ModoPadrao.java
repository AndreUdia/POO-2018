package state.exercicios;

public class ModoPadrao extends EstadoTelefone{

	@Override
	public void acima() {
		System.out.println("O volume aumentou");
	}

	@Override
	public void abaixo() {
		System.out.println("O volume diminuiu");
	}

	@Override
	public void chamada(Telefone t) {
		System.out.println("O modo foi alterado para chamada!");
		t.mudaEstado(new ModoChamada());
	}

	@Override
	public void iniciarApp(Telefone t) {
		System.out.println("O modo foi alterado para aplicação!");
		t.mudaEstado(new ModoAplicacao());
	}

	
}
