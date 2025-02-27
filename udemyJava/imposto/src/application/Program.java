package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter de number of tax payers: ");
		int numTax = scan.nextInt();
		scan.nextLine();

		for (int i = 1; i <= numTax; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = scan.next().charAt(0);

			while (ch != 'i' && ch != 'c') {
				System.out.print("Opção Inválida! Opções válidas, (i/c): ");
				ch = scan.next().charAt(0);
			}

			scan.nextLine();
			System.out.print("Name: ");
			String nome = scan.nextLine();
			System.out.print("Anual income: ");
			double anual = scan.nextDouble();
			scan.nextLine();

			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double saude = scan.nextDouble();
				scan.nextLine();
				list.add(new PessoaFisica(nome, anual, saude));
			} else {
				System.out.print("Number employees: ");
				int numFunc = scan.nextInt();
				scan.nextLine();
				list.add(new PessoaJuridica(nome, anual, numFunc));
			}
		}

		System.out.println("\nTAXES PAID:");

		double soma = 0;
		for (Pessoa p : list) {
			System.out.println(p.getNome() + ": $" + String.format("%.2f", p.taxaPaga()));
			soma += p.taxaPaga();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", soma));

		scan.close();
	}

}
