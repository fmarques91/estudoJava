// 4. Número Primo
// 	• Descrição: Escreva um programa que verifica se um número fornecido pelo usuário é primo.
// 	• Objetivo: Trabalhar com lógica condicional e loops.
// Desafio extra: Liste todos os números primos em um intervalo fornecido pelo usuário.

import java.util.Scanner;

public class Primo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int iniSeq, finSeq;

        System.out.print("Inicio da sequencia: ");
        iniSeq = scan.nextInt();
        scan.nextLine();

        System.out.print("Final da sequencia: ");
        finSeq = scan.nextInt();
        scan.nextLine();

        for (int i = iniSeq; i <= finSeq; i++){
            int ePrimo = 0;
            for (int j = 1; j <= i; j++){
                if(i % j == 0){
                    ePrimo++;
                }
            }
            if(ePrimo == 2){
                System.out.println(i);
            }
        }

        scan.close();
    }
}