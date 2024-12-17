// 1. Básico: "Hello World!"
// 	• Descrição: Escreva um programa que exibe "Hello, World!" no console.
// 	• Objetivo: Familiarizar-se com a estrutura básica de um programa Java.
// Desafio extra: Modifique o programa para receber o nome do usuário e exibir "Hello, [nome]!".

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Hello World " + nome + "!");
    }
}