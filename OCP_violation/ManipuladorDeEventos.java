public class ManipuladorDeEventos {

    private Carro carro;

    public ManipuladorDeEventos(Carro veiculo) {
        this.carro = veiculo;
    }

    public void mudarModoDirecao(ModoDirecao modoDirecao){
    	System.out.println("O carro foi alterado para o modo de direção " + modoDirecao.getTipoDirecao());
    	carro.setPotencia(modoDirecao.getPotencia());
    	carro.setAlturaSuspencao(modoDirecao.getAlturaSuspensao());
    }
}