package entities;

public class PessoaJuridica extends Pessoa {

	private int numFuncionario;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public int getNumFuncionario() {
		return this.numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	@Override
	public double taxaPaga() {
		double taxaImposto = 0;

		if (getNumFuncionario() <= 10) {
			taxaImposto = getRendaAnual() * 0.16;
		} else {
			taxaImposto = getRendaAnual() * 0.14;
		}

		return taxaImposto;
	}

}
