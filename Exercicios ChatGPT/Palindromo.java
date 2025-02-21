// 5. Palíndromo
// 	• Descrição: Crie um programa que verifica se uma palavra ou número é um palíndromo (lê-se da mesma forma de trás para frente).
// 	• Objetivo: Praticar manipulação de strings e lógica.
// Desafio extra: Verifique palíndromos ignorando maiúsculas/minúsculas e espaços.

import java.util.Scanner;

public class Palindromo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavraInvertida = "";

        System.out.print("Digite sua palavra ou número: ");
        String palavra = scan.nextLine();

        for(int i = palavra.length() - 1; i >= 0; i--){
            char letra = palavra.charAt(i);
            palavraInvertida += letra;
        }
        
        if(palavraInvertida.toLowerCase().equals(palavra.toLowerCase())) {
        	System.out.println(palavra + " é Palindromo!");
        } else {
        	System.out.println(palavra + " não é Palindromo!");
        }

        scan.close();
    }
}