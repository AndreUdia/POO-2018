package lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Veiculo v1 = new Carro();
		Veiculo v2 = new Aviao();
		
		List<Veiculo> lista = new ArrayList<>();
		lista.add(v1);
		lista.add(v2);
		
		for(Veiculo v : lista) {
			v.mudaMarcha(Marcha.R);
		}

	}

}
