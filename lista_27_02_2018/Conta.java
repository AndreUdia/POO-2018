package lista_27_02_2018;

public class Conta {

    private String titular;
    private double saldo;
    private String cpf;
    private int idade;
    private String endereco;
    
    
    public Conta(String titular) { // d� a op��o de passar um argumento.
        this.titular = titular;
    }
    public Conta() {};  // Necess�rio pois havia sido sobrescrito
    
    /* Resposta Exerc�cio 4 - sem colocar o contrutor publivc Conta(){} sem argumento, a sobrescrita do 
     * construtor com o argumento String passaria a ser o �nico construtor, ou seja, devemos criar o padr�o
     * novamente, para que possa dar a op��o entre o construtor sem e com argumento.     *
     */
    

    public double getSaldo() { // Exerc�cio 2
        return this.saldo;
    }
    
    public void setSaldo(double saldo) { // Exerc�cio 2
        this.saldo = saldo;
    }

    public String getTitular() {  // Exerc�cio 2
        return this.titular;
    }

    public void setTitular(String titular) { // Exerc�cio 2
        this.titular = titular;
    }

	public String getCpf() { // Exerc�cio 2
		return cpf;
	}

	public void setCpf(String cpf) { // Exerc�cio 2
		this.cpf = cpf;
	}

	public String getEndereco() { // Exerc�cio 2
		return endereco;
	}

	public void setEndereco(String endereco) { // Exerc�cio 2
		this.endereco = endereco;
	}
	
    
    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.setCpf(cpf);
    }
    
    private void validaCPF(String cpf) {
        // s�rie de regras aqui, falha caso n�o seja v�lido
    }


}
