package isp_violation;

public class TestandoVeiculos {

	public static void main(String[] args) {
		Carro a = new Carro();
		Drone b = new Drone();
		
		a.desligarMotor();
		a.ligarMotor();
		a.ligarRadio();
		a.desligarRadio();
		
		b.desligarCamera();
		b.desligarMotor();
		b.ligarCamera();
		b.isMotorRodando();

	}

}
