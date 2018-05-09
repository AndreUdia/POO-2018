public class Teste {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		ManipuladorDeEventos mde = new ManipuladorDeEventos(meuCarro);
		mde.mudarModoDirecao(new Esporte());
		System.out.println("Suspensão: " + meuCarro.getAlturaSuspencao() + "\nPotência: " + meuCarro.getPotencia() + "\n");
		mde.mudarModoDirecao(new Passeio());
		System.out.println("Suspensão: " + meuCarro.getAlturaSuspencao() + "\nPotência: " + meuCarro.getPotencia() + "\n");
	}

}
