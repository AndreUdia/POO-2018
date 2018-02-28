package lista_27_02_2018;

public class Conta {

    private String titular;
    private double saldo;
    private String cpf;
    private int idade;
    private String endereco;
    
    
    public Conta(String titular) { // dá a opção de passar um argumento.
        this.titular = titular;
    }
    public Conta() {};  // Necessário pois havia sido sobrescrito
    
    /* Resposta Exercício 4 - sem colocar o contrutor publivc Conta(){} sem argumento, a sobrescrita do 
     * construtor com o argumento String passaria a ser o único construtor, ou seja, devemos criar o padrão
     * novamente, para que possa dar a opção entre o construtor sem e com argumento.     *
     */
    

    public double getSaldo() { // Exercício 2
        return this.saldo;
    }
    
    public void setSaldo(double saldo) { // Exercício 2
        this.saldo = saldo;
    }

    public String getTitular() {  // Exercício 2
        return this.titular;
    }

    public void setTitular(String titular) { // Exercício 2
        this.titular = titular;
    }

	public String getCpf() { // Exercício 2
		return cpf;
	}

	public void setCpf(String cpf) { // Exercício 2
		this.cpf = cpf;
	}

	public String getEndereco() { // Exercício 2
		return endereco;
	}

	public void setEndereco(String endereco) { // Exercício 2
		this.endereco = endereco;
	}
	
    
    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.setCpf(cpf);
    }
    
    private void validaCPF(String cpf) {
        // série de regras aqui, falha caso não seja válido
    }


}
