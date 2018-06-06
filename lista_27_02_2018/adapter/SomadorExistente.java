package lista_30_05_2018.adapter;

import java.util.List;

public class SomadorExistente {
	public int somaList(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
