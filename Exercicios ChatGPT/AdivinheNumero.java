// 7. Jogo: Adivinhe o Número
// 	• Descrição: Faça um programa que gera um número aleatório entre 1 e 100 e permite que o usuário tente adivinhar. Diga ao usuário
// se o palpite é muito alto ou baixo.
// 	• Objetivo: Trabalhar com números aleatórios e controle de loops.
// Desafio extra: Exiba o número de tentativas usadas e permita jogar novamente.

import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero{
    public static void main(String[] args) {
        int num = 100;
        int tentativas = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio = random.nextInt(100) + 1;

        while(num > 0){
            System.out.print("Digite um número inteiro entre 0 e 100 para continuar, ou um negativo para Sair: ");
            num = scan.nextInt();
            scan.nextLine();

            if(num >= 0 && num <= 100){
                tentativas++;
                if(num < numAleatorio){
                    System.out.println("O número: " + num + ", é menor que o número aleatório e você já fez " + tentativas + " tentativas!");
                }
                else if(num > numAleatorio){
                    System.out.println("O número: " + num + ", é maior que o número aleatório e você já fez " + tentativas + " tentativas!");
                }
                else if(num == numAleatorio){
                    System.out.println("Parabéns o número aleatório é " + numAleatorio + ", você acertou!");
                    num = -1;
                }
            }
            else if(num > 0){
                System.out.println(num + " não é uma opção válida!");
            }
            else{
                System.out.println("Fechando o programa!");
            }
        }
        scan.close();
    }
}