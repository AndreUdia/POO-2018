
public class Assistente extends Funcionario {

	public Assistente(String nome,double salarioBase) {
		super(nome, "Assistente", salarioBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula() {
		return getSalarioBase();
	}

}
