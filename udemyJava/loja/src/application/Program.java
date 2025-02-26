package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Procutct #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = scan.nextLine().charAt(0);
			
			while(option != 'c' && option != 'u' && option != 'i') {
				System.out.println("INVALID OPTION! Option valid: (c/u/i): ");
			}
			
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			scan.nextLine();
			
			if(option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();
				scan.nextLine();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if(option == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}

	}

}
