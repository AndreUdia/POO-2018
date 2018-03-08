package ex2;

public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		return this.salario * 0.6;
	}
	
	double getSalarioSegundaParcela() {
		return this.salario * 0.4;
	}
}
