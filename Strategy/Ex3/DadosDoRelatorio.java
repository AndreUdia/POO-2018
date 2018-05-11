import java.util.ArrayList;
import java.util.List;

public class DadosDoRelatorio {
	List<String> contas = new ArrayList<>();
	List<String> saldos = new ArrayList<>();
	
	public String getDadosDoBanco() {
		return "Banco Bradesco";
	}
	
	public String getTelefone() {
		return "3213 - 3213";
	}
	
	public List<String> saldos(){
		saldos.add("R$   10.00");
		saldos.add("R$  100.00");
		saldos.add("R$ 1000.00");
		return saldos;
	}
	
	public List<String> contasBancarias() {
		contas.add("Fernando");
		contas.add("Carlos" + "\t");
		contas.add("José" + "\t");
		return contas;
	}
}
