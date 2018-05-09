package lsp_violation;

public class Veiculo {

    private Marcha marcha;
    private boolean estaMovimentando;

    public Marcha getMarcha() {
        return marcha;
    }
    
    public void mover() {
    	estaMovimentando = true;
    }
    
    public void parar() {
    	estaMovimentando = false;
    }

    public boolean estaMovimentando() {
    	return estaMovimentando;
    }
    public void mudaMarcha(final Marcha marcha) {
        this.marcha = marcha;
        System.out.println("marcha mudou" + getMarcha());
    }

}
