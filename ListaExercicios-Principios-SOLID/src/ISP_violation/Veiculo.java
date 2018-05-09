package isp_violation;

public abstract class Veiculo implements LigaDesligaMotor {

    private boolean motorLigado;

    public boolean isMotorRodando() {
		return motorLigado;
	}

    public void ligarMotor() {
        motorLigado = true;
    }

    public void desligarMotor() {
        motorLigado = false;
    }

}
