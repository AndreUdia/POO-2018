package div_violation;

public abstract class Veiculo implements AlterarEstadoDoMotor{
	private boolean estaLigado;
	
	public boolean estaLigado() {
		return estaLigado;
	}

	@Override
	public void ligarMotor() {
		estaLigado = true;
		
	}

	@Override
	public void desligarMotor() {
		estaLigado = false;
		
	}
	
}
