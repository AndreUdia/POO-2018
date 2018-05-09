package lsp_violation;

public class Carro extends Veiculo {

    @Override
    public void mudaMarcha(Marcha marcha) {
    	Marcha marchaAtual = getMarcha();
        if(estaMovendoPraFrente(marcha, marchaAtual) || estaMovendoPraTras(marcha, marchaAtual)){
        	parar();
        }
        super.mudaMarcha(marcha);
        
    }
    private boolean estaMovendoPraFrente(Marcha marcha, Marcha marchaAtual) {
    		return estaMovimentando() && Marcha.R.equals(marchaAtual) && Marcha.D.equals(marcha);
    }
    
    private boolean estaMovendoPraTras(Marcha marcha, Marcha marchaAtual) {
		return estaMovimentando() && Marcha.D.equals(marchaAtual) && Marcha.R.equals(marcha);
    }
}

