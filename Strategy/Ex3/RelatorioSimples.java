public class RelatorioSimples extends Relatorios {
	
	@Override
	public void cabecalho() {
		System.out.println(fonteDeDados.getDadosDoBanco() + "\t\t\t\t" + fonteDeDados.getTelefone());
		System.out.println("====================================================");
		
		System.out.println("Clientes" + "\t\t\t\t" + "Saldos \n");
		
		int i = 0;
		for(String a : fonteDeDados.contasBancarias()) {
			System.out.println(a + "\t\t\t\t" +  fonteDeDados.saldos().get(i));
			i++;
		}
	}

	@Override
	public void corpo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rodape() {
		System.out.println("\n====================================================");
		System.out.println(fonteDeDados.getDadosDoBanco() + "\t\t\t\t" + fonteDeDados.getTelefone());
	}
	
}
