package application;

import entities.Cliente;
import java.util.Scanner;
import java.util.Random;

public class Banco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opcaoDeposito;
		Cliente user;

		System.out.print("Enter Account Number: ");
		int conta = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter Account Holder: ");
		String nome = scan.nextLine();
		System.out.print("Is There an Initial Deposit (y/n)? ");
		opcaoDeposito = scan.nextLine().charAt(0);

		while (Character.toLowerCase(opcaoDeposito) != 'y' && Character.toLowerCase(opcaoDeposito) != 'n') {
			System.out.print("Digite uma opção válida: ");
			opcaoDeposito = scan.nextLine().charAt(0);
		}

		if (Character.toLowerCase(opcaoDeposito) == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = scan.nextDouble();
			user = new Cliente(conta, nome, deposito);
			System.out.println();
		} else {
			user = new Cliente(conta, nome);
		}

		System.out.println("Account data:");
		// user.toPrint();
		System.out.println(user);

		System.out.print("\nEnter a deposit value: ");
		user.deposito(scan.nextDouble());
		System.out.println("Update account data:");
		// user.toPrint();
		System.out.println(user);
		System.out.println();

		System.out.print("Enter a withdrow value: ");
		user.saque(scan.nextDouble());

		System.out.println("Update account data:");
		// user.toPrint();
		System.out.println(user);

		scan.close();
	}

}
