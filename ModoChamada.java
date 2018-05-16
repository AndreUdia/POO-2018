package state.exercicios;

public class ModoChamada extends EstadoTelefone{

	@Override
	public void acima() {
		System.out.println("O volume da chamada foi aumentado");
	}

	@Override
	public void abaixo() {
		System.out.println("O volume da chamada foi diminuido");
	}

	@Override
	public void encerrar(Telefone t) {
		System.out.println("A chamada foi encerrada!");
		t.mudaEstado(new ModoPadrao());
	}

	
}
