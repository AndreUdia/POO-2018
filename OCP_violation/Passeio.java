public class Passeio implements ModoDirecao{

	@Override
	public int getPotencia() {
		return 500;
	}

	@Override
	public int getAlturaSuspensao() {
		return 10;
	}

	@Override
	public String getTipoDirecao() {
		return "Passeio";
	}

}
