package entities;

public class Cliente {

	private int numConta;
	private String nome;
	private double saldo;

	public Cliente(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Cliente(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
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
