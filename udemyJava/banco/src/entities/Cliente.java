package entities;

public class Cliente {

	private int numConta;
	private String nome;
	private double saldo;

	public Cliente(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Cliente(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	//Método para impressão que criei
	public void toPrint() {
		System.out.println("Account " + this.getNumConta() + 
							", Holder: " + this.getNome() + 
							", Balance: $" + String.format("%.2f", this.getSaldo()));
	}
	
	//Método utilizado pelo curso
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $"
				+ String.format("%.2f", saldo);
	}

	public int getNumConta() {
		return this.numConta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void saque(double saque) {
		this.saldo -= (saque + 5);
	}

}
