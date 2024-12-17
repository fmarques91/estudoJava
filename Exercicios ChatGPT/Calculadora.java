/*
    2. Calculadora Simples
	• Descrição: Crie um programa que solicite dois números do usuário e mostre a soma, subtração, multiplicação e divisão.
	• Objetivo: Praticar operações matemáticas e entrada/saída de dados.
    Desafio extra: Adicione um menu para o usuário escolher qual operação realizar.
 */

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcao = 100;

        while (opcao != 0){
            float n1 = 0, n2 = 0;

            System.out.println("****Menu de opções****");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
                System.out.print("Digite o seu primeiro número: ");
                n1 = scan.nextFloat();
                scan.nextLine();
                System.out.print("Digite o seu segundo número: ");
                n2 = scan.nextFloat();
                scan.nextLine();
            }

            String resultado = switch (opcao){
                case 1 -> "A soma do seu cálculo é: " + (n1 + n2);
                case 2 -> "A subtração do seu cálculo é: " + (n1 - n2);
                case 3 -> "A multiplicação do seu cálculo é: " + (n1 * n2);
                case 4 -> {
                    if (n2 == 0){
                        yield "Não é possível dividir um número por 0!";
                    }
                    else{
                        yield "A divisão do seu cálculo é: " + (n1 / n2);
                    }
                }
                case 0 -> "Finalizando o programa!";
                default -> "Opção inválida!";
            };

            System.out.println(resultado);
        }
    }
}