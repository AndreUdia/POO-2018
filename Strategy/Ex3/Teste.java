public class Teste {

	public static void main(String[] args) {
		Relatorios relatorio;
		
		relatorio= new RelatorioSimples();
		relatorio.gerarRelatorio();
		
		//relatorio = new RelatorioComplexo();
		//relatorio.gerarRelatorio();

	}

}



/*Aplicando o Design Pattern Template Method construa um sistema para imprimir relatórios de
dois tipos: simples e complexo. Relatórios são muito parecidos: todos eles contêm cabeçalho,
corpo, e rodapé. 

Relatórios simples possuem cabeçalhos e rodapés apenas com o nome do
banco e telefone, respectivamente; 
um relatório simples apenas imprime titular e saldo da conta.

relatórios complexos possuem cabeçalhos que informam o
nome do banco, endereço, telefone, e rodapés que informam e-mail, e a data atual. 
Para ocorpo, dada uma lista de contas,
O relatório complexo exibe titular, agência, número da conta e saldo. Use dados falsos para os
dados do banco.


*/