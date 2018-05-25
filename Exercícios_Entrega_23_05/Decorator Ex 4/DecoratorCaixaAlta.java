package decorator;

public class DecoratorCaixaAlta implements Texto{
	private Texto componente;
	
	public DecoratorCaixaAlta(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return componente.getTexto().toUpperCase();
	}

}
