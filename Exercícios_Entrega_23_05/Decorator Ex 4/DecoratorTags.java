package decorator;

public class DecoratorTags implements Texto{
	private Texto componente;
	
	public DecoratorTags(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return "<p>" + componente.getTexto() + "</p>";
	}

}
