
public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Jose", 3000.0);
		Funcionario f2 = new Vendedor("Manoel", 954.0, 10000.00, 150000.00);
		Funcionario f3 = new Assistente("Fernando", 1050.0);
		Funcionario f4 = new Supervisor("Joelma",2000.0);
		
		CalculadoraDeSalario c1 = new CalculadoraDeSalario(100);
		
		System.out.println(c1.calcula(f1));
		System.out.println(c1.calcula(f2));
		System.out.println(c1.calcula(f3));
		System.out.println(c1.calcula(f4));
		
	}

}
