// 6. Ordenação Simples
// 	• Descrição: Solicite ao usuário três números e exiba-os em ordem crescente.
// 	• Objetivo: Trabalhar com lógica de ordenação.
// Desafio extra: Permita que o usuário insira quantos números desejar e use um array para ordená-los.

import java.util.Scanner;

public class OrdenacaoSimples{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja digitar: ");
        int qtdNum = scan.nextInt();
        scan.nextLine();
        int[] arrayNum = new int[qtdNum];

        for(int i=0; i<qtdNum; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            arrayNum[i] = scan.nextInt();
            scan.nextLine();
        }
        System.out.print("Array Digitado: ");
        for(int num : arrayNum){
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=0; i<qtdNum - 1; i++){
            for(int j=0; j<qtdNum - 1; j++){
                if(arrayNum[j] > arrayNum[j+1]){
                    int temporaria = arrayNum[j];
                    arrayNum[j] = arrayNum[j+1];
                    arrayNum[j+1] = temporaria;
                }
            }
        }

        System.out.print("Array Ordenado de forma crescente: ");
        for(int num : arrayNum){
            System.out.print(num + " ");
        }

        scan.close();
    }
}