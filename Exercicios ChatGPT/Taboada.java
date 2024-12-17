// 3. Tabuada
// 	• Descrição: Peça ao usuário um número e exiba a tabuada desse número (de 1 a 10).
// 	• Objetivo: Trabalhar com loops (for ou while).
// Desafio extra: Permitir ao usuário escolher até qual número a tabuada será calculada.

import java.util.Scanner;

public class Taboada{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tab, finalTaboada;

        System.out.print("Digite a taboada que deseja: ");
        tab = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o final da taboada: ");
        finalTaboada = scan.nextInt();
        scan.nextLine();

        System.out.println("*****Taboada do " + tab + " até " + finalTaboada + "******");

        for (int i = 1; i <= finalTaboada; i++){
            System.out.println(tab + " x " + i + " = " + (tab * i));
        }
    }
}