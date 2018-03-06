public class Leilao {
	String nomeObjeto;
	double valorMinimo;
	boolean taAberto = true;
	Lance lanceGanhador;
	
	Leilao(double valorMinimo, String nomeObjeto){
		this.nomeObjeto = nomeObjeto;
		this.valorMinimo = valorMinimo;
	}
	
	
	public void registrarLance(String nome, double valor) {
		if(valor > valorMinimo && taAberto) {
			Lance lance = new Lance();
			lance.lanceVencedor = valor;
			this.valorMinimo = valor;
			lance.nome = nome;
			System.out.println("O lance vencedor até o momento é o do/a " + nome);
			this.lanceGanhador = lance;
		}
		else {
			System.out.println("O lance deve ser maior que R$" + this.valorMinimo);
		}
	}
	
	public void finalizar() {
		taAberto = false;
		System.out.println("O leilão está encerrado"
				+ "\n Vencedor: " + this.lanceGanhador.nome
				+ "\n Valor do lance: " + this.lanceGanhador.lanceVencedor);
	}
}
