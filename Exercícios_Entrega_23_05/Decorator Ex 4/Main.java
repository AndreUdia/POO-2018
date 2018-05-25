package decorator;

public class Main {

	public static void main(String[] args) {
		TextoSimples textoSimples = new TextoSimples();
		System.out.println("\n" + textoSimples.getTexto());

		System.out.println(new DecoratorInvertido(textoSimples).getTexto());
		
		System.out.println(new DecoratorCaixaAlta(new DecoratorInvertido(textoSimples)).getTexto());
		
		System.out.println(new DecoratorTags(new DecoratorCaixaAlta(new DecoratorInvertido(textoSimples))).getTexto());
	}

}
