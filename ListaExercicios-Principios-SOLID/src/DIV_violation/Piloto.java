package div_violation;

public class Piloto {

    private Veiculo carro;

    public Piloto(Veiculo veiculo){
        this.carro = new CarroDeCorrida(100);
    }

    public void aumentaVelocidade(){
        carro.acelerar();
    }
}