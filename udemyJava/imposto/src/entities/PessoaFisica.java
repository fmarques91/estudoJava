package entities;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double taxaPaga() {
		double taxaImposto = 0;
		double descontoSaude = 0;
		
		//Outra forma de se fazer if e else
		//variavel = (getRendaAnual() < 20000.00) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25; 
		//                     CONDIÇÃO                  SE VERDADEIRO				SE FALSO
		
		if (getRendaAnual() < 20000.00) {
			taxaImposto = getRendaAnual() * 0.15;
		} else {
			taxaImposto = getRendaAnual() * 0.25;
		}

		if (gastosSaude > 0) {
			descontoSaude = getGastosSaude() * 0.50;
		}

		return taxaImposto - descontoSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

}
