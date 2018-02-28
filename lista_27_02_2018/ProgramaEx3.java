package lista_27_02_2018;

public class ProgramaEx3 {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		//System.out.println(conta1.titular);
		//conta1.titular = "Carlos";
		conta1.setTitular("Carlos");
		System.out.println(conta1.getTitular());
	}
	/* No exercício 3 funciona
	 * o comando set determina o titular para o objeto 
	 * o comando get busca a referencia do titular dentro do objeto
	 */
}
