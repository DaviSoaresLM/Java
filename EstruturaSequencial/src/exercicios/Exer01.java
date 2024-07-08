/*  Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa,conforme exemplos.*/

package exercicios;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.printf("SOMA = %d%n", soma);

        scan.close();
    }
}
