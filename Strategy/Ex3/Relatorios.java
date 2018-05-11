public abstract class Relatorios {
	DadosDoRelatorio fonteDeDados;
	
	public Relatorios() {
		this.fonteDeDados = new DadosDoRelatorio();
	}
	
	public final DadosDoRelatorio getFonteDeDados() {
		return fonteDeDados;
	}
	
	public void gerarRelatorio() {  //template method - rook for the subclass
		cabecalho();
		corpo();
		rodape();
	}
	
	public abstract void cabecalho();
	
	public abstract void corpo();

	public abstract void rodape();
}
