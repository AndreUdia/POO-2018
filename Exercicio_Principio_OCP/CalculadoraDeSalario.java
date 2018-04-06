public class CalculadoraDeSalario {
	double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(Funcionario fn) {
		return fn.calcula() + incentivo;
	}
}

