public class Teste {

	public static void main(String[] args) {
		Relatorios relatorio;
		
		relatorio= new RelatorioSimples();
		relatorio.gerarRelatorio();
		
		//relatorio = new RelatorioComplexo();
		//relatorio.gerarRelatorio();

	}

}



/*Aplicando o Design Pattern Template Method construa um sistema para imprimir relat�rios de
dois tipos: simples e complexo. Relat�rios s�o muito parecidos: todos eles cont�m cabe�alho,
corpo, e rodap�. 

Relat�rios simples possuem cabe�alhos e rodap�s apenas com o nome do
banco e telefone, respectivamente; 
um relat�rio simples apenas imprime titular e saldo da conta.

relat�rios complexos possuem cabe�alhos que informam o
nome do banco, endere�o, telefone, e rodap�s que informam e-mail, e a data atual. 
Para ocorpo, dada uma lista de contas,
O relat�rio complexo exibe titular, ag�ncia, n�mero da conta e saldo. Use dados falsos para os
dados do banco.


*/