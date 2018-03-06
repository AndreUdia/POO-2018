
public class ProgramaLeilao {

	public static void main(String[] args) {
		Leilao l1 = new Leilao(20.0, "carro");
		l1.registrarLance("Caseca", 18.0);
		l1.registrarLance("Carlos", 25.0);
		l1.registrarLance("Fonseca", 25.0);
		l1.finalizar();
		l1.registrarLance("Adriano", 25.0);
	}

}
