package application;
import entities.Cliente;
import java.util.Scanner;
import java.util.Random;

public class Banco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		
		int conta = 1000000 + random.nextInt(9000000);
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Deposito incial: ");
		double deposito = scan.nextDouble();
		
		Cliente user = new Cliente(conta, nome, deposito);
		
		System.out.print("Conta: " + user.getNumConta() + "\nNome: " + user.getNome() + "\nSaldo: R$" + user.getSaldo());

	}

}
