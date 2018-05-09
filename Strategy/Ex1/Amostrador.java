public class Amostrador {
	private int[] populacao;

	public Amostrador(int[] codigosZip) {
		populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(int tamanhoAmostra, MetodosDeAmostragem estrategia) {
		return estrategia.amostra(tamanhoAmostra,populacao);
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}
}
