public class Esporte implements ModoDirecao {

	@Override
	public int getPotencia() {
		return 400;
	}

	@Override
	public int getAlturaSuspensao() {
		return 20;
	}
	
	@Override
	public String getTipoDirecao() {
		return "Esporte";
	}

}
