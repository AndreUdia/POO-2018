public class MensagemDia {
	private DiaDaSemana diaDaSemana;

	public MensagemDia(DiaDaSemana diaDaSemana) {
		super();
		this.diaDaSemana = diaDaSemana;
	}
	
	public static void maind(String[] args) {
		MensagemDia impressor = new MensagemDia(new diaSegunda());
		impressor.imprime();
	}

	private void imprime() {
		diaDaSemana.imprimeMensagem();
		
	}
}
