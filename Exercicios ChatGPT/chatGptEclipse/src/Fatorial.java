// 8. Fatorial
// 	• Descrição: Solicite ao usuário um número e calcule o fatorial (n! = n × (n-1) × ... × 1).
// 	• Objetivo: Trabalhar com recursão ou loops.
// Desafio extra: Implemente as duas versões (recursiva e iterativa).

import java.util.Scanner;
import javax.swing.*; //Desta forma importa toda a biblioteca do javax.swing, e não só o JOptionPane

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int num = scan.nextInt();
		scan.nextLine();
		int fatorial = num;
		
		for(int i = num - 1; i >= 1; i--) {
			fatorial = fatorial * i;
		}
				
		System.out.println("O resultado do fatorial de " + num + " é: " + fatorial);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		JOptionPane.showMessageDialog(frame, "O resultado do fatorial de " + num + " é: " + fatorial);
	}

}
